package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main permutation = new Main();

    @Test
    void permutation123() {
        int result = permutation.permutation(123);
        assertEquals(132, result);
    }

    @Test
    void permutation132() {
        int result = permutation.permutation(132);
        assertEquals(213, result);
    }
    @Test
    void permutation48975() {
        int result = permutation.permutation(48975);
        assertEquals(49578, result);
    }

}