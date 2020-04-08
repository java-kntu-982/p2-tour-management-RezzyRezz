package ir.ac.kntu;


import java.util.LinkedList;
import java.util.Scanner;

public class Leader {

    private String firstName;
    private String lastName;
    private int nationalId;
    private Date dob;
    private Date doe;//Date of Employment
    private LinkedList<Town> knownTowns = new LinkedList<Town>();//Town knownTowns;//------------NOT DONE
    private LinkedList<Country> knownCountries = new LinkedList<Country>();
    private boolean married;

    public void newLeader()
    {
        setFirstName();
        setLastName();
        setNationalId();
        setDob();
        setDoe();
        setKnownTowns();
        setKnownCountries();
        setMarried();
        finalizeLeader();
    }
    public void finalizeLeader()
    {
        List.leaders.addLast(this);
    }
    public void removeKnownTowns()
    {
        for(int i=0;i<knownTowns.size();i++)
            System.out.println((i+1)+". "+knownTowns.get(i).getName());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the town you want to remove:");
        int ans = in.nextInt();
        ans--;
        knownTowns.remove(ans);
    }
    public void setKnownTowns()
    {
        System.out.println("Select the country:");
        Scanner in = new Scanner(System.in);
        if(List.countries.size()<1)
        {
            System.out.println("No countries have been registered. Add a country first.\nPress Enter to go back.");
            String temp = in.nextLine();
            return;
        }
        for(int i=0;i<List.countries.size();i++)
        {
            System.out.println((i+1)+". "+List.countries.get(i).getName());
        }
        int answer = in.nextInt();
        if(answer==0)
            return;
        while (answer>List.countries.size()||answer<1)
        {
            System.out.println("Answer not recognized. Enter 1 to "+List.countries.size());
            answer = in.nextInt();
        }
        answer--;
        if(List.countries.get(answer).getTownListSize()<1)
        {
            System.out.println("No towns have been registered in this country. Add a town first.\nPress Enter to go back.");
            String temp = in.nextLine();
            return;
        }
        System.out.println("Select the town:");
        for(int i=0;i<List.countries.get(answer).getTownListSize();i++)
        {
            System.out.println((i+1)+". "+List.countries.get(answer).getTowns(i).getName());
        }
        int secAnswer = in.nextInt();
        if(secAnswer==0)
            return;
        while (secAnswer>List.countries.get(answer).getTownListSize()||secAnswer<1)
        {
            System.out.println("Answer not recognized. Enter 1 to "+List.countries.get(answer).getTownListSize());
            secAnswer = in.nextInt();
        }
        knownTowns.addLast(List.countries.get(answer).getTowns(secAnswer));

    }
    public void getKnownTowns()
    {
        System.out.println("- Known Towns:");
        for(int i=0;i<knownTowns.size();i++)
        {
            System.out.println("    "+(i+1)+". "+knownTowns.get(i).getName());
        }
    }
    public void removeKnownCountries()
    {
        for(int i=0;i<knownCountries.size();i++)
            System.out.println((i+1)+". "+knownCountries.get(i).getName());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Country you want to remove:");
        int ans = in.nextInt();
        ans--;
        knownCountries.remove(ans);
    }
    public void setKnownCountries()
    {
        System.out.println("Select know foreign countries:");
        {
            if(List.countries.size()<1)
            {
                System.out.println("No countries have been registered");
                return;
            }
            for(int i=0;i<List.countries.size();i++)
            {
                    System.out.println((i+1)+". "+ List.countries.get(i).getName());
            }
            System.out.println("Enter the number of the country:");
            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();
            if(answer==0)
                return;
            while(answer<0||answer>List.countries.size())
            {
                System.out.println("Wrong input. Enter number again:");
                answer = in.nextInt();
            }
            answer--;
            while(List.countries.get(answer).getForeign()==false)
            {
                System.out.println("Country not foreign. Enter number again:");
                answer = in.nextInt();
                if(answer==0)
                    return;
                answer--;
            }
            knownCountries.addLast(List.countries.get(answer));
        }
    }
    public void getKnownCountries()
    {
        System.out.println("- Known Countries:");
        for(int i=0;i<knownCountries.size();i++)
        {
            System.out.println("    "+(i+1)+". "+knownCountries.get(i).getName());
        }
    }
    public void setFirstName()
    {
        System.out.println("Enter the first name of the leader:");
        Scanner in = new Scanner(System.in);
        firstName = in.nextLine();
        //in.close();
    }
    public void setLastName()
    {
        System.out.println("Enter the last name of the leader:");
        Scanner in = new Scanner(System.in);
        lastName = in.nextLine();
        //in.close();
    }
    public String getFullName()
    {
        return (firstName+" "+lastName);
    }
    public void setNationalId()
    {
        System.out.println("Enter the national id of the leader:");
        Scanner in = new Scanner(System.in);
        nationalId = in.nextInt();
        //in.close();
    }
    public int getNationalId()
    {
        return nationalId;
    }
    public void setDob()
    {
        System.out.println("Enter the year of birth: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Enter the month of birth: ");
        int month = in.nextInt();
        System.out.println("Enter day of birth: ");
        int day = in.nextInt();
        dob = new Date(year,month,day);
        //in.close();
    }
    public Date getDob()
    {
        return dob;
    }
    public void setDoe()
    {
        System.out.println("Enter the year of employment: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.println("Enter the month of employment: ");
        int month = in.nextInt();
        System.out.println("Enter the day of employment: ");
        int day = in.nextInt();
        doe = new Date(year,month,day);
        //in.close();
    }
    public Date getDoe()
    {
        return doe;
    }
    public void setMarried()
    {
        System.out.println("Is he/she married?\n(Enter 1 for yes, 2 for no)");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt() ;
        if(input==1)
        {
            married = true;
            return;
        }
        else if(input==2)
        {
            married = false;
            return;
        }
        while (input!=1||input!=2)
        {
            System.out.println("*** Answer not recognized ***\nIs he/she married?\n(Enter 1 for yes, 2 for no)");
            input = in.nextInt();
            if(input==1)
            {
                married = true;
                return;
            }
            else if(input==2)
            {
                married = false;
                return;
            }
        }
    }
    public boolean getMarried()
    {
        return married;
    }
}
