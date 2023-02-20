package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;
import org.testng.annotations.Test;

import com.maddison.utils.logs.BaseTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Epic("Madison Store Online")
@Feature("Register Tests")
public class RegisterTest extends BaseTest {

	@Test
    @Description("Create a new account to login in Maddison Store.")
	@Story("Register Story")
	@Severity(SeverityLevel.CRITICAL)
	public void registerNewCustomer(Method method) {
		startTest(method.getName(),"Create new Account");
		homePage.goToRegister();
		registerPage.createNewAccount();
	}

}
