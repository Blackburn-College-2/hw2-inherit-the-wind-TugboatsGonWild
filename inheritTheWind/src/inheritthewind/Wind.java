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
public class Wind extends Measurement{
String unit = "kph";
    public Wind() {

    }
/**
 * returns the change in temperature
 *  direction = 1 means wind from north
 */
    public int windVector() {
        int tempChange=0;
        double direction = 2*Math.random()+1;
        double speed = 15*Math.random()+0;
        if(direction == 1){
            tempChange = (int)(speed%(.65));
            tempChange = 0-tempChange;
        }else{
            tempChange = (int)(speed*.5);
        }
        System.out.println("Temperature change from wind for morning Temp" + tempChange);
return tempChange;
    }
}
