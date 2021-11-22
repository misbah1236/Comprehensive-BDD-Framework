package com.mindtree.runner;
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	//@RunWith(Cucumber.class)

	@CucumberOptions(features ="features",dryRun = false,glue = {"com.mindtree.StepDefination"})
	public class Runner extends AbstractTestNGCucumberTests {

	}

