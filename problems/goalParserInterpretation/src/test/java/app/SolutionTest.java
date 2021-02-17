package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * inzheneher created on 12/02/2021 inside the package - app
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void interpret() {
        assertEquals("Goal", solution.interpret("G()(al)"));
    }
}