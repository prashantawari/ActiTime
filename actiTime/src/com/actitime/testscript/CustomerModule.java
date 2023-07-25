package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genric.BaseClass;
import com.actitime.genric.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.genric.ListnerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws IOException, InterruptedException, EncryptedDocumentException {
		Reporter.log("createCustomer", true);
		FileLib f = new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 4);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 5);
		HomePage h = new HomePage(driver);
		Thread.sleep(3000);
		h.setTaskTab();
		Thread.sleep(3000);
		TaskListPage t = new TaskListPage(driver);
		t.getAddnewcstmrBtn().click();
		Thread.sleep(2000);
		t.getNewCustomerBtn().click();
		Thread.sleep(2000);
		t.getEnterCustNameTbx().sendKeys(customerName);
		Thread.sleep(2000);
		t.getEnterCustDespTbx().sendKeys(customerDescription);
		Thread.sleep(2000);
		t.getSelectCstmrDD().click();
		Thread.sleep(2000);
		t.getBigBangCompany().click();
		Thread.sleep(2000);
		t.getCreateCustomerBtn().click();
		Thread.sleep(5000);

	}

}
