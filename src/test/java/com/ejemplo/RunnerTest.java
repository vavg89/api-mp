package com.ejemplo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.ejemplo.steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@Success"
)
public class RunnerTest extends AbstractTestNGCucumberTests {
}
