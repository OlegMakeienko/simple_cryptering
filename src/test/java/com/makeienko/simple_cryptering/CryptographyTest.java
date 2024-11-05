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
}