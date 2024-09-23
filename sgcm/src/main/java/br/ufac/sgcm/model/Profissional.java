package br.ufac.sgcm.model;

public class Profissional {
    private Long id;
    private String nome;
    private String registro;
    private String telefone;
    private String email;
    private Unidade unidade;
    private Especialidade especialidade;

    public Unidade getUnidade(){
        return this.unidade;
    }
    public Especialidade getEspecialidade(){
        return this.especialidade;
    }
    public void setUnidade(Unidade unidade){
        this.unidade = unidade;
    }
    public void setEspecialidade(Especialidade especialiade){
        this.especialidade = especialiade;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return this.registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
