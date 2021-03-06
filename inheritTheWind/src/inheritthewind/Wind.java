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
public class Wind extends Measurement {

    String unit = "kph";

    public Wind() {

    }

    /**
     * returns the change in temperature direction = 1 means wind from north
     *
     * @return
     */
    public double windVector() {
        double tempChange;
        double direction = (int) (2 * Math.random()) + 1;
        double speed = 15 * Math.random() + 0;
        if (direction == 2) {
            tempChange = -(speed % (.65));
        } else {
            tempChange = (int) (speed * .5);
        }
        System.out.println("Temperature change from wind for morning temp " + tempChange + "C");
        if (direction == 2) {
            System.out.println("Wind: " + (int) speed + " " + unit + " from North");
        } else {
            System.out.println("Wind: " + (int) speed + " " + unit + " from South");
        }
        return tempChange;
    }
}
