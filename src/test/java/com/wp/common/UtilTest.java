package com.wp.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class UtilTest {

	private Util util = new Util();

	@Test
	void testNoDuplicatesAndNoOfPins() {
		assertTrue(util.generatePinBatch() instanceof Set);
		assertEquals(util.generatePinBatch().size(), 1000);
	}

	@Test
	void testPinLengthAndContent() {
		util.generatePinBatch().forEach(pin -> {
			assertNotNull(pin);
			assertEquals(pin.length(), 4);
			assertTrue(isNumeric(pin));
		});
	}

	private static boolean isNumeric(String pinStr) {
		try {
			Short.parseShort(pinStr);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
