package app;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * inzheneher created on 17/02/2021 inside the package - app
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void generate() {
        assertEquals(new ArrayList<List<Integer>>(), solution.generate(6));
    }
}