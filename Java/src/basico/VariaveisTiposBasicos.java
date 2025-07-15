package basico;

public class VariaveisTiposBasicos {

    public static void main(String[] args) throws Exception {
        variaveisTiposBasicos();
    }

    static void variaveisTiposBasicos()
    {
        int idade = 25;         // -2147483648 a 2147483647
        double altura = 1.68;   // -4,94E a 1,79E+308
        char sexo = 'F';        // '\u0000' a '\uFFFF' 
        byte valor = 100;       // -128 a 127
        short s = 30000;        // -32768 a 32767
        long  l = 1000000;      // -923337203685470000 a 923337203685470000
        float f = 1000;         // -1,4024E-37 a 3,4028E+38
        boolean b = true;       // True ou False
        String str = "Meu curso";
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(sexo);
        System.out.println(valor);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(b);
        System.out.println(str);
    }

}
