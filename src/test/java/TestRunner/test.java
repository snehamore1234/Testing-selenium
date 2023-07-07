package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

	(
			features={"src/test/resources/Feature/Amazon.feature"},
			glue={"StepDefination","AppHooks" },
			dryRun= false,
			monochrome=true,
			//tags="@1st" ,
			
			//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			plugin= {"pretty","html:target/test.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					}
				
				
			
			)


public class test {

}
