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
public class Precipitation extends Measurement{
    String unit = "cm";
    double precipitation = 20 * Math.random() + 0;
    double tempChangePrecip;

    public double getPrecipitation(double temp) {
        return tempChangePrecip;
    }

}
