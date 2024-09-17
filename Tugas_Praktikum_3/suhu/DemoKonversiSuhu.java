package suhu;

public class DemoKonversiSuhu {

    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 konversiSuhu = new KonversiSuhu2();
        
        System.out.println("Konversi Celcius ke Fahremheit");
        konversiSuhu.celciusToFahrenheit(20);
        
        System.out.println("Konversi Celcius ke Reamur");
        konversiSuhu.celciusToReamur(30);
        
        System.out.println("Konversi Fahrenheit ke Reamur");
        konversiSuhu.fahrenheitToReamur(40);
    }
}
