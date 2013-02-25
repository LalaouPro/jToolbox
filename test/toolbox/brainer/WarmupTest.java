package toolbox.brainer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for the warm-up class of brainers.
 *
 * @author billy
 */
public class WarmupTest {

    @Before
    public void setUp() {
    }


    @After
    public void tearDown() {
    }


    @Test
    public void testSleepIn() {
        assertTrue(Warmup.sleepIn(false, false));
        assertFalse(Warmup.sleepIn(true, false));
        assertTrue(Warmup.sleepIn(false, true));
        assertTrue(Warmup.sleepIn(true, true));
    }


    @Test
    public void testMonkeyTrouble() {
        assertTrue(Warmup.monkeyTrouble(true, true));
        assertTrue(Warmup.monkeyTrouble(false, false));
        assertFalse(Warmup.monkeyTrouble(true, false));
        assertFalse(Warmup.monkeyTrouble(false, true));
    }


    @Test
    public void testSumDouble() {
        assertEquals(3, Warmup.sumDouble(1, 2));
        assertEquals(5, Warmup.sumDouble(3, 2));
        assertEquals(8, Warmup.sumDouble(2, 2));
        assertEquals(-1, Warmup.sumDouble(-1, 0));
        assertEquals(12, Warmup.sumDouble(3, 3));
        assertEquals(0, Warmup.sumDouble(0, 0));
        assertEquals(1, Warmup.sumDouble(0, 1));
        assertEquals(7, Warmup.sumDouble(3, 4));
    }


    @Test
    public void testDiff21() {
        assertEquals(2, Warmup.diff21(19));
        assertEquals(11, Warmup.diff21(10));
        assertEquals(0, Warmup.diff21(21));
        assertEquals(2, Warmup.diff21(22));
        assertEquals(8, Warmup.diff21(25));
        assertEquals(18, Warmup.diff21(30));
        assertEquals(21, Warmup.diff21(0));
        assertEquals(20, Warmup.diff21(1));
        assertEquals(19, Warmup.diff21(2));
        assertEquals(22, Warmup.diff21(-1));
        assertEquals(23, Warmup.diff21(-2));
        assertEquals(58, Warmup.diff21(50));
    }

}
