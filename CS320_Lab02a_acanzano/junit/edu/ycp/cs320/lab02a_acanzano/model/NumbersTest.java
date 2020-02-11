package edu.ycp.cs320.lab02a_acanzano.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_acanzano.model.GuessingGame;

public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSetFirst() {
		model.setFirst(1);
		assertEquals(1, model.getFirst());
	}
	
	@SuppressWarnings("deprecation")
	public void testSetSecond() {
		model.setSecond(1);
		assertEquals(1, model.getSecond());
	}
	
	@SuppressWarnings("deprecation")
	public void testSetThird() {
		model.setThird(1);
		assertEquals(1, model.getThird());
	}
}
