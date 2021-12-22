package com.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsHWTest {

	@Test
	public void addTest() {
	JenkinsHW jc = new JenkinsHW();
	assertEquals(10,jc.addNumbers(5, 5));
	}

	@Test
	public void subTest() {
	JenkinsHW jc = new JenkinsHW();
	assertEquals(5,jc.subNumbers(10, 5));
	}

}
