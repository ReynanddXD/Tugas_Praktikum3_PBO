package suhu;

public class KonversiSuhu2 extends KonversiSuhu {
   // operasi celcius ke reamur    
    public void fahrenheitToReamur(double fahrenheit){
        double celcius = (fahrenheit - 32) * 5/9;
        double reamur = celcius * 4/5;
        System.out.println(fahrenheit + "°F ke Reamur: " + fahrenheit + "°R");

    } 
}
