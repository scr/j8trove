package com.github.scr.j8trove;

import com.github.scr.j8trove.decorators.*;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.TIntList;
import gnu.trove.list.TLongList;
import gnu.trove.list.array.TDoubleArrayList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.set.TDoubleSet;
import gnu.trove.set.TIntSet;
import gnu.trove.set.TLongSet;
import gnu.trove.set.hash.TDoubleHashSet;
import gnu.trove.set.hash.TIntHashSet;
import gnu.trove.set.hash.TLongHashSet;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author scr
 */
public class J8TDecoratorsTest {
    @Test(expectedExceptions = IllegalAccessError.class)
    public void testConstructorForCoverage() throws Exception {
        new J8TDecorators();
    }

    @Test
    public void testDecoratorConstructors() throws Exception {
        new J8TDoubleListDecorator();
        new J8TDoubleSetDecorator();
        new J8TLongListDecorator();
        new J8TLongSetDecorator();
        new J8TIntListDecorator();
        new J8TIntSetDecorator();
    }

    @Test
    public void testIntStreamOf() throws Exception {
        TIntList intList = new TIntArrayList(new int[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(intList).primitiveStream().sum(), is(6));
    }

    @Test
    public void testParallelIntStreamOf() throws Exception {
        TIntList intList = new TIntArrayList(new int[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(intList).parallelPrimitiveStream().sum(), is(6));
    }

    @Test
    public void testLongStreamOf() throws Exception {
        TLongList longList = new TLongArrayList(new long[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(longList).primitiveStream().sum(), is(6L));
    }

    @Test
    public void testParallelLongStreamOf() throws Exception {
        TLongList longList = new TLongArrayList(new long[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(longList).parallelPrimitiveStream().sum(), is(6L));
    }

    @Test
    public void testDoubleStreamOf() throws Exception {
        TDoubleList doubleList = new TDoubleArrayList(new double[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(doubleList).primitiveStream().sum(), is(6d));
    }

    @Test
    public void testParallelDoubleStreamOf() throws Exception {
        TDoubleList doubleList = new TDoubleArrayList(new double[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(doubleList).parallelPrimitiveStream().sum(), is(6d));
    }

    @Test
    public void testIntStreamOfSet() throws Exception {
        TIntSet intSet = new TIntHashSet(new int[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(intSet).primitiveStream().sum(), is(6));
    }

    @Test
    public void testParallelIntStreamOfSet() throws Exception {
        TIntSet intSet = new TIntHashSet(new int[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(intSet).parallelPrimitiveStream().sum(), is(6));
    }

    @Test
    public void testLongStreamOfSet() throws Exception {
        TLongSet longSet = new TLongHashSet(new long[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(longSet).primitiveStream().sum(), is(6L));
    }

    @Test
    public void testParallelLongStreamOfSet() throws Exception {
        TLongSet longSet = new TLongHashSet(new long[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(longSet).parallelPrimitiveStream().sum(), is(6L));
    }

    @Test
    public void testDoubleStreamOfSet() throws Exception {
        TDoubleSet doubleSet = new TDoubleHashSet(new double[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(doubleSet).primitiveStream().sum(), is(6d));
    }

    @Test
    public void testParallelDoubleStreamOfSet() throws Exception {
        TDoubleSet doubleSet = new TDoubleHashSet(new double[]{1, 2, 3});
        assertThat(J8TDecorators.wrap(doubleSet).parallelPrimitiveStream().sum(), is(6d));
    }
}