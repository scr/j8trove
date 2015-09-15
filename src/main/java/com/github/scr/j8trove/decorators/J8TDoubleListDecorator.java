package com.github.scr.j8trove.decorators;

import com.github.scr.j8trove.interfaces.J8TPrimitiveCollection;
import com.github.scr.j8trove.iterators.J8TDoubleIterator;
import gnu.trove.decorator.TDoubleListDecorator;
import gnu.trove.list.TDoubleList;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Decorator for TDoubleLists.
 *
 * @author scr
 */
public class J8TDoubleListDecorator extends TDoubleListDecorator implements J8TPrimitiveCollection.OfDouble {
    /**
     * {@inheritDoc}
     */
    public J8TDoubleListDecorator() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public J8TDoubleListDecorator(TDoubleList list) {
        super(list);
    }

    @Override
    public PrimitiveIterator.OfDouble primitiveIterator() {
        return new J8TDoubleIterator(list.iterator());
    }

    @Override
    public Spliterator.OfDouble primitiveSpliterator() {
        return Spliterators.spliterator(primitiveIterator(), list.size(), Spliterator.SIZED | Spliterator.ORDERED);
    }
}
