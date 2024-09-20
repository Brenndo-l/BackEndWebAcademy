

public class Principal {
    public static void main(String[] args) {
        //Com encapsulamentos os, atributos devem ser acessados pelos metodos
        Pessoa p1 = new Pessoa();
        // p1.nome = "Limeira";
        // p1.email = "Limeira@ufac.br";
        // System.out.println("Nome:"+p1.nome);
        // System.out.println("Email:"+p1.email);
        p1.setNome("Limeira");
        Pessoa p2 = new Pessoa();
        // p2.nome = "Junior";
        // p2.email = "juniorlimeiras@gmail.com";
        // p2.cpf = "333.343..434-32";
        p2.setNome("Junior");

        //p2.setCpf("313.321.434.21"); //Método não existe
        Aluno a1= new Aluno();
        a1.setNome("Mateus");
        Aluno a2 = new Aluno();
        a2.setNome("Gleice");
        a2.setMatricula(1);
        a2.setEmail("gleice@gmail.com");
        System.out.println("Nome:"+a2.getNome() + "  Mat:"+a2.getMatricula());
        System.out.println("Email:"+a2.getEmail());
        //Polimorfismo
        Pessoa a3 = new Aluno();
        a3.setNome("Polimofismo");
        
    }
    
}
