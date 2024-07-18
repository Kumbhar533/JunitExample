package com.junit.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest3 {

	// Assertion means : Assertion means validating the actual result with the
	// excepted result

//	@Test
//	public void test1() {
//		int a[] = { 3, 2, 2, 1 };
//
//		int b[] = { 3, 2, 2, 1 };

//		Assertions.assertArrayEquals(a, b); // if two arrays are same
//
//		String s1 = new String("hello");
//
//		String s2 = new String("hello");
//
//		Assertions.assertSame(s1, s2); // if checks both refers to same the object and in this case both not refer the
//										// same object return false
//
//		Assertions.assertEquals(s1, s2); // it check both object are same or not
//
//		// here we can check the two lists are same or not
//
//		List<Integer> on = Arrays.asList(1, 334, 5, 6, 7);
//
//		List<Integer> ob = Arrays.asList(1, 334, 5, 6, 7);
//
//		Assertions.assertIterableEquals(on, ob);
//
//	}
//
	@Test
	public void test2() {
		Assertions.assertThrows(RuntimeException.class, () -> {
			throw new RuntimeException("This is run time exception!"); // this method checks the is this type of
																		// exception is
																		// same as we
		});

	}

}
