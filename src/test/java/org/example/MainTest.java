package org.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void TestHypothenuse() {
        Assertions.assertEquals(Main.hypothenuse(10,20),22.360679774997898);
    }
    
    
}


