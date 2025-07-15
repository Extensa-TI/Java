package set;

import java.util.HashSet;
import java.util.Set;

public class HashTestIgualdade {

    //Como as coleções Hash testam a igualdade
    //Se HashCode e equals estiverem implementados, primeiro hashCode e se der igual usa o iguals para confirmar
    // String, Integer, Double, etc ja possuem hashCode e equals implementados
    // Se hashCode e equals nao estiverem implementados, o Java usa o endereco de memoria para comparar

    public static void main(String[] args) {
        
        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product prod = new Product("Notebook", 1200.0);

        System.out.println(set.contains(prod)); //false - sem hashCode e equals - compara endereco de memoria

        Set<Product2> set2 = new HashSet<>();

        set2.add(new Product2("TV", 900.0));
        set2.add(new Product2("Notebook", 1200.0));
        set2.add(new Product2("Tablet", 400.0));

        Product2 prod2 = new Product2("Notebook", 1200.0);

        System.out.println(set2.contains(prod2)); //true  - hashCode e equals implementados
    }
}
