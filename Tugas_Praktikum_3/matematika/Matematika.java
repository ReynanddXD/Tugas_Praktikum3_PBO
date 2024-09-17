package matematika;

public class Matematika {
    int HasilPertambahan;
    int HasilPengurangan;
    int HasilPerkalian;
    int HasilPembagian;
    
    // Operasi untuk pertambahan    
    protected void pertambahan(int a, int b) {
        HasilPertambahan = a + b;
        System.out.println("Operasi Pertambahan : " + a + " + " + b + " = " + HasilPertambahan);
    }

    // Operasi untuk pengurangan
    protected void pengurangan(int a, int b) {
        HasilPengurangan = a - b;
        System.out.println("Operasi Pengurangan : " + a + " - " + b + " = " + HasilPengurangan);
    }

    // Operasi untuk perkalian
    protected void perkalian(int a, int b) {
        HasilPerkalian = a * b;
        System.out.println("Operasi Perkalian : " + a + " * " + b + " = " + HasilPerkalian);
    }

    // Operasi untuk pembagian
    protected void pembagian(int a, int b) {
        HasilPembagian = a / b;
        System.out.println("Operasi Pembagian : " + a + " / " + b + " = " + HasilPembagian);
    }    
}
