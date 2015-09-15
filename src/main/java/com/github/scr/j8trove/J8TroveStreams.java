package com.github.scr.j8trove;

import com.github.scr.j8trove.iterators.J8TDoubleIterator;
import com.github.scr.j8trove.iterators.J8TIntSpliterator;
import com.github.scr.j8trove.iterators.J8TLongSpliterator;
import gnu.trove.TDoubleCollection;
import gnu.trove.TIntCollection;
import gnu.trove.TLongCollection;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.StreamSupport;

/**
 * Helper utilities to create various stream types from Trove types.
 *
 * @author scr
 */
public class J8TroveStreams {
    J8TroveStreams() {
        throw new IllegalAccessError("Constructor should never be called");
    }

    /**
     * Construct an {@code IntStream} from a {@code TIntCollection}.
     *
     * @param intCollection the trove int collection
     * @return an int stream
     */
    public static IntStream intStreamOf(TIntCollection intCollection) {
        return StreamSupport.intStream(new J8TIntSpliterator(intCollection), false);
    }

    /**
     * Construct a {@code LongStream} from a {@code TLongCollection}.
     *
     * @param longCollection the trove long collection
     * @return a long stream
     */
    public static LongStream longStreamOf(TLongCollection longCollection) {
        return StreamSupport.longStream(new J8TLongSpliterator(longCollection), false);
    }

    /**
     * Construct a {@code DoubleStream} from a {@code TDoubleCollection}.
     *
     * @param doubleCollection the trove double collection
     * @return a double stream
     */
    public static DoubleStream doubleStreamOf(TDoubleCollection doubleCollection) {
        return StreamSupport.doubleStream(new J8TDoubleIterator(doubleCollection), false);
    }
}
