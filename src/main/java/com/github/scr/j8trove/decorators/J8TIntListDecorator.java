package com.github.scr.j8trove.decorators;

import com.github.scr.j8trove.interfaces.J8TPrimitiveCollection;
import com.github.scr.j8trove.iterators.J8TIntIterator;
import gnu.trove.decorator.TIntListDecorator;
import gnu.trove.list.TIntList;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;

/**
 * Decorator for TIntLists.
 *
 * @author scr
 */
public class J8TIntListDecorator extends TIntListDecorator implements J8TPrimitiveCollection.OfInt {
    /**
     * {@inheritDoc}
     */
    public J8TIntListDecorator() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public J8TIntListDecorator(TIntList list) {
        super(list);
    }

    @Override
    public PrimitiveIterator.OfInt primitiveIterator() {
        return new J8TIntIterator(list.iterator());
    }

    @Override
    public Spliterator.OfInt primitiveSpliterator() {
        return Spliterators.spliterator(primitiveIterator(), list.size(), Spliterator.SIZED | Spliterator.ORDERED);
    }
}
