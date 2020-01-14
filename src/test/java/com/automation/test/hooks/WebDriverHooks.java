package com.automation.test.hooks;

import com.automation.test.webdriver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class WebDriverHooks {

  @Autowired
  Driver chromeDriver;

  @Before
  public void before(){
    chromeDriver.initializeDriver();
  }

  @After
  public void after(){
    chromeDriver.quit();
  }
}
