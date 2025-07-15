package basico;

public class BoxingUnboxingWrapper {

	public static void main(String[] args) {
        //Boxing
        int x = 20;
        Object obj = x;
        System.out.println(x);

        //Unboxing
        int y = (int)obj;
        System.out.println(y);

        //Wrapper
        Integer z = 20;
        int n = z * 2;
        System.out.println(n);
	}

}
