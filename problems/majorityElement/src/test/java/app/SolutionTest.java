package app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * inzheneher created on 10/02/2021 inside the package - app
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void majorityElement() {
        assertEquals(2, solution.majorityElement(new int[]{2,2,1,1,1,2,2}));
        assertEquals(3, solution.majorityElement(new int[]{3,2,3}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMajorityElementThrowIllegalArgumentException() {
        solution.majorityElement(new int[]{0,1});
    }
}