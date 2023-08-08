package com.simplilearn.JUnitDemo;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Demo8 {
	
	@ParameterizedTest
	@CsvSource({"test, TEST", "monDay, MONDAY", "july, JULY"})
	public void test1(String actual, String expected) {
		String actualValue = actual.toLowerCase();
		String expectedValue = expected.toLowerCase();
		assertEquals(actualValue, expectedValue);
	}

}
