package com.github.scr.j8trove.iterators;

import gnu.trove.TLongCollection;
import gnu.trove.iterator.TLongIterator;

import java.util.Spliterators;
import java.util.function.LongConsumer;

/**
 * Spliterator for TLongCollections.
 *
 * @author scr
 */
public class J8TLongSpliterator extends Spliterators.AbstractLongSpliterator {
    private final TLongIterator LONG_ITERATOR;

    public J8TLongSpliterator(TLongCollection longCollection) {
        super(longCollection.size(), SIZED);
        LONG_ITERATOR = longCollection.iterator();
    }

    public boolean tryAdvance(LongConsumer action) {
        if (!LONG_ITERATOR.hasNext()) {
            return false;
        }
        action.accept(LONG_ITERATOR.next());
        return true;
    }
}
