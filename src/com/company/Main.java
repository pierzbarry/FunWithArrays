package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner k = new Scanner(System.in);

        colors.add("cyan");
        colors.add("magenta");
        colors.add("yellow");
        boolean repeat = true;

        do{
            System.out.print("Enter a new color: ");
            colors.add(k.next());
            System.out.println("Would you want to add another color? Press q to quit: ");
            if(k.next().equalsIgnoreCase("q")){
                repeat = false;
            }
        } while(repeat);
        System.out.println(colors);
    }
}
