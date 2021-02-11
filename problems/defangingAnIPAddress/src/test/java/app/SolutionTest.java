package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * inzheneher created on 11/02/2021 inside the package - app
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void defangingIPaddr() {
        assertEquals("1[.]1[.]1[.]1", solution.defangingIPaddr("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", solution.defangingIPaddr("255.100.50.0"));
    }
}