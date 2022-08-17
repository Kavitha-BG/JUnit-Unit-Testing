package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	void test() {
		boolean cond = true;
		assertEquals(true, true);
		assertTrue(cond);
		assertFalse(cond);
		//assertNotNull();
		//assertArrayEquals(expected, actual);
	}

}
