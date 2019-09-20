package org.wy.learn.lambda;

public interface Converter<F, T> {

    T convert(F from);

    default void first(int n) {
        System.out.println(n);
    }

    default int second(int n) {
        return ++n;
    }

}
