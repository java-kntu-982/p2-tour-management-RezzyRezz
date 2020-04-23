package ir.ac.kntu;

import java.util.Scanner;

public class Country {
    private String name;
    private boolean foreign = true;
    public Country(){
    }
    public Country(String str,boolean foreign){
        name = str;
        this.foreign=foreign;
        //foreign = f;
        addToList();
    }

    public void newCountry(){
        setName();
        addToList();
    }
    public void setName(){
        System.out.println("Country Name:");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
    }
    public String getName(){
        return name;
    }
    public void setAsHomeCountry(){
        foreign = false;
        for(int i=0;i<Tools.countries.size();i++){
            if(!Tools.countries.get(i).getForeign()){
                Tools.countries.get(i).setForeign();
                break;
            }
        }
    }
    public boolean getForeign(){
        return foreign;
    }

    public void setForeign(){
        foreign = true;
    }

    public void addToList(){
        Tools.countries.addLast(this);
    }


    @Override
    public String toString() {
        return name;
    }
}
