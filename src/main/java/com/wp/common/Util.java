package com.wp.common;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Util {
	
	private static final Random random = new Random();
	private static final String PIN_FORMAT_PATTERN = "%04d";
	private static final short SHORT_10000 = 10000;
	
	public Set<String> generatePinBatch() {
		var randomPins = new HashSet<String>();
		while (randomPins.size() < 1000)
			randomPins.add(String.format(PIN_FORMAT_PATTERN, random.nextInt(SHORT_10000)));
		return randomPins;
	}
}
