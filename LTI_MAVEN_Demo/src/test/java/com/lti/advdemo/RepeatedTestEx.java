package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestEx {
	
    @DisplayName("repeat test for 5 times")
    @RepeatedTest(5)
	public void shouldRepeat() {
		{
			int a=10,b=20;
			assertEquals(200,(a*b),"should repeat- passed");
		}
	}
}
