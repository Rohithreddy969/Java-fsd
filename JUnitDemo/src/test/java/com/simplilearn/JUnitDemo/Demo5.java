package com.simplilearn.JUnitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class Demo5 {
	
	@RepeatedTest(5)
	public void Test1() {
		System.out.println("This is Me");
	}
	
	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("Execution")
	public void Test2(TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
	}
	
	@RepeatedTest(5)
	public void Test3(RepetitionInfo repetitionInfo) {
		System.out.println("Current Test count" + repetitionInfo.getCurrentRepetition());
	}

}
