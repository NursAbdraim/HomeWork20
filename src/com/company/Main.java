package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Day [] days = Day.values();

    for(Day i : days)
        System.out.print(i.name()+" ");
        System.out.println();

    Day monday = Day.MONDAY;
    Day tuesday = Day.TUESDAY;
    Day wednesday = Day.WEDNESDAY;
    Day thursday = Day.THURSDAY;
    Day friday = Day.FRIDAY;
    Day saturday = Day.SATURDAY;
    Day sunday = Day.SUNDAY;

        Scanner input = new Scanner(System.in);
        System.out.println("Kundu jazynyz:");
        String dayInput = input.nextLine();

        try {
            if (dayInput.equalsIgnoreCase("monday"))
                System.out.println(monday.getKotormo() + " kunu Java okuim");
            else if (dayInput.equalsIgnoreCase("tuesday"))
                System.out.println(tuesday.getKotormo() + " kunu Soft Skillske katysham");
            else if (dayInput.equalsIgnoreCase("wednesday"))
                System.out.println(wednesday.getKotormo() + " kunu kaira Java okuim");
            else if (dayInput.equalsIgnoreCase("thursday"))
                System.out.println(thursday.getKotormo() + " kunu English okuim");
            else if (dayInput.equalsIgnoreCase("friday"))
                System.out.println(friday.getKotormo() + " kunu Java kairadan");
            else if (dayInput.equalsIgnoreCase("saturday"))
                System.out.println(saturday.getKotormo() + " kunu es aluu");
            else if (dayInput.equalsIgnoreCase("sunday"))
                System.out.println(sunday.getKotormo() + " kunu dagy es aluu ");
        }
        catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }


    }
}
