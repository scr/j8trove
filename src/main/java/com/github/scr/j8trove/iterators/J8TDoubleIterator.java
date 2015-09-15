package com.github.scr.j8trove.iterators;

import gnu.trove.TDoubleCollection;
import gnu.trove.iterator.TDoubleIterator;

import java.util.Spliterators;
import java.util.function.DoubleConsumer;

/**
 * Spliterator for TDoubleCollections.
 *
 * @author scr
 */
public class J8TDoubleIterator extends Spliterators.AbstractDoubleSpliterator {
    private final TDoubleIterator DOUBLE_ITERATOR;

    public J8TDoubleIterator(TDoubleCollection doubleCollection) {
        super(doubleCollection.size(), SIZED);
        DOUBLE_ITERATOR = doubleCollection.iterator();
    }

    public boolean tryAdvance(DoubleConsumer action) {
        if (!DOUBLE_ITERATOR.hasNext()) {
            return false;
        }
        action.accept(DOUBLE_ITERATOR.next());
        return true;
    }
}
