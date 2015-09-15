package com.github.scr.j8trove.interfaces;

import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

/**
 * Classes that implement this provide methods to obtain a primitiveStream (IntStream, e.g.) and parallel variant.
 *
 * @author scr
 */
public interface J8TPrimitiveCollection<T_ITERATOR, T_SPLITERATOR, T_STREAM>
        extends J8PrimitiveIterable<T_ITERATOR, T_SPLITERATOR> {

    T_STREAM primitiveStream();

    T_STREAM parallelPrimitiveStream();

    interface OfDouble extends J8TPrimitiveCollection<PrimitiveIterator.OfDouble, Spliterator.OfDouble, DoubleStream> {
        @Override
        default DoubleStream primitiveStream() {
            return StreamSupport.doubleStream(primitiveSpliterator(), false);
        }

        @Override
        default DoubleStream parallelPrimitiveStream() {
            return StreamSupport.doubleStream(primitiveSpliterator(), true);
        }
    }

    interface OfLong extends J8TPrimitiveCollection<PrimitiveIterator.OfLong, Spliterator.OfLong, LongStream> {
        @Override
        default LongStream primitiveStream() {
            return StreamSupport.longStream(primitiveSpliterator(), false);
        }

        @Override
        default LongStream parallelPrimitiveStream() {
            return StreamSupport.longStream(primitiveSpliterator(), true);
        }
    }

    interface OfInt extends J8TPrimitiveCollection<PrimitiveIterator.OfInt, Spliterator.OfInt, IntStream> {
        @Override
        default IntStream primitiveStream() {
            return StreamSupport.intStream(primitiveSpliterator(), false);
        }

        @Override
        default IntStream parallelPrimitiveStream() {
            return StreamSupport.intStream(primitiveSpliterator(), true);
        }
    }
}
