/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritthewind;

/**
 * rain specific
 *
 * @author wesley.mcmillen
 */
public class Rain extends Precipitation {

    @Override
    public double getPrecipitation(double temp) {
        if (temp > 0) {
            System.out.println("cm of rain: " + (int) precipitation);
            tempChangePrecip = -(precipitation * .9);
        }

        return tempChangePrecip;
    }
}
