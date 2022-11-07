public class Temperature{

    public static double CelsiusToKelvin(int a){
    return a + 273.15;
    }
    
    public static double CelsiusToFahrenheit(int a){
    return a * 1.8 + 32;
    }
    
    public static double KelvinToCelsius(int a){
    return a - 273.15;
    } 
    
    public static double KelvinToFahrenheit(int a){
    return a - 273.15 * 1.8 +32;
    }
    
    public static double FahrenheitToCelsius(int a){
    return (a - 32) / 1.8; 
    }
    
    public static double FahrenheitToKelvin(int a){
    return (a - 32) / 1.8 + 273.15;
    }
    
    public static void main(String[] args) {
    System.out.println(CelsiusToKelvin(25));
    System.out.println(CelsiusToFahrenheit(25));
    
    System.out.println(FahrenheitToCelsius(100));
    System.out.println(FahrenheitToKelvin(100));
    
    System.out.println(KelvinToCelsius(0));
    System.out.println(KelvinToFahrenheit(0));
    }
}