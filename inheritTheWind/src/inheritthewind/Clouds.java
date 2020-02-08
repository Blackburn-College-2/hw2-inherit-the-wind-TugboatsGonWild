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
public class Clouds {

    public Clouds() {

    }

    public double getClouds(double morningTemp) {
        double cloudcover = (int)4 * Math.random() + 1;
        int clouds = (int)cloudcover;
        double degrees = morningTemp;
        if (clouds == 1) {
            degrees += 6;
            System.out.println("None");
        }
        if (clouds == 2) {
            degrees += 3;
            System.out.println("light");
        }
        if (clouds == 3) {
            degrees += -3;
            System.out.println("Medium");
        }
        if (clouds == 4) {
            degrees += -14;
            System.out.println("Heavy");
        }
        return degrees;
    }
}
