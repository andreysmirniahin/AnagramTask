package controller.impl;

import controller.interfaces.Anagram;

import java.util.Arrays;

/**
 * Implementation of Anagram interface. In a current implementation in both of strings removed all spaces after
 * that strings formatted to the char arrays and at the final char arrays are sorted.
 *
 * Time complexity is O(n log n)
 *
 * @author Andrii Smirniahin
 */

public class AnagramCheckerSorting implements Anagram {

    @Override
    public boolean isAnagram(String firstString, String secondString) {
        if (firstString == null || secondString == null) {
            return false;
        }

        String formattedFirstString = firstString.replaceAll("\\s", "").toLowerCase();
        String formattedSecondString = secondString.replaceAll("\\s", "").toLowerCase();

        if (formattedFirstString.length() != formattedSecondString.length()) {
            return false;
        }

        char[] firstStringCharArray = formattedFirstString.toCharArray();
        char[] secondStringCharArray = formattedSecondString.toCharArray();

        Arrays.sort(firstStringCharArray);
        Arrays.sort(secondStringCharArray);

        return Arrays.equals(firstStringCharArray, secondStringCharArray);
    }

}
