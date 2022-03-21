/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dictionary.Dictionary;
import java.util.List;
import stemmerindo.Stemmer;

public class StemmerIndoMain {

    public static void main(String[] args) throws Exception {
        // contoh penggunaannya
        // List dictionary = new Dictionary().read().getDictionaryData();
        List dictionary = new Dictionary().read("src/dictionary/dictionaries.properties").getDictionaryData(); // use
                                                                                                               // specific
                                                                                                               // path
        Stemmer stemmer = new Stemmer(dictionary);
        String word1 = "mempertanggungjawabkannya";
        String word2 = "terang-terangan";
        String sentence1 = "aku tidak mencintaimu";
        String sentence2 = sentence1
                + " apa adanya, jadi pergilah kamu pergi, aku sudah tidak mau melihatmu lagi, galau deh cyn";

        println("\nEXAMPLE 1: " + word1 + " = " + stemmer.getRootWord(word1));
        println("\nEXAMPLE 2: " + word2 + " = " + stemmer.getRootWord(word2));
        println("\nEXAMPLE 3: " + sentence1 + ":");
        for (String word : sentence1.split(" ")) {
            println("\t" + word + " = " + stemmer.getRootWord(word));
        }
        println("\nEXAMPLE 4: " + sentence2 + ":");
        sentence2 = removeCharacter(sentence2); // clean some special character on your sentence
        for (String word : sentence2.split(" ")) {
            println("\t" + word + " = " + stemmer.getRootWord(word));
        }
    }

    static String removeCharacter(String word) {
        // feel free to add special character that you need to removed
        return word.replaceAll("[-+.^:,]", "");
    }

    static void println(String mssg) {
        System.out.println(mssg);
    }
}
