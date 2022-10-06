package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.maddison.utils.listeners.TestListener;

import io.qameta.allure.Description;

@Listeners({ TestListener.class })
//@Epic("Smoke Tests")
//@Feature("Register Tests")
public class RegisterTest extends BaseTest {

	@Test
	//@Severity(SeverityLevel.BLOCKER)
    @Description("Test Description:create a new account to login in Maddison Store.")
	//@Story("register Story")
	public void register(Method method) {
		startTest(method.getName(),"Create new Account");
		homePage.goToRegister();
		registerPage.createNewAccount();
	}

}
