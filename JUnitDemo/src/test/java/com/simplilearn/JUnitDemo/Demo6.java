package com.simplilearn.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class Demo6 {
	
	@TestFactory
	public Collection<DynamicTest> dynamicTests() {
		return Arrays.asList(
				dynamicTest("Simple Test", () -> assertTrue(true)),
				dynamicTest("Executable Class", new MyExecutable()),
				dynamicTest("Execption Executable", () -> {throw new Exception("Execption Example");}),
				dynamicTest("Simple Test 2", () -> assertTrue(true)));
	}
}

class MyExecutable implements Executable {
	@Override
	public void execute() {
		System.out.println("Dynamic Test");
	}
}