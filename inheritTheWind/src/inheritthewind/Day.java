/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritthewind;

/**
 *
 * @author wesley.mcmillen My attempt at making an inheritance project out of
 * all of this. thoroughly disliked this project. For inheritance I would have
 * liked for us to do something with living things that will literally inherit
 * stuff.
 */
public class Day {

    public double dayBeforeTemp;
    public double cloudTemp;
    public double windSpeed;
    public double temp;
    public double precipitation;
    public double nextDay;

    public Day() {
        dayBeforeTemp = this.getWeather(dayBeforeTemp);
        dayBeforeTemp += windSpeed + temp + precipitation;

    }

    public double getWeather(double dayBeforeTemp) {
        double windNewTemp = this.getWind(dayBeforeTemp);
        System.out.print("Cloud cover: ");
        double cloudNewTemp = this.getCloudCover(windNewTemp);
        double precipitation = this.getPrecipitation(cloudNewTemp);
        System.out.println("");

        return cloudNewTemp;
    }

    public double getWind(double dayBefore) {
        Wind windVector = new Wind();
        double windTemp = windVector.windVector();
        dayBeforeTemp = dayBefore + windTemp;
        System.out.println("Morning temperature is " + (int) dayBeforeTemp + "C");
        return dayBeforeTemp;

    }

    public double getCloudCover(double morningTemp) {
        Clouds cloudcover = new Clouds();
        cloudTemp = cloudcover.getClouds(morningTemp);
        cloudTemp = dayBeforeTemp + cloudTemp;
        System.out.println("Midday Temperature is " + (int) cloudTemp + "C");
        temp = cloudTemp;
        return cloudTemp;
    }

    public double getPrecipitation(double temp) {
        double rainNewTemp;
        double snowNewTemp;
        double precipNewTemp = 0;
        Rain rain = new Rain();
        rainNewTemp = rain.getPrecipitation(temp);
        Snow snow = new Snow();
        snowNewTemp = snow.getPrecipitation(temp);
        precipNewTemp = rainNewTemp + snowNewTemp;
        return (int) precipNewTemp;
    }

}
