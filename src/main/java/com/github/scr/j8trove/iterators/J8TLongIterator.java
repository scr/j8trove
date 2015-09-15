package com.github.scr.j8trove.iterators;

import gnu.trove.iterator.TLongIterator;

import java.util.PrimitiveIterator;

/**
 * Iterator for TLongIterators.
 *
 * @author scr
 */
public class J8TLongIterator implements PrimitiveIterator.OfLong {
    private final TLongIterator LONG_ITERATOR;

    public J8TLongIterator(TLongIterator longIterator) {
        LONG_ITERATOR = longIterator;
    }

    @Override
    public long nextLong() {
        return LONG_ITERATOR.next();
    }

    @Override
    public boolean hasNext() {
        return LONG_ITERATOR.hasNext();
    }
}
