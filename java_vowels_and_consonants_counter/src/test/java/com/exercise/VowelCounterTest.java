package com.exercise;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.exercise.VowelCounter;
import com.exercise.ConsonantCounter;

class VowelCounterTest {

	@Test
	void should_ReturnWordAndNumberOfVowels_When_LessThanFourStringsEntered() {
		// given
		String[] args = {"HelloSir", "How"};
		
		// when
		String expected = "[CountResult{word='HelloSir', vowelCount=3, consonantCount=null}, CountResult{word='How', vowelCount=1, consonantCount=null}]"; 
		String actual = com.exercise.VowelCounter.getVowelListWithCount(args).toString();
		
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	void should_ReturnWordAndNumberOfVowels_When_FourStringsEntered() {
		
		// This test fails because it is not allowed to enter 4 strings
		
		// given
		String[] args = {"T", "E", "S", "T"};
				
		// when
		String expected = "[CountResult{word='T', vowelCount=0}, CountResult{word='E', vowelCount=1}, CountResult{word='S', vowelCount=0}, CountResult{word='T', vowelCount=0}]"; 
		String actual = com.exercise.VowelCounter.getVowelListWithCount(args).toString();
				
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	void should_ReturnNull_When_MoreThanFourStringsEntered() {
		// given
		String[] args = {"Hello", "Sir", "How", "Are", "You"};
		
		// when
		List<CountResult> actual = com.exercise.VowelCounter.getVowelListWithCount(args);
		
		// then
		assertNull(actual);
	}
	
	@Test
	void should_ReturnNumberOfVowels_When_LowerCaseStringEntered() {
		// given
		String input = "hello";
		
		// when
		int expected = 2;
		int actual = com.exercise.VowelCounter.getVowelCount(input);
		
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	void should_ReturnNumberOfVowels_When_UpperCaseStringEntered() {
		
		// This case fails because the code does not handle upper case
		
		// given
		String input = "HELLO";
		
		// when
		int expected = 2;
		int actual = com.exercise.VowelCounter.getVowelCount(input);
		
		// then
		assertEquals(expected, actual);
	}
	
	@Test
	void should_ReturnZeroVowels_When_EmptyStringEntered() {
		// given
		String input = "";
		
		// when
		int expected = 0;
		int actual = com.exercise.VowelCounter.getVowelCount(input);
		
		// then
		assertEquals(expected, actual);
	}

}
