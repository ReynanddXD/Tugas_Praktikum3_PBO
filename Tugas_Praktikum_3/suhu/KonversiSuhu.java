package suhu;

public class KonversiSuhu {
    // Operasi celcius ke fahrenheit    
    public void celciusToFahrenheit(double celcius){
        double fahrenheit = (celcius * 9/5) + 32;
        System.out.println(celcius + "°C ke Fahrenheit: " + fahrenheit + "°F");
    }
    // operasi celcius ke reamur    
    public void celciusToReamur(double celcius){
        double reamur = celcius * 4/5;
        System.out.println(celcius + "°C ke Reamur: " + reamur + "°R");
    }
}
