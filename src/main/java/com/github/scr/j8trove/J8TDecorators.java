package com.github.scr.j8trove;

import com.github.scr.j8trove.decorators.*;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.TIntList;
import gnu.trove.list.TLongList;
import gnu.trove.set.TDoubleSet;
import gnu.trove.set.TIntSet;
import gnu.trove.set.TLongSet;

/**
 * Created by scr on 9/15/15.
 */
public class J8TDecorators {
    J8TDecorators() {
        throw new IllegalAccessError("This class should not be instantiated");
    }

    public static J8TIntListDecorator wrap(TIntList intList) {
        return new J8TIntListDecorator(intList);
    }

    public static J8TDoubleListDecorator wrap(TDoubleList doubleList) {
        return new J8TDoubleListDecorator(doubleList);
    }

    public static J8TLongListDecorator wrap(TLongList longList) {
        return new J8TLongListDecorator(longList);
    }

    public static J8TIntSetDecorator wrap(TIntSet intSet) {
        return new J8TIntSetDecorator(intSet);
    }

    public static J8TDoubleSetDecorator wrap(TDoubleSet doubleSet) {
        return new J8TDoubleSetDecorator(doubleSet);
    }

    public static J8TLongSetDecorator wrap(TLongSet longSet) {
        return new J8TLongSetDecorator(longSet);
    }
}
