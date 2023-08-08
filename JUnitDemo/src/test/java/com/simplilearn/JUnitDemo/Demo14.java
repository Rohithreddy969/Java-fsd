package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@ExcludeTags("production")
public class Demo14 {
	@Test
	@Tag("deveopment")
	@Tag("production")
	public void test1() {
		
	}
	@Test
	@Tag("production")
	public void test2() {
		
	}
	@Test
	@Tag("development")
	public void test3() {
		
	}
	
}
