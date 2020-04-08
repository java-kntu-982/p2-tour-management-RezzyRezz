package ir.ac.kntu;

import java.util.LinkedList;
import java.util.Scanner;

public class Country {

    private String name;
    private LinkedList<Town> towns = new LinkedList<Town>();
    private Town capital;
    private boolean foreign;

    public void newCountry()
    {
        setName();
        addNewTown();
        setForeign();
        finalizeCountry();
    }
    public void setForeign()
    {
        if(name=="Iran")
            foreign = false;
        else
            foreign = true;
    }
    public boolean getForeign()
    {
        return foreign;
    }

    public Town getTowns(int x)
    {
        return towns.get(x);
    }
    public int getTownListSize()
    {
        return towns.size();
    }
    public void finalizeCountry() //Should be done at the end of Country creation.
    {
        List.countries.addLast(this);
        return;
    }
    public void setName()
    {
        System.out.println("Enter the country's name:");
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        //in.close();
        return;
    }
    public void setName(String str)
    {
        name = str;
    }
    public String getName()
    {
        return name;
    }
    public void addTown(Town town)
    {
        towns.addLast(town);
        if(town.getCapital() == true)
            capital = town;
        return;
    }
    public void addNewTown()
    {
        Town newTown = new Town();
        newTown.setCountry(this);
        newTown.setName();
        System.out.println("Do you want to add sights to "+newTown.getName()+" ? Enter 1 for yes, anything else for no");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        if(answer==1)
        {
            while (answer==1)
            {
                newTown.setPlaces();
                System.out.println("Do you want to add another sight to "+newTown.getName()+" ? Enter 1 for yes, anything else for no");
                answer = in.nextInt();
            }
        }
        newTown.setCapital();
        if(newTown.getCapital()==true)
            capital = newTown;
        this.addToTownsList(newTown);

    }
    public void addToTownsList(Town town)
    {
        towns.addLast(town);
    }
    public Town getCapital()
    {
        return capital;
    }
}
