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
        String input = "Hello, World! 123";
        String expectedOutput = "Khoor, Zruog! 123";
        assertEquals(expectedOutput, Cryptography.decrypt(input));
    }
}