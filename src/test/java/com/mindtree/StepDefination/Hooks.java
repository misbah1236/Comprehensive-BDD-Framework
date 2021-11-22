package com.mindtree.StepDefination;

import com.mindtree.exceptions.UtilityException;
import com.mindtree.reusableComponent.Base;
import io.cucumber.java.BeforeAll;

public class Hooks extends Base {

	public Hooks() throws UtilityException, Exception {
		super();
		
	}
	@BeforeAll
	public static void initReport() {
		initializeReport();
	}
	
	
	
	

}
