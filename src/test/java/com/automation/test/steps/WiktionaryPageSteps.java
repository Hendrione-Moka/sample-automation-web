package com.automation.test.steps;

import com.automation.test.pages.WiktionaryHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class WiktionaryPageSteps {

  @Autowired
  WiktionaryHomePage wiktionaryHomePage;

  @Given("User open Wiktionary home page")
  public void userOpenWiktionaryHomePage() {
    wiktionaryHomePage.openHomePage();
  }

  @When("User search for {string}")
  public void userSearchFor(String keyword) {
    wiktionaryHomePage.inputKeyword(keyword);
  }

  @Then("User should see {string}")
  public void userShouldSee(String result) {
    log.info("Heading: " + wiktionaryHomePage.getTitleHeading());
  }

}
