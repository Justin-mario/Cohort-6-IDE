package javaClass;

public class CelsiusFahrenheitCalculator {
    private double celsius;
    private double fahrenheit;

    public void setCelsius(double celsius){

            this.celsius = celsius;

    }

    public double getCelsius(){
        if(celsius > 0)
            celsius = (5.0/9.0) * (fahrenheit -32);
        return celsius;
    }
    public void setFahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
    }
    public double getFahrenheit(){
        if(fahrenheit > 0)
            fahrenheit = (32 + celsius) * 9 /5;
        return fahrenheit;
    }

}
