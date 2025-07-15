package basico;

public class EscopoEInicializacao {

    public static void main(String[] args) throws Exception {
        double price = 400.0;

        if (price < 200.0) {
            double desconto = price * 0.1;
            System.out.println(desconto);
        }
        System.out.println(price);        
    }
}
