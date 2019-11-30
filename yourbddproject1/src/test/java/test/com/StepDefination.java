/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author mnbas
 */
public class StepDefination {
     private static WebDriver driver;
    private String baseUrl="https://www.facebook.com";  
    
    
     
    
    @Given("^user is already on Home Page$")
    
public void user_is_already_on_Home_Page() throws Throwable {
    
    
   System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get(baseUrl);
    
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}

@When("^title of Home Page is Facebook$")
public void title_of_Home_Page_is_Facebook() throws Throwable {
    
     Assert.assertEquals("Facebook", driver.getTitle());
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^user clicks on Findlogin button$")
public void user_clicks_on_Findlogin_button() throws Throwable {
    
     driver.findElement(By.xpath(".//*[@name='q']")).click();
    driver.findElement(By.xpath(".//*[@name='q']")).clear();
    driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("facebook");
  
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
}
    
    
    
    
}
