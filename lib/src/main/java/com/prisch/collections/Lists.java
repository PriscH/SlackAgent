package com.prisch.collections;

import java.util.LinkedList;
import java.util.List;

public interface Lists {

    static <T> List<T> of(T element) {
        List list = new LinkedList<>();
        list.add(element);
        return list;
    }
}
