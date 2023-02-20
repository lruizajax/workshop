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
@Feature("Account Tests")
public class AccountTest extends BaseTest {

	@Test
    @Description("Update all account information")
	@Story("Update Middle Name Story")
	@Severity(SeverityLevel.NORMAL)
	public void updateMiddleName(Method method) {
		startTest(method.getName(),"update personal information");
		//implement me
	}

	@Test
    @Description("View all orders created .")
	@Story("View Orders Story")
	@Severity(SeverityLevel.MINOR)
	public void viewOrders(Method method) {
		startTest(method.getName(),"check status of orders");
		//implement me
	}
}
