package com.capgemini.training;

import java.util.Random;

public class RandomNumerGen {

	
	public static String next() {
	    Random r = new Random( System.currentTimeMillis() );
	    return ""+ 10000 + r.nextInt(20000);
	}
}
