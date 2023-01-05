package com.theceshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PalindromeServiceTest {

    private PalindromeService palindromeService;

    @BeforeEach
    public void setUp() {
        palindromeService = new PalindromeService();
    }

    @Test
    public void givenInput_whenIsNull_shouldReturnFalse() {
        boolean result = palindromeService.checkPalindrome(null);

        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenEmptyString_whenCheckPalindrome_shouldReturnTrue() {
        String input = "";

        boolean result = palindromeService.checkPalindrome(input);

        Assertions.assertEquals(true, result);

        input = "    ";

        result = palindromeService.checkPalindrome(input);

        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenAnyString_whenIsPalindrome_shouldReturnTrue() {
        String input = "ada";

        boolean result = palindromeService.checkPalindrome(input);

        Assertions.assertEquals(true, result);

        input = "a";

        result = palindromeService.checkPalindrome(input);

        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenAnyString_whenIsNotPalindrome_shouldReturnFalse() {
        String input = "abc";

        boolean result = palindromeService.checkPalindrome(input);

        Assertions.assertEquals(false, result);
    }
}
