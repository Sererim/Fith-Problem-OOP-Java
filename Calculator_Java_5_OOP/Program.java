package Calculator_Java_5_OOP;

public class Program {
    public static void main(String[] args) {

        Complex z1 = new Complex<Float>(5.0f, 6.0f);
        Complex z2 = new Complex<Float>(5f);
        Calculator calc = new Calculator<Complex>(z1, z2);
        System.out.println(calc.getZ());

    }
}
