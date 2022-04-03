package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsonantCounter {
	
    static Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[^aeiouAEIOU]")).count();
    }

}
