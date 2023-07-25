package com.simplilearn.JUnitDemo;

public interface Dmo4 {
	
	public void day();
	
	public default void month() {
		System.out.println("It is July");
	}
}
