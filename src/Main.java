public class Main {
    public static void main(String[] args)
    {
        Coche coche = new  Coche(4,90);
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);
    }
}
class Coche{
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

public Coche(int puertas, int velocidad) {
    numeroDePuertas=puertas;
    velocidadMaxima =velocidad;
    System.out.println("Estoy en el constructor");
    }
}

