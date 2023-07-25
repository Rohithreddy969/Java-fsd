package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Demo3 {
	
	@Test
	public void test1() {
		Assumptions.assumeTrue("abc".contains("z"));
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		Assumptions.assumingThat("abc".contains("a"),()-> {
			System.out.println("Friday");
		});
	}

}
