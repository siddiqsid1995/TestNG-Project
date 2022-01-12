package org.test;

import org.testng.annotations.Test;

public class B {

	@Test
	private void tc11() {

		System.out.println("Test 11 "+Thread.currentThread().getId());
	}

	@Test
	private void tc13() {

		System.out.println("Test 13 "+Thread.currentThread().getId());
	}

	@Test
	private void tc12() {

		System.out.println("Test 12 "+Thread.currentThread().getId());
	}

}
