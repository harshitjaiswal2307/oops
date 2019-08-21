package oops;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double time,speed,distance;
        Scanner sc = new Scanner(System.in);
        time = sc.nextDouble();
        speed = 9.8*(time );
        distance = 0.5 * (9.8) * (time *time);
        System.out.println("The speed of the object at " + time + " seconds after its release is " +speed+ " and the distance the object has travelled in the " +time+ " seconds after the relase is " + distance);

    }
}