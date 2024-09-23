package br.ufac.sgcm;

import br.ufac.sgcm.model.Especialidade;
import br.ufac.sgcm.model.Profissional;
import br.ufac.sgcm.model.Unidade;

public class Teste {
    public static void main(String[] args) {
        //Criar um objeto profissional
        Profissional p1 = new Profissional();
        p1.setNome("Brenndo");
        p1.setRegistro("123");
        p1.setTelefone("68999085567");
        p1.setEmail("brenndo@gmail.com");
        Unidade u1 = new Unidade();
        u1.setNome("Laboratório");
        u1.setEndereco("Vila Acre-Santa Maria 72");
        p1.setUnidade(u1);
        Especialidade e1 = new Especialidade();
        e1.setNome("Veterinario");
        p1.setEspecialidade(e1);
        System.out.println("Nome: "+ p1.getNome());
        System.out.println("Especialidade: "+ p1.getEspecialidade());
        System.out.println("Unidade"+ p1.getUnidade());
    }
    
}
