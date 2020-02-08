/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritthewind;

/**
 *
 * @author wesley.mcmillen
 */
public class Day{
private double dayBeforeTemp;
private double cloudTemp;
private double windSpeed;
private double temp;
private double precipitation;
    public Day() {
        this.getWeather(temp);
        
    }
    public double getWeather(double dayBeforeTemp) {
        double windNewTemp = this.getWind(dayBeforeTemp);
        System.out.print("Cloud cover: ");
        double cloudNewTemp = this.getCloudCover(windNewTemp);
        double precipitation= this.getPrecipitation(cloudNewTemp); 
        
        return cloudNewTemp;
    }
    public double getWind(double dayBeforeTemp){
        Wind windVector = new Wind();
        double windTemp = windVector.windVector();
        dayBeforeTemp = dayBeforeTemp + windTemp;
        System.out.println("Morning temperature is " + dayBeforeTemp + "C");
        return dayBeforeTemp;
        
    }
    public double getCloudCover(double morningTemp){
        Clouds cloudcover = new Clouds();
        cloudTemp = cloudcover.getClouds(morningTemp);
        cloudTemp = dayBeforeTemp + cloudTemp;
        System.out.println("Midday Temperature is " + cloudTemp);
        return cloudTemp;
    }
    public double getPrecipitation(double temp){
        double precipNewTemp=0;
        Precipitation precipitate = new Precipitation();
        precipNewTemp = precipitate.getPrecipitation(temp);
        
        return precipNewTemp;
    }
    
}
