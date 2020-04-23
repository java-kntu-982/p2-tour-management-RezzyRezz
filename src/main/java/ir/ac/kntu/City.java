package ir.ac.kntu;
import java.util.Scanner;

public class City{
    private String name;
    private Country country;

    public City(){

    }
    public City(String name,Country country){
        this.name=name;
        this.country=country;
        addToList();
    }
    public void setName(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
    }
    public String getName(){
        return name;
    }
    public void setCountry(){
        System.out.println("Select Country:");
        Tools.listPrinter(Tools.countries);
        int selected = Tools.listChooser(Tools.countries);
        if(selected==-1){
            country = null;
            System.out.println("No Country Has Been Selected.");
        }
        else if(selected==0){
            Country country = new Country();
            country.setName();
            country.addToList();
            this.country = country;
        }
        country = Tools.countries.get(selected);
    }
    public Country getCountry(){
        return country;
    }

    public void newCity(){
        setName();
        setCountry();
        addToList();
    }
    public void addToList(){
        Tools.cities.addLast(this);
    }
    @Override
    public String toString() {
        return name;
    }
}
