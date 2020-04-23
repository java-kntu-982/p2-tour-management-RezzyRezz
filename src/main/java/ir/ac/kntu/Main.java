package ir.ac.kntu;

import ir.ac.kntu.maputil.MapUtil;
import org.checkerframework.checker.units.qual.C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loader();
        Leader leader = new Leader("Ali","user","pass");
        User user = new User();
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);
        int remote=10;
        System.out.println("Welcome.");
        //user = Tools.login();
        while(true){
            System.out.println("Do you want to login? Saying no would exit the program.");
            boolean req = Tools.yesOrNo();
            if(!req){
                break;
            }
            user = Tools.login();
            //assert user != null;
            if(user.getUsername().equals("exit"))
                break;
            if(user.getClass() == Leader.class) {
                menu.tourLeader((Leader) user);

            }
            if(user.getClass() == Admin.class){
                menu.admin((Admin) user);
            }
            if(user.getClass() == Employee.class){
                menu.employee((Employee) user);
            }
            if(user.getClass() == Customer.class){
                menu.customer((Customer) user);
            }
        }

        //Country a = new Country("A");
        //Country b = new Country("B");
        //Country c = new Country("C");
        //Country d = new Country("D");

        //Leader test = new Leader();
        //test.setKnownCountries(a);
        //test.getKnownCountries();

        /*Date dob = new Date(1375,6,5);
        int aid = dob.ageCalculator();
        System.out.println(aid);*/
        /*Tools.listPrinter(Tools.countries);
        int ans = Tools.listChooser(Tools.countries);
        Tools.countryMenus(ans);
        Tools.listPrinter(Tools.countries);*/
        //boolean test = Tools.yesOrNo();
        //System.out.println(test);
//        Good for showing one location
//        MapUtil.showMap("Shiraz");
//        MapUtil.showMap("@29.6257966,52.5563165,17z");
//        Good for showing two locations
//       MapUtil.showMap("Tehran","Dubai");
    }

    public static void loader()
    {
        Country iran = new Country("Iran",false);
        City tehran = new City("Tehran",iran);
        //tehran.("Meydan e Azadi");tehran.setPlaces("Meydan e Enghelab");tehran.setPlaces("Sa'd Abad Palace");
        City mashhad = new City("Mashhad",iran);
        //mashhad.setPlaces("Haram e Motahar");mashhad.setPlaces("Museum");
        Country turkey = new Country("Turkey",true);
        City istanbul = new City("Istanbul",turkey);
        //istanbul.setPlaces("Hagia Sophia");istanbul.setPlaces("Grand Bazaar");
        Admin admin = new Admin("admin","1234","admin@mail.com","09125522331");
        return;
    }

}
