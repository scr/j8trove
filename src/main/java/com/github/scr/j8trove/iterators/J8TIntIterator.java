package com.github.scr.j8trove.iterators;

import gnu.trove.TIntCollection;
import gnu.trove.iterator.TIntIterator;

import java.util.PrimitiveIterator;

/**
 * Iterator for TIntIterators.
 *
 * @author scr
 */
public class J8TIntIterator implements PrimitiveIterator.OfInt {
    private final TIntIterator INT_ITERATOR;

    public J8TIntIterator(TIntIterator intIterator) {
        INT_ITERATOR = intIterator;
    }

    @Override
    public int nextInt() {
        return INT_ITERATOR.next();
    }

    @Override
    public boolean hasNext() {
        return INT_ITERATOR.hasNext();
    }
}
