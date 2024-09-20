public class Quadrado implements IQuadrilatero {
    private double lado;
    //Construtor
    //Quadrado q1 = new Quadrado(); //Abre e fecha parenteses e um construtor
    public Quadrado(double l){
        this.lado = l;

    }
    public double calcularArea(){
        return this.lado * this.lado;
    }
}
