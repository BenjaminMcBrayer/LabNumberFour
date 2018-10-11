package com.TableOfPowers;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class MyTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().muteForSuccessfulTests();

	@Test
	public void writesTextToSystemOut() {
		System.out.print("hello world");
		assertEquals("hello world", systemOutRule.getLog());
	}

}