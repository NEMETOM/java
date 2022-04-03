package com.exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.exercise.ConsonantCounter;

class ConsonantCounterTest {
	
	@Test
	void should_ReturnNumberOfConsonants_When_LowerCaseStringEntered() {
		// given
		String input = "hello";
				
		// when
		int expected = 3;
		int actual = com.exercise.ConsonantCounter.getConsonantCount(input);
		
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	void should_ReturnNumberOfConsonants_When_UpperCaseStringEntered() {
		// given
		String input = "HELLO";
		
		// when
		int expected = 3;
		int actual = com.exercise.ConsonantCounter.getConsonantCount(input);
		
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	void should_ReturnZeroConsonants_When_EmptyStringEntered() {
		// given
		String input = "";
		
		// when
		int expected = 0;
		int actual = com.exercise.ConsonantCounter.getConsonantCount(input);
		
		// then
		assertEquals(expected, actual);
	}

}
