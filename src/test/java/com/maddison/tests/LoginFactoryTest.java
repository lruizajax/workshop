package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.maddison.utils.listeners.TestListener;

import io.qameta.allure.Description;

@Listeners({ TestListener.class })
//@Epic("Oaut Module")
//@Feature("Login Tests")
public class LoginFactoryTest extends BaseTest {

	@Test
	//@Severity(SeverityLevel.BLOCKER)
    @Description("Test Description: Login test with username and password.")
	//@Story("singIn Story")
	public void singIn(Method method) {
		startTest(method.getName(),"do singIn");
		homePage.goToSingIn();
		loginPage.login();
		accountPage.verifyLogin();
	}

	@Test
	//@Severity(SeverityLevel.MINOR)
    @Description("Test Description: Logout after all transactions.")
	//@Story("logOut Story")
	public void logOut(Method method) {
		startTest(method.getName(),"do logOut");
		// all message
	}
}
