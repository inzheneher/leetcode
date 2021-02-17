package app;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * inzheneher created on 17/02/2021 inside the package - app
 */
public class SolutionTest {

    private Solution solution;
    private List<List<Integer>> testArrayWithOneRow;
    private List<List<Integer>> testArrayWithTwoRows;
    private List<List<Integer>> testArrayWithFiveRows;

    @Before
    public void init() {
        solution = new Solution();
        testArrayWithOneRow = Collections.singletonList(Collections.singletonList(1));
        testArrayWithTwoRows = Arrays.asList(Collections.singletonList(1), Arrays.asList(1, 1));
        testArrayWithFiveRows = Arrays.asList(
                Collections.singletonList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1), Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1));
    }

    @Test
    public void generate() {
        assertEquals(testArrayWithOneRow, solution.generate(1));
        assertEquals(testArrayWithTwoRows, solution.generate(2));
        assertEquals(testArrayWithFiveRows, solution.generate(5));
    }
}