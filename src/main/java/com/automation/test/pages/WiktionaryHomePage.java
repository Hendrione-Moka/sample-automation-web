package com.automation.test.pages;

import com.automation.test.webdriver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com.mokapos.seit.automation.core.pages.WiktionaryHomePage")
public class WiktionaryHomePage {

  @Autowired
  Driver chromeDriver;

  public void openHomePage() {
    chromeDriver.getDriver().get("https://en.wiktionary.org/wiki/");
  }

  public void inputKeyword(String keyword) {
    chromeDriver.getDriver().findElement(By.id("searchInput")).sendKeys(keyword + Keys.ENTER);
  }

  public String getTitleHeading() {
    return chromeDriver.getDriver().findElement(By.id("firstHeading")).getText();
  }

}
