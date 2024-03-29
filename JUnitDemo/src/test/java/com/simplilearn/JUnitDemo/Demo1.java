package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Demo1 {

	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		assertEquals(str1, str2);
		
		assertTrue(val1 < val2);
		
		assertFalse(val1 > val2);
		
		assertNotNull(str1);
		
		assertNull(str3);
	}

	
}
