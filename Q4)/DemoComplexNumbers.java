package prog4;

public class DemoComplexNumbers {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1.2f,3);
        ComplexNumber c2 = new ComplexNumber(2.4f,5);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Sum = "+ComplexNumber.addComplex(c1,c2));
        System.out.println("Diff = "+ComplexNumber.subComplex(c1,c2));
        System.out.println("Pro = "+ ComplexNumber.mulComplex(c1,c2));
    }
}
