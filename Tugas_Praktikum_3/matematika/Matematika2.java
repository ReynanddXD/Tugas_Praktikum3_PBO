package matematika;

public class Matematika2 extends Matematika {
    // Operasi untuk modulus
    protected void modulus(int a, int b) {
        int HasilModulus = a % b;
        System.out.println("Operasi Modulus : " + a + " % " + b + " = " + HasilModulus);
    }   
}
