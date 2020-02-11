package edu.ycp.cs320.lab02a_acanzano.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_acanzano.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		model.setFirst(1);
		model.setSecond(2);
		model.setThird(3);

		controller.setModel(model);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testadd() {
		assertEquals(6,model.getFirst() + model.getSecond() + model.getThird() );
	}
	@SuppressWarnings("deprecation")
	public void testmultiply() {
		assertEquals(2, model.getFirst() * model.getSecond());

	}
}
