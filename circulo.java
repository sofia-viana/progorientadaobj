public class circulo {
    double raio;

    circulo (double r) {
        raio = r;
    }
    double comprimento () {
        return 2 * 3.14 * raio;
    }
    double area () {
        return 3.14 * raio * raio;
    }
}