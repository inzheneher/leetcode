package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * inzheneher created on 18/02/2021 inside the package - app
 */
public class SolutionTest {

    private Solution solution;
    private String validString;
    private String invalidString;

    @Before
    public void init() {
        solution = new Solution();
        validString = "()[]{}";
        invalidString = "([)}";
    }

    @Test
    public void isValid() {
        assertTrue(solution.isValid(validString));
        assertFalse(solution.isValid(invalidString));
    }
}