package com.epam.jwd.task_1.car_sorting;

public interface Iterator<E> {

    E next();

    boolean hasNext();

    void remove();
}


