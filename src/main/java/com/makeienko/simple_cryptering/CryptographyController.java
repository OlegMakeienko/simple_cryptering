package com.makeienko.simple_cryptering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cryptography")
public class CryptographyController {

    @GetMapping("/encrypt")
    public String encrypt(@RequestParam("text") String text) {
        return Cryptography.encrypt(text);
    }

    @GetMapping("/decrypt")
    public String decrypt(@RequestParam("text") String text) {
        return Cryptography.decrypt(text);
    }
}
