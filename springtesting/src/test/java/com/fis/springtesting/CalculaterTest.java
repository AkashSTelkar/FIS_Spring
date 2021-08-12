package com.fis.springtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

//JUnit Testing
//this is the smae how online complilers work and also online contest through HackerEarth, Hackerrank, codeforces, codechief, leetcode etc
class CalculaterTest {

	@Test
	public void testAdd() {
		Calculater cal = new Calculater();
		int actual = cal.add(10, 10);
		assertEquals(20, actual);
	}

	@Test
	public void testSub() {
		Calculater cal = new Calculater();
		int actual = cal.sub(10, 10);
		assertEquals(0, actual);
	}

	@Test
	public void testMul() {
		Calculater cal = new Calculater();
		int actual = cal.mul(10, 10);
		assertEquals(100, actual);
		//assertNotEquals(100, actual);
	}

	@Test
	public void div() {
		Calculater cal = new Calculater();
		int actual = cal.div(10, 10);
		assertEquals(1, actual);
	}

}
