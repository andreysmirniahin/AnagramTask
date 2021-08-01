package controller.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramCheckerSortingTest {

    AnagramCheckerSorting anagramCheckerSorting;
    String firstString;
    String secondString;

    @BeforeEach
    void setUp() {
        anagramCheckerSorting = new AnagramCheckerSorting();
    }

    @Test
    void isAnagramCorrectWorkEqualsResult() {
        firstString = "McDonald's restaurants";
        secondString = "Uncle Sam's standard rot";
        assertEquals(true, anagramCheckerSorting.isAnagram(firstString, secondString));
    }

    @Test
    void isAnagramCorrectWorkNotEqualsResult() {
        firstString = "Church of Scientology";
        secondString = "rich-chosen goofy cult";
        assertEquals(false, anagramCheckerSorting.isAnagram(firstString, secondString));
    }

    @Test
    void isAnagramGetNullAsFirstParameter() {
        firstString = null;
        secondString = "rich-chosen goofy cult";
        assertEquals(false, anagramCheckerSorting.isAnagram(firstString, secondString));
    }

    @Test
    void isAnagramGetNullAsBothParameters() {
        firstString = null;
        secondString = null;
        assertEquals(false, anagramCheckerSorting.isAnagram(firstString, secondString));
    }

}