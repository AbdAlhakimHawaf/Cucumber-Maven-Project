package runner;

import base.TestBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "steps"
      , tags = "@FullRegister"
)
public class    TestRunner extends TestBase {


}
