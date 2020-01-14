package com.automation.test.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component("com.automation.test.webdriver.ChromeDriver")
public class Driver {

  private WebDriver driver;

  public WebDriver getDriver(){
    return this.driver;
  }

  public WebDriver initialize() {
    return new org.openqa.selenium.chrome.ChromeDriver();
  }

  public void initializeDriver(){
    WebDriverManager.chromedriver().setup();
    this.driver = new ChromeDriver();
  }

  public void quit(){
    this.driver.quit();
  }

}
