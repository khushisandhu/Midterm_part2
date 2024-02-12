/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */
public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in = new Scanner(System.in);
System.out.println("Enter the day number (1-7)");
int code = in.nextInt();
Weekdays t = new Weekdays();
switch(code) {
    case 1:
        t.nameOfDay(Day.ONE);
        break;
    case 2:
        t.nameOfDay(Day.TWO);
        break;
    case 3:
        t.nameOfDay(Day.THREE);
        break;
    case 4:
        t.nameOfDay(Day.FOUR);
        break;
    case 5:
        t.nameOfDay(Day.FIVE);
        break;
    case 6:
        t.nameOfDay(Day.SIX);
        break;
    case 7:
        t.nameOfDay(Day.SEVEN);
        break;
    default:
        System.out.println("Invalid input");
        break;
}
