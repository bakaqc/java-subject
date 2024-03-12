package dao;

import java.util.*;

public interface DAO<E> {

    List<E> getAll();

    Optional<E> getId(int ID);

    void insert(E obj);

    void update(E obj);

    void delete(int ID);

}
