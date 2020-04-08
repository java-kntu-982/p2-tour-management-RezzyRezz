package ir.ac.kntu;


import java.util.LinkedList;
import java.util.Scanner;

public class Town {

    private String name;
    private LinkedList<String> places = new LinkedList<String>();
    private Country country;
    private boolean capital = false;
    //private LinkedList<Tour> tours = new LinkedList<Tour>();

    public void newTown()
    {
        setName();
        setPlaces();
        setCountry();
        setCapital();
    }
    public void setName()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the town's name:");
        name = input.next();
        //in.close();
    }
    public void setName(String str)
    {
        name = str;
    }

    public String getName() {
        return name;
    }
    public void setCountry(Country country)
    {
        this.country = country;
        country.addTown(this);
    }
    public void setCountry()
    {
        if(List.countries.size()>0)
        {
            System.out.println("Select Country");
            {
                for(int i=0;i<List.countries.size();i++)
                {
                    System.out.println((i+1)+". "+ List.countries.get(i).getName()+"\n");
                }
                Scanner in = new Scanner(System.in);
                int select = in.nextInt();
                while (select>List.countries.size()||select<1)
                {
                    System.out.println("Answer out of range. Select again: ");
                    select = in.nextInt();
                }
                country =List.countries.get(select-1);
                List.countries.get(select-1).addTown(this);
                //in.close();
            }
        }
        else
            System.out.println("No countries have been registered. Add a country first.");
    }
    public Country getCountry()
    {
        return country;
    }

    public void setPlaces(String str)
    {
        places.addLast(str);
    }
    public void setPlaces()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the tourist sight's name:");
        String sightName = in.nextLine();
        places.addLast(sightName);
        //in.close();
    }
    public void removePlaces()
    {
        for(int i=0;i<places.size();i++)
        {
            System.out.println((i+1)+". "+places.get(i));
        }
        System.out.println("Select the place you want to remove");
        Scanner in = new Scanner(System.in);
        int ans = in.nextInt();
        ans--;
        places.remove(ans);
    }
    public void getPlaces()
    {
        if(places.size()<1)
            System.out.println("No sights have been registered.");
        else
        {
            for(int i=0;i<places.size();i++)
            {
                System.out.println((i+1) + ". " + places.get(i) + "\n");
            }
        }
    }
    public void setCapital(boolean answer)
    {
        capital = answer;
    }
    public void setCapital()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Is "+ name + " the capital?\n(Enter 1 for yes,2 for no)");
        int answer = in.nextInt();
        while (answer!=1&&answer!=2)
        {
            System.out.println("Enter 1 or 2:");
            answer = in.nextInt();
        }
        if(answer==1)
        {
            capital = true;
        }
        else
            capital = false;
        //in.close();
    }
    public boolean getCapital()
    {
        return capital;
    }
}
