package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddFormPage;
import util.BrowserFactory;

public class AddFormTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToAddForm() {

		driver = BrowserFactory.init();

		AddFormPage addform = PageFactory.initElements(driver, AddFormPage.class);
		
		//addform.enterAddElement("DreamGirl1");
		addform.enterCategoryName("Important258");
		addform.enterDueDate("19");
		addform.enterDueDateMonth("Jun");
		addform.enterDueDateMonthYear("2022");
		addform.enterAddCategory("DreamGirl");
		addform.clickOnAddCategoryElement();
		addform.entercolorElement("Burnt Orange");
		addform.clickOnCompleteElement();
	
		
		BrowserFactory.tearDown();
		
	}
}
