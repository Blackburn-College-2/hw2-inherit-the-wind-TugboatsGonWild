/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritthewind;

/**
 * snow specific
 *
 * @author wesley.mcmillen
 */
public class Snow extends Precipitation {

    @Override
    public double getPrecipitation(double temp) {
        if (temp <= 0) {
            System.out.println("cm of snow: " + (int) (precipitation * 10));
            tempChangePrecip = -(precipitation * .15);
        }
        return tempChangePrecip;
    }
}
