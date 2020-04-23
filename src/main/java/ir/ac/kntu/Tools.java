package ir.ac.kntu;

import java.util.LinkedList;
import java.util.Scanner;

public class Tools {

    public static LinkedList<Country> countries = new LinkedList<>();
    public static LinkedList<City> cities = new LinkedList<>();
    public static LinkedList<Tour> tours = new LinkedList<>();
    public static LinkedList<User> users = new LinkedList<>();
    public static LinkedList<Leader> leaders = new LinkedList<>();
    public static boolean yesOrNo(){
        System.out.println("Enter 'y' for Yes and 'n' for no");
        Scanner in = new Scanner(System.in);
        String ans = in.nextLine();
        if(ans.equals("y") || ans.equals("Y"))
            return true;
        else if(ans.equals("n") || ans.equals("N"))
            return false;
        else{
            while (true){
                System.out.println("*Incorrect input*\nEnter 'y' for Yes and 'n' for no");
                ans = in.nextLine();
                if(ans.equals("y") || ans.equals("Y"))
                    return true;
                else if(ans.equals("n") || ans.equals("N"))
                    return false;
            }
        }
    }
    public static void listPrinter(LinkedList list){
        if(list.size()<1){
            System.out.println("List is empty.");
            return;
        }
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+". "+list.get(i).toString());
        }
    }
    public static int listChooser(LinkedList list){
        if(list.size()<1){
            return -1;
        }

        Scanner in = new Scanner(System.in);
        int ans = in.nextInt();
        if(ans==0)
            return 0;
        while (ans>list.size()||ans<1){
            System.out.println("*Incorrect Input*\nEnter from 1 to "+list.size()+".");
            ans = in.nextInt();
        }
        return ans-1;
    }
    public static User login(){
        System.out.println("Enter Username:");
        Scanner in = new Scanner(System.in);
        String user = in.nextLine();
        System.out.println("Enter Password:");
        String pass = in.nextLine();
        if(user.equals("0") && pass.equals("0")){
            User exit = new User("exit");
            return exit;
        }
            //return User holder = new User();
        for(int i=0;i<Tools.users.size();i++){
            if(user.equals(Tools.users.get(i).getUsername())){
                if(pass.equals(Tools.users.get(i).getPassword())){
                    return Tools.users.get(i);
                }
                else {
                    System.out.println("Wrong Password.");
                }
            }
        }
        System.out.println("Wrong Username");
        return null;
    }
    public static void countryMenus(int ans){

        if(ans<0){
            System.out.println("There are no countries registered.\nDo you want to add a new country?\n(Enter 'n' to go back)");
            if(yesOrNo()){
                Country country = new Country();
                country.newCountry();
            }
        }

    }
}
