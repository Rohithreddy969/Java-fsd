package com.simplilearn.JUnitDemo;

import static org.junit.Assert.assertNotNull;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConverter;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class Demo10 {

	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	public void test2(@ConvertWith(ArgumentConverter.class) String arg) {
		assertNotNull(TimeUnit.valueOf(arg));
	}
}
