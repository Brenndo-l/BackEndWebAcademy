package br.ufac.sgcm;

import java.util.List;

import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;
import br.ufac.sgcm.model.Profissional;
import br.ufac.sgcm.model.Unidade;

public class Teste {
    public static void main(String[] args) {
        // Criar um objeto profissional
        Profissional p1 = new Profissional();
        p1.setNome("Limeira");
        p1.setRegistro("123");
        p1.setTelefone("68999999999");
        p1.setEmail("limeira@ufac.br");
        Unidade u1 = new Unidade();
        u1.setNome("Laboratório");
        u1.setEndereco("Av. Getúlio Vargas, nº:100");
        p1.setUnidade(u1);
        Especialidade e1 = new Especialidade();
        e1.setNome("Pediatria");
        p1.setEspecialidade(e1);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Especialidade: " + p1.getEspecialidade().getNome());
        System.out.println("Unidade: " + p1.getUnidade().getNome());

        //Objeto da classe ConexaoBD
        // ConexaoDB conexao = new ConexaoDB();
        // Connection instancia = conexao.getConexao();
        // if (instancia != null){
        //     System.out.println("Conectou!");
        // }
        // else{
        //     System.out.println("Falha na conexão");
        // }

        EspecialidadeDao edao = new EspecialidadeDao();

        //Inserindo uma especialidade
        // if (edao.insert(e1)==1){
        //     System.out.println("Especialidade inserida com sucesso");
        // }else{
        //     System.out.println("Não foi realizado");
        // }

        //Deletando uma especialidade
        // e1.setId(12L);
        // if (edao.delete(e1) == 1){
        //     System.out.println("Especialidade excluida com sucesso");
        // }else{
        //     System.out.println("Não excluiu");
        // }

        //Atualizar uma especialidade
        // e1.setId(11L);
        // if(edao.update(e1) == 1){
        //     System.out.println("Especialidade atualizada com sucesso");
        // }else{
        //     System.out.println("Não foi atualizada");
        // }

        List<Especialidade> lista = edao.get("gia");
        for(Especialidade e : lista){
            System.out.println(e.getId());
            System.out.println(e.getNome());
        }
    }
}
