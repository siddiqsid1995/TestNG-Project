package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {

	@Test
	private void tc1() {

		System.out.println("Test 1 ");
	}

	@Test
	private void tc3() {

		Assert.assertTrue(false);
		System.out.println("Test 3 ");
	}

	@Test
	private void tc2() {

		System.out.println("Test 2 ");
	}

	@Test
	private void tc5() {
		Assert.assertTrue(false);
		System.out.println("Test 5 ");
	}

	@Test
	private void tc4() {

		System.out.println("Test 4");
	}

}
