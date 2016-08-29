package Module2_1;

/**
 * Created by Serg-fam on 23.08.2016 on 9:25.
 */
public class Runner {

    public static void main(String[] args) {

        new RandIntArray();
        System.out.println();
        new RandDoubleArray();
        System.out.println();
        new MethodsArrays().sum(RandIntArray.getIntArray());
        new MethodsArrays().sum(RandDoubleArray.getDoubleArray());
        System.out.println();
        new MethodsArrays().min(RandIntArray.getIntArray());
        new MethodsArrays().min(RandDoubleArray.getDoubleArray());
       System.out.println();
        new MethodsArrays().max(RandIntArray.getIntArray());
        new MethodsArrays().max(RandDoubleArray.getDoubleArray());
        System.out.println();
        new MethodsArrays().maxPositive(RandIntArray.getIntArray());
        new MethodsArrays().maxPositive(RandDoubleArray.getDoubleArray());
        System.out.println();
        new MethodsArrays().multiplication(RandIntArray.getIntArray());
        new MethodsArrays().multiplication(RandDoubleArray.getDoubleArray());
        System.out.println();
        new MethodsArrays().modulus(RandIntArray.getIntArray());
        new MethodsArrays().modulus(RandDoubleArray.getDoubleArray());
        System.out.println();
        new MethodsArrays().secondLargest(RandIntArray.getIntArray());
        System.out.println();
        new MethodsArrays().secondLargest(RandDoubleArray.getDoubleArray());

    }
}
