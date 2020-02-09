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
public class InherittheWind {

    /**
     * GUESS IS 6 HOURS Time spent:4.75 Hours
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Day day = new Day();
        Day2 day2 = new Day2(day);
        Day3 day3 = new Day3(day2);
        Day4 day4 = new Day4(day3);
        Day5 day5 = new Day5(day4);
        Day6 day6 = new Day6(day5);
        Day7 day7 = new Day7(day6);
        Day8 day8 = new Day8(day7);
        Day9 day9 = new Day9(day8);
        Day10 day10 = new Day10(day9);
    }

}
