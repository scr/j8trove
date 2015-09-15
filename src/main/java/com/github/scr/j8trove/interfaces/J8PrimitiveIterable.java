package com.github.scr.j8trove.interfaces;

/**
 * Classes that implement this provide methods to obtain a PrimitiveIterator and Spliterator.OfPrimitive.
 *
 * @author scr
 */
public interface J8PrimitiveIterable<T_ITERATOR, T_SPLITERATOR> {

    T_ITERATOR primitiveIterator();

    T_SPLITERATOR primitiveSpliterator();
}
