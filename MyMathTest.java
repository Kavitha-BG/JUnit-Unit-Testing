package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MyMathTest {
	MyMath myMath = new MyMath();
	//MyMath.sum
	//1,2,3->6
	
	@Test
	public void sumwith3numbers() {
		assertEquals(6, myMath.sum(new int[] {1, 2, 3}));
	}
	
	public void sumwith1numbers() {
		assertEquals(6, myMath.sum(new int[] {3}));
	}

}
