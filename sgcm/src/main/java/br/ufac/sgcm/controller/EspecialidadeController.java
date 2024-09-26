package br.ufac.sgcm.controller;

import java.util.List;

import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeController implements IController<Especialidade> {
    //Todos os métodos da camada DAO dever estar disponiveis
    //Métodos das regras de negócio da aplicação
    EspecialidadeDao eDao;

    public EspecialidadeController(){
        eDao = new EspecialidadeDao();
    }

    @Override
    public List<Especialidade> get() {
        return eDao.get();
    }

    @Override
    public Especialidade get(Long id) {
        return eDao.get(id);
    }

    @Override
    public List<Especialidade> get(String termoBusca) {
        return eDao.get(termoBusca);
    }

    @Override
    public int delete(Especialidade objeto) {
        return eDao.delete(objeto);
    }

    @Override
    public int save(Especialidade objeto) {
        int registrosAfetados = 0;
        if(objeto.getId() == null){ //Se o objeto id nãoexiste no banco ele insere
          registrosAfetados = eDao.insert(objeto);
        }
        else{ //caso contrario ele atualiza
          registrosAfetados = eDao.update(objeto);
        }
        return registrosAfetados;
    }

    


}
