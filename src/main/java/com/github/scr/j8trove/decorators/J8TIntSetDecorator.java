package com.github.scr.j8trove.decorators;

import com.github.scr.j8trove.interfaces.J8TPrimitiveCollection;
import com.github.scr.j8trove.iterators.J8TIntIterator;
import gnu.trove.decorator.TIntSetDecorator;
import gnu.trove.set.TIntSet;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Decorator for TIntSets.
 *
 * @author scr
 */
public class J8TIntSetDecorator extends TIntSetDecorator implements J8TPrimitiveCollection.OfInt {
    /**
     * {@inheritDoc}
     */
    public J8TIntSetDecorator() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public J8TIntSetDecorator(TIntSet set) {
        super(set);
    }

    @Override
    public PrimitiveIterator.OfInt primitiveIterator() {
        return new J8TIntIterator(_set.iterator());
    }

    @Override
    public Spliterator.OfInt primitiveSpliterator() {
        return Spliterators.spliterator(primitiveIterator(), _set.size(), Spliterator.SIZED);
    }
}
