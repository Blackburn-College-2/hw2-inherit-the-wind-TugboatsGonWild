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
public class Snow extends Precipitation {

    @Override
    public double getPrecipitation(double temp) {
        if (temp <= 32) {
            System.out.println("cm of snow: " + (precipitation*10));

        }
        return tempChangePrecip;
    }
}
