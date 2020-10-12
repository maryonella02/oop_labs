package com.lab3;


public class Main {
    public static void main(String[] args) {
        String sampleText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

        TextManipulations.countWordsAndSentences(sampleText);

        TextManipulations.countLettersVowelsConsonants(sampleText);

        TextManipulations.showMostOftenWords(sampleText);

    }

}
