package br.ufac.sgcm.dao;

import java.util.List;

public interface IDao<T> {
    //Definição dos metodos implementados pela classe DAO
    List<T> get();

    List<T> get(String termoBusca);

    T get(Long id);

    int insert(T objeto);

    int update(T objeto);
    
    int delete(T objeto);
}
