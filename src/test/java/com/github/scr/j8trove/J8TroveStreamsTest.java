package com.github.scr.j8trove;

import gnu.trove.list.TDoubleList;
import gnu.trove.list.TIntList;
import gnu.trove.list.TLongList;
import gnu.trove.list.array.TDoubleArrayList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author scr
 */
public class J8TroveStreamsTest {
    @Test(expectedExceptions = IllegalAccessError.class)
    public void testConstructorForCoverage() throws Exception {
        new J8TroveStreams();
    }

    @Test
    public void testIntStreamOf() throws Exception {
        TIntList intList = new TIntArrayList(new int[]{1, 2, 3});
        assertThat(J8TroveStreams.intStreamOf(intList).sum(), is(6));
    }

    @Test
    public void testLongStreamOf() throws Exception {
        TLongList longList = new TLongArrayList(new long[]{1, 2, 3});
        assertThat(J8TroveStreams.longStreamOf(longList).sum(), is(6L));
    }

    @Test
    public void testDoubleStreamOf() throws Exception {
        TDoubleList doubleList = new TDoubleArrayList(new double[]{1, 2, 3});
        assertThat(J8TroveStreams.doubleStreamOf(doubleList).sum(), is(6d));
    }
}