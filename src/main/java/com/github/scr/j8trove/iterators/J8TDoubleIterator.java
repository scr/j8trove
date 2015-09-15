package com.github.scr.j8trove.iterators;

import gnu.trove.iterator.TDoubleIterator;

import java.util.PrimitiveIterator;

/**
 * Iterator for TDoubleIterators.
 *
 * @author scr
 */
public class J8TDoubleIterator implements PrimitiveIterator.OfDouble {
    private final TDoubleIterator DOUBLE_ITERATOR;

    public J8TDoubleIterator(TDoubleIterator doubleIterator) {
        DOUBLE_ITERATOR = doubleIterator;
    }

    @Override
    public double nextDouble() {
        return DOUBLE_ITERATOR.next();
    }

    @Override
    public boolean hasNext() {
        return DOUBLE_ITERATOR.hasNext();
    }
}
