package com.lab3;


import java.util.*;

public class TextManipulations {

    public static void countLettersVowelsConsonants(String str)
    {
        int vowels = 0, consonants = 0, letters = 0;

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); ++i)
        {
            char ch = str.charAt(i);
             if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                ++vowels;
                ++letters;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
                ++letters;
            }

        }
        System.out.println("Letters: " + letters);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

    }


    public static void countWordsAndSentences(String str)  {


        int countWord = 0;
        int sentenceCount = 0;


        if(str == null || str.isEmpty())
            System.out.println("String is empty" );
        else {


            String[] wordList = str.split("\\s+");

            countWord += wordList.length;


            String[] sentenceList = str.split("[.!?]+");

            sentenceCount += sentenceList.length;


            System.out.println("Total number of words = " + countWord);

            System.out.println("Total number of sentences = " + sentenceCount);

        }
    }

    public static void showMostOftenWords(String str){
        Map<String, Integer> wordsMap = new HashMap<>();
        String longest = "";

        if(str == null || str.isEmpty())
            System.out.println("String is empty" );
        else {
            for (String word : str.split("\\s+")) {
                if (wordsMap.containsKey(word)) {
                    int count = wordsMap.get(word);
                    wordsMap.put(word, ++count);
                } else {
                    wordsMap.put(word, 1);
                }

                if (word.length() > longest.length()) {
                    longest = word;
                }
            }

            System.out.println("The longest word is " + longest);

            List<Map.Entry<String, Integer>> values = new ArrayList<>(wordsMap.entrySet());
            values.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
            int words = 0;

            System.out.println("Top 5 used words:");
            for (Map.Entry<String, Integer> value : values) {
                System.out.println(value);
                words++;
                if (words == 5)
                    break;
            }
        }
    }
}




