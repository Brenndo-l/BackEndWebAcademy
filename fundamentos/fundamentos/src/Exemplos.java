
import java.util.ArrayList;
import java.util.List;

public class Exemplos {
    public static void main(String[] args) {
        int i = 10;
        double n1 = 9.5;
        float n2 = 8.5f;
        boolean status = true;
        String nome = "Brenndo";
        double soma = i + n1;
        System.out.println(soma);
        String n3 = "5";
        double soma2 = n1 + n1 + Double.parseDouble(n3);
        System.out.println(soma2);
        double pi = 3.14;
        int pi_inteiro = (int)pi;
        System.out.println(pi_inteiro);
        if (n1 > 10){
            System.out.println("Maior que 10.");
        }
        else
            System.out.println("Menor ou igual a 10.");
        String str = (n1>9) ? "Maior que 9" : "Menor igual 9";

        //Arrays
        int [] vetor = new int[10];
        vetor[0] = 10;
        for(int j =1; j<10; j++){
            vetor[j] =(j+1) * 10;
        }
        for(int j=0; j < vetor.length;j++){
            System.out.println("Posição["+j+"]:" + vetor[j]);
        }

        //Arrays Dinamicos
        List<Integer> vetor_dinamico = new ArrayList<Integer>();
        System.out.println("Vetor estatico");
        for(int j=0;j<10; j++){
            vetor_dinamico.add(j*2);
        }
        vetor_dinamico.add(10000);
        vetor_dinamico.add(1000);
        vetor_dinamico.add(3000);
        vetor_dinamico.remove(12);
        //For-each
        System.out.println("Vetor dinamico");
        for(int numero : vetor_dinamico){
            System.out.printf("\nPosição [%d] %d", vetor_dinamico.indexOf(numero), numero);
        }
    }
    
}
