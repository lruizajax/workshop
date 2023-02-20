package com.maddison.utils.logs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.maddison.pages.AccountPage;
import com.maddison.pages.HomePage;
import com.maddison.pages.LoginPage;
import com.maddison.pages.RegisterPage;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage  homePage;
    protected RegisterPage registerPage;
    protected LoginPage loginPage;
    protected AccountPage accountPage;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setup() {
        Log.info("Tests are starting ... ");
        //driver = WebDriverManager.edgedriver().create();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void initialMethods() {
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new  AccountPage(driver);
    }

    @AfterClass
    public void teardown() {
        Log.info("Tests are ending ... ");
        driver.quit();
    }
}