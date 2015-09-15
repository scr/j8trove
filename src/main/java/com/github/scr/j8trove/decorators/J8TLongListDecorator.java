package com.github.scr.j8trove.decorators;

import com.github.scr.j8trove.interfaces.J8TPrimitiveCollection;
import com.github.scr.j8trove.iterators.J8TLongIterator;
import gnu.trove.decorator.TLongListDecorator;
import gnu.trove.list.TLongList;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Decorator for TLongLists.
 *
 * @author scr
 */
public class J8TLongListDecorator extends TLongListDecorator implements J8TPrimitiveCollection.OfLong {
    /**
     * {@inheritDoc}
     */
    public J8TLongListDecorator() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public J8TLongListDecorator(TLongList list) {
        super(list);
    }

    public PrimitiveIterator.OfLong primitiveIterator() {
        return new J8TLongIterator(list.iterator());
    }

    public Spliterator.OfLong primitiveSpliterator() {
        return Spliterators.spliterator(primitiveIterator(), list.size(), Spliterator.SIZED | Spliterator.ORDERED);
    }
}
