package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass
{
@Test
public void createCustomerModule() throws EncryptedDocumentException, IOException, InterruptedException
{
	FileLib f=new FileLib();
	String customerName=f.getExcelData("CreateCustomer", 1, 3);
	String customerDescription=f.getExcelData("CreateCustomer", 1, 4);
	Reporter.log("createCustomer",true);
	HomePage h=new HomePage(driver);
	h.taskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddButton().click();
	t.getNewCust().click();
	t.getEnterCustName().sendKeys(customerName);
	t.getEnterCustDescription().sendKeys(customerDescription);
	t.getSelectCust().click();
	t.getOurCompany().click();
	t.getCreateCust().click();
	Thread.sleep(4000);
}
}
