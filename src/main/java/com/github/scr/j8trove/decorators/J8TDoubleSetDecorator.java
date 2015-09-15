package com.github.scr.j8trove.decorators;

import com.github.scr.j8trove.interfaces.J8TPrimitiveCollection;
import com.github.scr.j8trove.iterators.J8TDoubleIterator;
import gnu.trove.decorator.TDoubleSetDecorator;
import gnu.trove.set.TDoubleSet;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Decorator for TDoubleSets.
 *
 * @author scr
 */
public class J8TDoubleSetDecorator extends TDoubleSetDecorator implements J8TPrimitiveCollection.OfDouble {
    /**
     * {@inheritDoc}
     */
    public J8TDoubleSetDecorator() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public J8TDoubleSetDecorator(TDoubleSet set) {
        super(set);
    }

    @Override
    public PrimitiveIterator.OfDouble primitiveIterator() {
        return new J8TDoubleIterator(_set.iterator());
    }

    @Override
    public Spliterator.OfDouble primitiveSpliterator() {
        return Spliterators.spliterator(primitiveIterator(), _set.size(), Spliterator.SIZED);
    }
}
