package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sadham\\Selenium-workspace\\CucumberSampleProject\\src\\test\\java\\feature",
glue= {"com.app.stepdefinition"},
dryRun = false,
monochrome = true,
publish = true)
public class Runner {

}
