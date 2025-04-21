package com.example;

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SYMBOLS = "!@#$%&*()_+-=[]?";
    private static final String ALL_ALLOWED = CHAR_LOWER + CHAR_UPPER + NUMBER + SYMBOLS;

    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generatePassword(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Пароль має бути більше 0");
        }

        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(ALL_ALLOWED.length());
            password.append(ALL_ALLOWED.charAt(index));
        }

        return password.toString();
    }
}
