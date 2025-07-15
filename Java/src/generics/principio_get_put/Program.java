package generics.principio_get_put;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Integer> myInts = new ArrayList<>();
        myInts.add(10);
        myInts.add(5);
        myInts.add(20);

        List<? extends Number> myNums = myInts;

        Number x = myNums.get(0); // Get é permitido

        System.out.println(x);

        //list.add(20); // Put não é permitido
        // Essa operação de get ok e put não ok é conhecida como covariância    

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums2 = myObjs;

        myNums2.add(10);
        myNums2.add(3.14); // Put é permitido

        //Number y = myNums2.get(0); // Get não é permitido
        // Essa operação de get não ok e put ok é conhecida como contravariância

        myObjs = new ArrayList<>();
        myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);

        copy(myInts, myObjs);
        printList(myObjs);

        copy(myDoubles, myObjs);
        printList(myObjs);
        
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }   
}
