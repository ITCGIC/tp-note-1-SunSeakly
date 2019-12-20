package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        System.out.println("Program for converting money in Reals to Dollars.");
        Scanner input = new Scanner(System.in);
        float riel,dollar,rate;
        System.out.print("Please input money in Riels: ");
        riel = input.nextFloat();
        System.out.print("rate exchange:");
        rate = input.nextFloat();
        dollar = riel/rate;
        System.out.println("Convert rate is: 1$ ="+rate+"Riels");
        String output = riel+" RIELS ="+dollar+" USD" ;
        int count = output.length();
        for (int i=0; i<= count; i++){
            System.out.print("-");
        }
        System.out.println("");
        System.out.print(output);
    }


}


