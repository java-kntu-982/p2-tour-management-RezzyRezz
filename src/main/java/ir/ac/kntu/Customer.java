package ir.ac.kntu;

import java.util.Scanner;

public class Customer extends User {
    private String name;
    public void setName(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
    }

    public String getName() {
        return name;
    }
}
