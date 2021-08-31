package page;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddFormPage extends BasePage {

	WebDriver driver;

	public AddFormPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[4]/input[1]")
	WebElement ADD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[1]\r\n")
	WebElement CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[2]")
	WebElement DUE_DATE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[3]\r\n")
	WebElement DUE_DATE_MONTH_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[4]\r\n")
	WebElement DUE_DATE_MONTH_YEAR_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")
	WebElement ADD_CATEGORY;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/select[5]")
	WebElement COLOR_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[2]")
	WebElement COMPLETE_ELEMENT;

	public void enterAddElement(String add) {
		ADD_ELEMENT.sendKeys(add + randomGenerator(999));
	}

	public void enterCategoryName(String category) {
		selectDropdown(CATEGORY_ELEMENT, category);
	}

	public void enterDueDate(String duedate) {
		selectDropdown(DUE_DATE_ELEMENT, duedate);
	}

	public void enterDueDateMonth(String duemonth) {
		selectDropdown(DUE_DATE_MONTH_ELEMENT, duemonth);
	}

	public void enterDueDateMonthYear(String dueyear) {
		selectDropdown(DUE_DATE_MONTH_YEAR_ELEMENT, dueyear);
	}

	public void enterAddCategory(String addCategory) {
		ADD_CATEGORY.sendKeys(addCategory + randomGenerator(99));
	}
	
	public void clickOnAddCategoryElement() {
		ADD_CATEGORY_ELEMENT.click();
	}

	public void entercolorElement(String color) {
		selectDropdown(COLOR_ELEMENT, color);
	}

	public void clickOnCompleteElement() {
		COMPLETE_ELEMENT.click();
		waitForElement(driver, 5, COMPLETE_ELEMENT);
	}

	public void performAddForm(String add, String category, String duedate, String duemonth, String dueyear, String addCategory, String color) {
		ADD_ELEMENT.sendKeys(add);
		CATEGORY_ELEMENT.sendKeys(category);
		DUE_DATE_ELEMENT.sendKeys(duedate);
		DUE_DATE_MONTH_ELEMENT.sendKeys(duemonth);
		DUE_DATE_MONTH_YEAR_ELEMENT.sendKeys(dueyear);
		ADD_CATEGORY.sendKeys(addCategory);
		ADD_CATEGORY_ELEMENT.click();
		COLOR_ELEMENT.sendKeys(color);
		COMPLETE_ELEMENT.click();
	}
	
	//*[@id="todos-content"]/form/ul/li[1]/input
	//html/body/div[3]/input[3]

	String before_Xpath = "//*[@id=";
	String after_Xpath = "]input";
	String after_Xpath_save_button = "//html/body/div[3]/input[3]";

		
	  public void verifyEnteredName(String name) {
	  
	  for (int i = 1; i <= 10; i++) { 
		  String name1 = driver.findElement(By.xpath(before_Xpath + i + after_Xpath)).getText();
	  System.out.println(name1); 
	   Assert.assertEquals(name1, name1, "Entered name already exits!!"); 
	   break;
	  }
	  if (name.contains(name)) {
	  System.out.println("Entered name already exist!!!"); 
	  //driver.findElement(By.xpath("//tbody/tr[" + after_xpath + "]/td[3]/following-sibling::td[4]/a[2]")).click(); 
	  //driver.findElement(By.xpath(before_xpath + after_xpath + after_xpath + "/following-sibling::td[4]/a[2]")).click();
	  driver.findElement(By.xpath(before_Xpath + after_Xpath + after_Xpath_save_button )).click();
	  driver.findElement(By.xpath("html/body/div[3]/input[3]")).click(); 
	  }
	  //break; 
	  }
	  
}