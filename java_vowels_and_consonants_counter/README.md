# Vowels and Consonants counter
## How to test
All test files are available under "*src\java\com\exercise"
Tests can be executed using jUnit testing framework

## Observations

[1]
com.exercise.VowelCounter.getVowelListWithCount

It should probably change to "public static" so that it could be testable

## Bug(s)
User is not allowed to enter 4 strings at once

In VowelCounter.java

Condition in the following function should be "(args.length > 4)" if we want to allow 4 strings to be entered

    public static List<CountResult> getVowelListWithCount(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> vowelCount = new ArrayList<>();
            argumentList.forEach(argument -> vowelCount.add(new CountResult(argument, getVowelCount(argument))));
            return vowelCount;
        }
    }
## Improvements
Refactor "CountResult.java"  and "Main.java" to incorporate consonants counter
Handle both lower and upper case when filtering vowels or consonants
