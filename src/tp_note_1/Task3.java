package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        System.out.println("Program for converting time to seconds.");
        Scanner input = new Scanner(System.in);
        int hours,minutes,seconds;
        System.out.print("Please input hours: ");
        hours = input.nextInt();
        System.out.print("Please input minutes: ");
        minutes = input.nextInt();
        System.out.print("Please input seconds: ");
        seconds = input.nextInt();
        int totalseconds = (hours * 3600) + (minutes * 60) + seconds ;
        System.out.println("");
        String output = "Number of seconds= "+hours+"x3600 +"+minutes+"x60 +"+seconds+"="+totalseconds;
        int line = output.length();
        for (int i=0; i<= line; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println(output);
    }
}
