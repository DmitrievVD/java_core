package lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CipherCaesarTest {

    @Test
    void caesar() {
        CipherCaesar cipherCaesar = new CipherCaesar();
        Assertions.assertEquals("Сткдзф.\"мвм\"жзнвA", cipherCaesar.caesar("Привет, как дела?", 2, true));
    }
}