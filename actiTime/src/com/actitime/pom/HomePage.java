package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab;
	@FindBy(id="logoutLink")
	private WebElement logout;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setTaskTab() {
		tasksTab.click();
	}
	public void setlogOut() {
		logout.click();
	}

}
