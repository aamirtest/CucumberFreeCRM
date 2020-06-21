//package stepDefinition;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealStepDefinition {
//
// WebDriver driver;
// String dealNumber;
// String title;
// 
// @Given("^user is already on Login Page$")
// public void user_already_on_login_page(){
// System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Cucumber\\com.cucumberBDD\\Driver\\chromedriver.exe");
// driver = new ChromeDriver();
// driver.get("https://classic.crmpro.com/index.html");
// driver.manage().window().maximize();
// }
// 
// @When("^title of login page is Free CRM$")
// public void title_of_login_page_is_free_CRM(){
// String title = driver.getTitle();
// System.out.println(title);
// Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
// }
// 
// @Then("^user enters username and password$")
// public void user_enters_username_and_password(DataTable credentials){
// List<List<String>> data = credentials.raw();
// driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
// driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
// }
//
// @Then("^user clicks on login button$")
// public void user_clicks_on_login_button() {
// WebElement loginBtn =
// driver.findElement(By.xpath("//input[@type='submit']"));
// JavascriptExecutor js = (JavascriptExecutor)driver;
// js.executeScript("arguments[0].click();", loginBtn);
// }
// 
// @Then("^user is on home page$")
// public void user_is_on_hopme_page(){
// String title = driver.getTitle();
// System.out.println("Home Page title ::"+ title);
// Assert.assertEquals("CRMPRO", title);
// }
// @Then("^user moves to the new deal page$")
// public void user_moves_to_new_contact_page() {
//	driver.switchTo().frame("mainpanel");
//	Actions action = new Actions(driver);
//	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//	driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//	
//	}
// @Then("^user enters deal details$")
// public void user_enters_deal_details(DataTable dealData){
//	 List<List<String>> dealValues =  dealData.raw();
//	 driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//	 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//	 driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//	 driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//	 
// }
// @SuppressWarnings("deprecation")
//@Then("^user clicks on save button$")
//public void user_clicks_on_save_button(){
//	 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//	 driver.findElement(By.cssSelector("fieldset.fieldset:nth-child(2) table:nth-child(4) tbody:nth-child(1) tr:nth-child(1) td:nth-child(1) > input.button:nth-child(1)")).click();
//	 String dealNumber = driver.findElement(By.cssSelector("table.datacard td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(1) > td.datafield")).getText();
//	 System.out.println("Deal Number created :"+dealNumber);
//	 
//	 String title = driver.findElement(By.xpath("/html[1]/body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[2]")).getText();
//	 System.out.println("Title of the deal :"+title);
//	 Assert.assertEquals("testdeal1 ",title);
//	 String amount = driver.findElement(By.cssSelector("table.datacard td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(5) > td.datafield")).getText();
//	 System.out.println("Amount entered :"+amount);
//	 Assert.assertEquals("USD 10,001.00 ", amount);
//	 String probablity = driver.findElement(By.cssSelector("table.datacard td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(6) > td.datafield")).getText();
//	 System.out.println("Probability :"+probablity);
//	 String commission = driver.findElement(By.cssSelector("table.datacard td:nth-child(1) table:nth-child(1) tbody:nth-child(1) tr:nth-child(7) > td.datafield")).getText();	
//	 System.out.println("Commission :"+commission); 
//}
// @Then("^user search for the created deal and verify$")
// public void user_search_for_the_created_deal_and_verify(){
//	 
//	Actions action = new Actions(driver);
//	action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//	driver.findElement(By.xpath("//a[contains(text(),'Full Search Form')]")).click();
//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//		
//	 
//	 WebElement searchField = driver.findElement(By.xpath("//input[@name='search']"));
//	 searchField.click();;
//	 searchField.sendKeys(dealNumber);
//	 driver.findElement(By.cssSelector("tbody:nth-child(1) tr:nth-child(1) td:nth-child(3) div.noprint > input:nth-child(1)")).click();
//	 
//	 String dealNum = driver.findElement(By.cssSelector("td:nth-child(1) table.datacard:nth-child(1) tbody:nth-child(1) tr:nth-child(3) > td.datalistrow:nth-child(1)")).getText();
//	 String dealTitle = driver.findElement(By.cssSelector("td:nth-child(1) table.datacard:nth-child(1) tbody:nth-child(1) tr:nth-child(3) > td.datalistrow:nth-child(2)")).getText();
//	 Assert.assertEquals(dealNumber, dealNum);
//	 Assert.assertEquals(title, dealTitle);
// 
// }
// @Then("^close the browser$")
// public void close_the_browser(){
//	 driver.quit();
// }
//}