package com.runnerFile;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.Base;
import com.file.FileReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/feautrfile/LoginScenario.feature", 
                  glue = "com.StepDefinition",
                  tags = {"@regression_run","~@run"},
                  monochrome = true		
		)
public class Runner_File {

	public static WebDriver driver;
	
	
	@BeforeClass
	public static void  setup() throws Throwable {
		
		String browser = FileReadManager.getInstanceFRM().getinstanceCRM().get_Browser();
		driver= Base.browser_Launch(browser);
		
	}
		
}
