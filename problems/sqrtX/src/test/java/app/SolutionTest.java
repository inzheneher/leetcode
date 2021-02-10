package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * inzheneher created on 10/02/2021 inside the package - app
 */
public class SolutionTest {

    private Solution eval;

    @Before
    public void init() {
        eval = new Solution();
    }

    @Test
    public void mySqrt() {
        assertEquals(4, eval.mySqrt(16));
    }
}