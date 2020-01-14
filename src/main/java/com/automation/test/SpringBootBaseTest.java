package com.automation.test;

import io.cucumber.java.Before;
import org.springframework.boot.test.context.SpringBootTest;


//@ContextConfiguration(classes = Application.class)
@SpringBootTest(classes = Application.class)
//@RunWith(SpringRunner.class)
public class SpringBootBaseTest {


  @Before
  public void setup_cucumber_spring_context() {
    // Dummy method so cucumber will recognize this class as glue
    // and use its context configuration.
  }
}
