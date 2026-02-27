public class Telefone {
    String DDD;
    String NUM;
    Telefone (String DDD, String num) {
        this.DDD = DDD;
        this.NUM = num;
    }
    public String toString() {
        return "("+ DDD +")" + NUM;
    }
}
