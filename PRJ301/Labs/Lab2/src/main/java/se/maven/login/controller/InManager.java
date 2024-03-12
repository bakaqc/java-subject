package se.maven.login.controller;

import java.util.*;

public interface InManager<E> {

    List<E> getAll();

    Optional<E> getId(int ID);

    void insert(E obj);

    void update(E obj);

    void delete(int ID);

}
