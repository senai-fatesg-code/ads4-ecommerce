package br.senai.fatesg.ecommerce.shopping.interfaces;

import java.util.List;

/**
 * C.R.U.D
 * create
 * read
 * update
 * delete
 */
public interface GenericOperations<T, N> {

    public T create(T entity);

    public T read( N id);

    public List<T> readAll();

    //PATCH
    public T updatePart(N id, T entity);

    //PUT
    public T updateAll(N id, T entity);

    public void delete(N id);
}
