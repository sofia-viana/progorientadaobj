public class Triangulo {
   private int lado1, lado2, lado3;

    //equilatero
    Triangulo (int lado){
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3= lado;
    }
    // isosceles
    Triangulo (int ladoIgual, int base) {
        this.lado1 = ladoIgual;
        this.lado2 = ladoIgual;
        this.lado3 = base;
    }
    //escaleno
    Triangulo (int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2= lado2;
        this.lado3 = lado3;
    }
    int perimetro(){
        return lado1+lado2+lado3;
    }
    String idTriang () {
        if (lado1 == lado2 && lado2 == lado3)
            return "equilatero";
        else if (lado1!= lado2 && lado2!= lado3)
           return "escaleno";
        else 
            return "isosceles";
    }
    void exibe() {
        System.out.println("lados: "+lado1+", "+lado2+", "+lado3);
        System.out.println("Perimetro: "+perimetro());
        System.out.println("Tipo: "+idTriang());
       
    }
}