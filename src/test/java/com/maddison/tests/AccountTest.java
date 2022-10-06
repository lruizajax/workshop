package com.maddison.tests;

import static com.maddison.utils.extentreports.ExtentTestManager.startTest;

import java.lang.reflect.Method;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.maddison.utils.listeners.TestListener;

import io.qameta.allure.Description;

@Listeners({ TestListener.class })
//@Epic("Integration Tests")
//@Feature("Account Tests")
public class AccountTest extends BaseTest {

	@Test
	//@Severity(SeverityLevel.NORMAL)
    @Description("Test Description: Update all account information")
	//@Story("updateMiddleName Story")
	public void updateMiddleName(Method method) {
		startTest(method.getName(),"update personal information");
		// more details
	}

	@Test
	//@Severity(SeverityLevel.MINOR)
    @Description("Test Description: View all orders created .")
	//@Story("viewOrders Story")
	public void viewOrders(Method method) {
		startTest(method.getName(),"check status of orders");
		// more details
	}
}
