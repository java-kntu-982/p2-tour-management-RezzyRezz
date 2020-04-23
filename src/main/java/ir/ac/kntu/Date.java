package ir.ac.kntu;

import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year,int month,int day){
        Scanner in = new Scanner(System.in);
        while (year<1300||year>1400){
            System.out.println("Incorrect input as year. Enter again between 1300 to 1400:");
            year = in.nextInt();
        }
        this.year = year;

        while (month<1||month>12){
            System.out.println("Incorrect input as month. Enter again between 1 to 12:");
            month = in.nextInt();
        }
        this.month = month;
        if(month<7){
            while (day<1||day>31){
                System.out.println("Incorrect input as day. Enter again between 1 to 31:");
                day = in.nextInt();
            }
        }
        else{
            while (day<1||day>30){
                System.out.println("Incorrect input as day. Enter again between 1 to 30:");
                day = in.nextInt();
            }
        }
        this.day = day;
    }
    public int ageCalculator() {
        int ageInDays;
        if (month < 7) {
            ageInDays = this.getDay() + (this.getMonth() - 1) * 31 + this.getYear() * 365;
        }
        else{
            ageInDays = this.getDay() + (this.getMonth() - 1) * 30 + this.getYear() * 365;
        }

        ageInDays = ((1399*365+1*30+1) - ageInDays) / 365;
        return ageInDays;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }

    @Override
    public String toString() {
        return year+" / "+month+" / "+day;
    }
}
