package com.github.scr.j8trove.decorators;

import com.github.scr.j8trove.interfaces.J8TPrimitiveCollection;
import com.github.scr.j8trove.iterators.J8TLongIterator;
import gnu.trove.decorator.TLongSetDecorator;
import gnu.trove.set.TLongSet;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Decorator for TLongSets.
 *
 * @author scr
 */
public class J8TLongSetDecorator extends TLongSetDecorator implements J8TPrimitiveCollection.OfLong {
    /**
     * {@inheritDoc}
     */
    public J8TLongSetDecorator() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public J8TLongSetDecorator(TLongSet set) {
        super(set);
    }

    @Override
    public PrimitiveIterator.OfLong primitiveIterator() {
        return new J8TLongIterator(_set.iterator());
    }

    @Override
    public Spliterator.OfLong primitiveSpliterator() {
        return Spliterators.spliterator(primitiveIterator(), _set.size(), Spliterator.SIZED);
    }
}
