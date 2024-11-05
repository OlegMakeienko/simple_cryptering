package com.makeienko.simple_cryptering;

public class Cryptography {
    private static final int SHIFT = 3; // För Caesar method

    public static String encrypt(String text) {
        if(text == null || text.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for(char character : text.toCharArray()) {
            if(Character.isLetter(character)) {
               char base = Character.isUpperCase(character) ? 'A' : 'a';
               result.append((char) ((character - base + SHIFT) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    public static String decrypt(String text) {
        if(text == null || text.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for(char character : text.toCharArray()) {
            if(Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                // Justering för att hantera negativa resultat
                result.append((char) ((character - base - SHIFT + 26) % 26 + base));
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
