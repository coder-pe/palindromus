package com.theceshop.service;

public class PalindromeService {
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        if (input.isBlank()) {
            return true;
        }

        int n = input.length() - 1;

        for (int i = 0; i <= n; i++) {
            if (input.charAt(i) != input.charAt(n - i)) {
                return false;
            }
        }

        return true;
    }
}
