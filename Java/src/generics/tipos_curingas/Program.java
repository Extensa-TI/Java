package generics.tipos_curingas;

import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        //List<Object> myObjs = new ArrayList<>();
        //List<Integer> myNumbers = new ArrayList<>();

        // myObjs = myNumbers; // Erro de compilacao List<Integer> nao e subtipo de List<Object>

        //Object obj;
        //Integer x = 10;
        //obj = x;

        //List<?> myObjs = new ArrayList<>();
        //List<Integer> myNumbers = new ArrayList<>();
        //myObjs = myNumbers; // Funciona, List<?> e supertipo de List<Integer>

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob"); 
        printList(myStrs);

        //Nao e possivel adicionar elementos a uma lista curinga
        //List<?> list = new ArrayList<>();
        //list.add(3); // Erro de compilacao
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }   


}
