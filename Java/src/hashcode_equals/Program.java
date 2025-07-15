package hashcode_equals;

public class Program {

    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";
        
        System.out.println(a.equals(b));
        System.out.println(a.hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println();

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "alex@gmail.com");
        Client c3 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println();
        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c3));
        System.out.println(c1 == c3); // compara o endereço de memória

        System.out.println();
        String s1 = "Test";
        String s2 = "Test";
        System.out.println(s1 == s2); // retorna true, pois o Java faz uma otimização para strings literais

        System.out.println();
        String s3 = new String("Test");
        String s4 = new String("Test");
        System.out.println(s3 == s4); // retorna false, pois o Java cria dois objetos diferentes0
    }
}
