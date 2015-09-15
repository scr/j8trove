package com.github.scr.j8trove.iterators;

import gnu.trove.TIntCollection;
import gnu.trove.iterator.TIntIterator;

import java.util.Spliterators;
import java.util.function.IntConsumer;

/**
 * Spliterator for TIntCollections.
 *
 * @author scr
 */
public class J8TIntSpliterator extends Spliterators.AbstractIntSpliterator {
    private final TIntIterator INT_ITERATOR;

    public J8TIntSpliterator(TIntCollection intCollection) {
        super(intCollection.size(), SIZED);
        this.INT_ITERATOR = intCollection.iterator();
    }

    public boolean tryAdvance(IntConsumer action) {
        if (!INT_ITERATOR.hasNext()) {
            return false;
        }
        action.accept(INT_ITERATOR.next());
        return true;
    }
}
