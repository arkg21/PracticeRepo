package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage 
{
@FindBy (xpath="//div[text()='Add New']")
private WebElement addButton;

@FindBy(xpath="//div[@class='item createNewCustomer']")
private WebElement newCust;

@FindBy (xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement enterCustName;

@FindBy (xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustDescription;

@FindBy (xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement selectCust;

@FindBy (xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompany;

@FindBy (xpath="//div[text()='Create Customer']")
private WebElement createCust;

public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddButton() {
	return addButton;
}

public WebElement getNewCust() {
	return newCust;
}

public WebElement getEnterCustName() {
	return enterCustName;
}

public WebElement getEnterCustDescription() {
	return enterCustDescription;
}

public WebElement getSelectCust() {
	return selectCust;
}

public WebElement getOurCompany() {
	return ourCompany;
}

public WebElement getCreateCust() {
	return createCust;
}
}
