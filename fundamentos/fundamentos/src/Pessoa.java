public class Pessoa {
    private String nome;
    private String email;
    private String cpf;
    //Metodos de acesso getters an setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome; // this faz a referencia ao objeto que chama o metodo
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return this.cpf;
    }
    
}
