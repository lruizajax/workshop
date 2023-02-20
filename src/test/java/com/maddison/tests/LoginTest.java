package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;
import static org.testng.Assert.assertTrue;

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
@Feature("Login Tests")
public class LoginTest extends BaseTest {

	@Test(priority=2)
	@Description("Login test with username and password.")
	@Story("SingIn Story")
	@Severity(SeverityLevel.BLOCKER)
	public void singIn(Method method) {
		startTest(method.getName(), "do singIn on Madison Store");
		homePage.goToSingIn();
		loginPage.login();
		accountPage.verifyLogin();
	}

	@Test(priority=1)
	@Description("Verify Forgot Your Password?")
	@Story("Forgot Password")
	@Severity(SeverityLevel.TRIVIAL)
	void verifyLinkForgot(Method method) {
		startTest(method.getName(), "Forgot Your Password?");
		homePage.goToSingIn();
		assertTrue(loginPage.verifyForgotPass());
	}
	
	@Test(priority=3)
	@Description("Logout after all transactions.")
	@Story("LogOut Story")
	@Severity(SeverityLevel.MINOR)
	public void logOut(Method method) {
		startTest(method.getName(), "do logOut");
		// all message
	}
}
