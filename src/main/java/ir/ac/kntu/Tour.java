package ir.ac.kntu;

import java.util.LinkedList;
import java.util.Scanner;


public class Tour
{
    //private boolean foreign;
    private Country country;
    private int days;
    private int price;
    private int minParticipants;
    private int maxParticipants;
    private Town startsAt;
    private Town endsAt;
    private Date startDate;
    private Date endDate;

    public void setStartDate()
    {
        System.out.println("Enter the year the tour starts at:");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Enter the month the tour starts at: ");
        int month = in.nextInt();
        System.out.println("Enter the day the tour starts at: ");
        int day = in.nextInt();
        startDate = new Date(year,month,day);
    }
    public Date getStartDate()
    {
        return startDate;
    }
    public void setEndDate()
    {
        System.out.println("Enter the year the tour ends at:");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Enter the month the tour ends at: ");
        int month = in.nextInt();
        System.out.println("Enter the day the tour ends at: ");
        int day = in.nextInt();
        endDate = new Date(year,month,day);
    }
    public Date getEndDate()
    {
        return endDate;
    }
    public void newTour()
    {
        setCountry();
        this.setDays();
        this.setPrice();
        setStartsAt();
        setEndsAt();
        setMaxParticipants();
        setMinParticipants();
        addTourType();
        finalizeTour();
        return;
    }
    public void addTourType()
    {
        if(List.tourType.size()==0)
            List.tourType.addLast(startsAt.getName());
        else
        {
            int flag=0;
            for(int i=0;i<List.tourType.size();i++)
            {
                if(List.tourType.get(i)==startsAt.getName())
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                List.tourType.addLast(startsAt.getName());
        }
   }
    public void setCountry()
    {
        System.out.println("Select the country:");
        for(int i=0;i<List.countries.size();i++)
        {
            System.out.println((i+1)+". "+List.countries.get(i).getName());
        }
        Scanner in = new Scanner(System.in);
        int select = in.nextInt();
        select--;
        country = List.countries.get(select);
    }
    public Country getCountry()
    {
        return country;
    }
    public void setDays()
    {
        System.out.println("Enter the length of the tour in days:");
        Scanner input = new Scanner(System.in);
        days = input.nextInt();
    }
    public void setDays(int x)
    {
        days = x;
    }
    public int getDays()
    {
        return days;
    }
    public void setPrice()
    {
        System.out.println("Enter the price of the tour in Tomans:");
        Scanner input = new Scanner(System.in);
        price = input.nextInt();
    }
    public void setPrice(int x)
    {
        price = x;
    }
    public int getPrice()
    {
        return price;
    }
    public void setMinParticipants()
    {
        System.out.println("Enter the minimum amount of participants for tour:");
        Scanner input = new Scanner(System.in);
        minParticipants = input.nextInt();
    }
    public void setMinParticipants(int x)
    {
        minParticipants = x;
    }
    public int getMinParticipants()
    {
        return minParticipants;
    }
    public void setMaxParticipants()
    {
        System.out.println("Enter the maximum amount of participants for tour:");
        Scanner in = new Scanner(System.in);
        maxParticipants = in.nextInt();
    }
    public void setMaxParticipants(int x)
    {
        maxParticipants = x;
    }
    public int getMaxParticipants()
    {
        return maxParticipants;
    }
    public void setStartsAt()
    {
            System.out.println("Select the town the tour starts at:");
            for(int i=0;i<country.getTownListSize();i++)
            {
                System.out.println((i+1)+". "+country.getTowns(i).getName());
            }
            Scanner in = new Scanner(System.in);
            int select = in.nextInt();
            select--;
            startsAt = country.getTowns(select);
    }
    public void setStartsAt(Town town)
    {
        startsAt = town;
    }
    public Town getStartsAt()
    {
        return startsAt;
    }
    public void setEndsAt()
    {
        if(country.getForeign()==true)
            endsAt = country.getCapital();
        else
        {
            System.out.println("Select the town the tour ends at:");
            for(int i=0;i<country.getTownListSize();i++)
            {
                System.out.println((i+1)+". "+country.getTowns(i).getName());
            }
            Scanner in = new Scanner(System.in);
            int select = in.nextInt();
            select--;
            endsAt = country.getTowns(select);
        }
    }
    public void setEndsAt(Town town)
    {
        endsAt = town;
    }
    public Town getEndsAt()
    {
        return endsAt;
    }
    public void finalizeTour()
    {
        List.tours.addLast(this);
    }
}
