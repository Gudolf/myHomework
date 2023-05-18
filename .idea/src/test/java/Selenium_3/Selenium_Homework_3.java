package Selenium_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Selenium_Homework_3 {

    @Test
    public void testCase1_2() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //Test Case 1

        WebElement username = driver.findElement(By.name("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.name("login-button"));
        button.click();

        WebElement sortContainer = driver.findElement(By.className("product_sort_container"));
        selectBy(sortContainer,"Name (Z to A)","text");


        List<WebElement> actualSortProducts = driver.findElements(By.className("inventory_item_name"));
        List<String> expectedSortProducts = Arrays.asList("Test.allTheThings() T-Shirt (Red)","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Sauce Labs Bike Light","Sauce Labs Backpack");
        Collections.sort(expectedSortProducts);
        Collections.reverse(expectedSortProducts);
        for (int i = 0; i < actualSortProducts.size(); i++){
            Assert.assertEquals(actualSortProducts.get(i).getText().trim(),expectedSortProducts.get(i));
        }

        //Test Case 2

        WebElement sortContainerLowToHigh = driver.findElement(By.className("product_sort_container"));
        selectBy(sortContainerLowToHigh,"Price (low to high)","text");

        List<WebElement> actualPrice = driver.findElements(By.className("inventory_item_price"));
        List<Double> expectedPrice = Arrays.asList(7.99,9.99,15.99,15.99,49.99,29.99);
        Collections.sort(expectedPrice);
        for (int i = 0; i < actualPrice.size();i++){
            Assert.assertEquals(Double.parseDouble(actualPrice.get(i).getText().trim().substring(1)),expectedPrice.get(i));
        }

        //Task

        WebElement burgerButton = driver.findElement(By.id("react-burger-menu-btn"));
        burgerButton.click();

        WebElement linkLogout = driver.findElement(By.cssSelector("#logout_sidebar_link"));
        Thread.sleep(1000);
        linkLogout.click();

        WebElement title = driver.findElement(By.className("login_logo"));
        String actualTitle = title.getText().trim();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(actualTitle,expectedTitle);

        driver.navigate().back();
        Assert.assertEquals(actualTitle,expectedTitle);


    }
    @Test
    public void testCase3() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/Select#");

        WebElement dropDown = driver.findElement(By.id("countriesSingle"));
        Select selectDropBox = new Select(dropDown);
        String actualIndia = selectDropBox.getFirstSelectedOption().getText().trim();
        String expectedIndia = "India";
        Assert.assertEquals(actualIndia,expectedIndia);

        List<WebElement> actualValue = selectDropBox.getOptions();
        int count=0;
        for(WebElement element : actualValue){
            count++;
        }
        Assert.assertEquals(count,4);

        List<String> expectedValue = Arrays.asList("India","United states of America","China","England");
        for (int i = 0; i< actualValue.size(); i++){
            Assert.assertEquals(actualValue.get(i).getText().trim(),expectedValue.get(i));
        }

        Thread.sleep(3000);
        selectBy(dropDown,"2","index");
        Thread.sleep(3000);
        selectBy(dropDown,"england","value");
        Thread.sleep(3000);
        selectBy(dropDown,"United states of America","text");

    }

    @Test
    public void testCase4() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://uitestpractice.com/Students/Select#");

        WebElement multipleElement = driver.findElement(By.xpath("//select[@id='countriesMultiple']"));
        Select selectMultiple = new Select(multipleElement);

        List<WebElement> actualMultipleValue = selectMultiple.getOptions();
        List<String> expectedValue = Arrays.asList("India","United states of America","China","England");
        for (int i = 0; i< actualMultipleValue.size(); i++){
            Assert.assertEquals(actualMultipleValue.get(i).getText().trim(),expectedValue.get(i));
        }

        selectBy(multipleElement,"China","text");
        selectBy(multipleElement,"England","text");

        WebElement actualResult = driver.findElement(By.xpath("//div[@id='result']"));
        String expectedResult = "China England";
        Assert.assertEquals(actualResult.getText().trim(),expectedResult);

        Thread.sleep(3000);
        selectMultiple.deselectAll();

        Thread.sleep(3000);
        selectBy(multipleElement,"India","text");
        selectBy(multipleElement,"United states of America","text");
        selectBy(multipleElement,"China","text");
        selectBy(multipleElement,"England","text");

        expectedResult = "India United states of America China England";
        Assert.assertEquals(actualResult.getText().trim(),expectedResult);

        Thread.sleep(3000);
        selectMultiple.deselectByIndex(2);
        selectMultiple.deselectByValue("england");

    }


    public static void selectBy(WebElement location, String value, String methodName){

        Select select = new Select(location);

        switch (methodName){
            case "text":
                select.selectByVisibleText(value);
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                System.out.println("Method name is not available, use text,value or index");
        }
    }

}
