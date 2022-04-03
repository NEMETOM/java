package com.exercise;

public class Main {

    public static void main(String[] args) {
        VowelCounter vowCounter = new VowelCounter();
        ConsonantCounter consCounter = new ConsonantCounter(); 
        var resultVowels = vowCounter.getVowelListWithCount(args);
        System.out.println(">>> Vowels:\n"+resultVowels);
    }
}
