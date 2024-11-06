package com.makeienko.simple_cryptering;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    @Test
    @DisplayName("Correctly handles empty string by returning an empty string (encryption)")
    public void testEncryptWithEmptyString() {
        assertEquals("", Cryptography.encrypt(""));
    }

    @Test
    @DisplayName("Correctly handles empty string by returning an empty string (decryption)")
    public void testDecryptWithEmptyString() {
        assertEquals("", Cryptography.decrypt(""));
    }

    @Test
    @DisplayName("Correctly handles null value by returning an empty string (encryption)")
    public void testEncryptWithNull() {
        assertEquals("", Cryptography.encrypt(null));
    }

    @Test
    @DisplayName("Correctly handles null value by returning an empty string (decryption)")
    public void testDecryptWithNull() {
        assertEquals("", Cryptography.decrypt(null));
    }

    @Test
    @DisplayName("Leaves non-alphabetic characters in the encrypted text unchanged, only English letters are encrypted")
    public void testEncryptWithNonAlphabeticCharacters() {
        String input = "Hello, World! 123";
        String expectedOutput = "Khoor, Zruog! 123";
        assertEquals(expectedOutput, Cryptography.encrypt(input));
    }

    @Test
    @DisplayName("Leaves non-alphabetic characters in the encrypted text unchanged, only English letters are decrypted")
    public void testDecryptWithNonAlphabeticCharacters() {
        String input = "Khoor, Zruog! 123";
        String expectedOutput = "Hello, World! 123";
        assertEquals(expectedOutput, Cryptography.decrypt(input));
    }

    @Test
    @DisplayName("Encrypts letters correctly with a Caesar shift of 3 steps")
    public void testEncryptWithAlphabeticCharacters() {
        String input = "ABCxyz";
        String expectedOutput = "DEFabc";
        assertEquals(expectedOutput, Cryptography.encrypt(input));
    }

    @Test
    @DisplayName("Decrypts letters correctly with a Caesar shift of 3 steps")
    public void testDecryptWithAlphabeticCharacters() {
        String input = "DEFabc";
        String expectedOutput = "ABCxyz";
        assertEquals(expectedOutput, Cryptography.decrypt(input));
    }

    @Test
    @DisplayName("Correctly handles mixed upper and lower case in long text when encrypting")
    public void testEncryptWithMixedCase() {
        String input = "Caesar, Caesar: Caesar Caesar Caesar. Caesar Caesar";
        String expectedOutput = "Fdhvdu, Fdhvdu: Fdhvdu Fdhvdu Fdhvdu. Fdhvdu Fdhvdu";
        assertEquals(expectedOutput, Cryptography.encrypt(input));
    }

    @Test
    @DisplayName("Correctly handles mixed upper and lower case in long text when decrypting")
    public void testDecryptWithMixedCase() {
        String input = "Fdhvdu, Fdhvdu: Fdhvdu Fdhvdu Fdhvdu. Fdhvdu Fdhvdu";
        String expectedOutput = "Caesar, Caesar: Caesar Caesar Caesar. Caesar Caesar";
        assertEquals(expectedOutput, Cryptography.decrypt(input));
    }


}