package ir.ac.kntu;

import ir.ac.kntu.maputil.MapUtil;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    //public static LinkedList<Country> countryList = new LinkedList<Country>();
    public static void main(String[] args) {

        loader();
        while (true)
        {
            int remote;
            System.out.println("Enter 1 for Tour Leader menus.");
            System.out.println("Enter 2 for Tour menus.");
            System.out.println("Enter 3 for Location menus.");
            System.out.println("Enter 0 to exit.");
            Scanner in = new Scanner(System.in);
            remote = in.nextInt();
            if(remote==1)
            {
                System.out.println("Enter 1 to view all Leaders.");
                System.out.println("Enter 2 to add a new Leader.");
                System.out.println("Enter 3 to remove a Leader.");
                System.out.println("Enter 4 to edit a leader.");
                remote = in.nextInt();
                if(remote==1)
                {
                    for(int i=0;i<List.leaders.size();i++)
                    {
                        System.out.println((i+1)+". "+List.leaders.get(i).getFullName());
                        System.out.println("- National I.D: "+List.leaders.get(i).getNationalId());
                        System.out.println("- Date of Birth: "+List.leaders.get(i).getDob().toString());
                        System.out.println("- Datoe of Employment"+List.leaders.get(i).getDoe().toString());
                        List.leaders.get(i).getKnownTowns();
                        List.leaders.get(i).getKnownCountries();
                        System.out.println("- Married: "+List.leaders.get(i).getMarried());
                    }
                }
                else if(remote==2)
                {
                    Leader newLeader = new Leader();
                    newLeader.newLeader();
                    remote=10;
                }
                else if(remote==3)
                {
                    for(int i=0;i<List.leaders.size();i++)
                    {
                        System.out.println((i+1) + ". " + List.leaders.get(i).getFullName());
                    }
                    System.out.println("Enter the number:");
                    remote = in.nextInt();
                    remote--;
                    List.leaders.remove(remote);
                }
                else if(remote==4)
                {
                    for(int i=0;i<List.leaders.size();i++)
                    {
                        System.out.println((i + 1) + ". " + List.leaders.get(i).getFullName());
                    }
                    System.out.println("Select the Leader you want to edit:");
                    remote = in.nextInt();
                    int select = remote - 1;
                    System.out.println("To edit name enter 1:");
                    System.out.println("To edit national i.d enter 2:");
                    System.out.println("To edit date of birth enter 3:");
                    System.out.println("To edit date of employment enter 4:");
                    System.out.println("To edit known towns enter 5:");
                    System.out.println("To edit known countries enter 6:");
                    System.out.println("To edit marriage status enter 7:");
                    System.out.println("To go back enter 9");
                    remote = in.nextInt();
                    if(remote==1)
                    {
                        List.leaders.get(select).setFirstName();
                        List.leaders.get(select).setLastName();
                    }
                    else if(remote==2)
                    {
                        List.leaders.get(select).setNationalId();
                    }
                    else if(remote==3)
                    {
                        List.leaders.get(select).setDob();
                    }
                    else if(remote==4)
                    {
                        List.leaders.get(select).setDoe();
                    }
                    else if(remote==5)
                    {
                        System.out.println("Enter 1 to add to known towns.");
                        System.out.println("Enter 2 to remove known towns.");
                        remote = in.nextInt();
                        if(remote==1)
                            List.leaders.get(select).setKnownTowns();
                        if(remote==2)
                            List.leaders.get(select).removeKnownTowns();
                    }
                    else if(remote==6)
                    {
                        System.out.println("Enter 1 to add to known countries.");
                        System.out.println("Enter 2 to remove known countries.");
                        remote = in.nextInt();
                        if(remote==1)
                            List.leaders.get(select).setKnownCountries();
                        if(remote==2)
                            List.leaders.get(select).removeKnownCountries();
                    }
                    else if(remote==7)
                    {
                        List.leaders.get(select).setMarried();
                    }
                }
                else if(remote==0)
                    break;
            }
            else if(remote==2)
            {
                System.out.println("Enter 1 to see all tour types.");
                System.out.println("Enter 2 to see all available tours.");
                System.out.println("Enter 3 to add a new tour.");
                System.out.println("Enter 4 to edit a tour.");
                System.out.println("Enter 5 to remove a tour.");
                //6 for search

                remote=in.nextInt();
                if(remote==1)
                {
                    for(int i=0;i<List.tourType.size();i++)
                    {
                        System.out.println((i+1)+". "+List.tourType.get(i));
                    }
                    System.out.println("Enter any number to go back:");
                    remote=in.nextInt();
                }
                else if(remote==2)
                {
                    for(int i=0;i<List.tours.size();i++)
                    {
                        System.out.println((i+1)+". "+List.tours.get(i).getStartsAt().getName());
                        System.out.println("From "+List.tours.get(i).getStartDate().toString()+" to "+List.tours.get(i).getEndDate().toString());
                    }
                    System.out.println("Enter any number to go back:");
                    remote=in.nextInt();
                }
                else if(remote==3)
                {
                    Tour newTour = new Tour();
                    newTour.newTour();
                    System.out.println("Enter any number to go back:");
                    remote=in.nextInt();
                }
                else if(remote==4)
                {
                    for(int i=0;i<List.tours.size();i++)
                    {
                        System.out.println((i+1)+". "+List.tours.get(i).getStartsAt().getName());
                        System.out.println("From "+List.tours.get(i).getStartDate().toString()+" to "+List.tours.get(i).getEndDate().toString());
                    }
                    System.out.println("Select a tour:");
                    remote = in.nextInt();
                    int select = remote-1;
                    System.out.println("To edit Country enter 1:");
                    System.out.println("To edit days enter 2:");
                    System.out.println("To edit price enter 3:");
                    System.out.println("To edit minimum of participants enter 4:");
                    System.out.println("To edit maximum of participants enter 5:");
                    System.out.println("To edit starting location of tour enter 6:");
                    System.out.println("To edit ending location of tour enter 7:");
                    System.out.println("To edit starting date of tour enter 8:");
                    System.out.println("To edit end date of tour enter 9:");
                    remote = in.nextInt();
                    if(remote==1)
                    {
                        List.tours.get(select).setCountry();
                    }
                    else if(remote==2)
                    {
                        List.tours.get(select).setDays();
                    }
                    else if(remote==3)
                    {
                        List.tours.get(select).setPrice();
                    }
                    else if(remote==4)
                    {
                        List.tours.get(select).setMinParticipants();
                    }
                    else if(remote==5)
                    {
                        List.tours.get(select).setMaxParticipants();
                    }
                    else if(remote==6)
                    {
                        List.tours.get(select).setStartsAt();
                    }
                    else if(remote==7)
                    {
                        List.tours.get(select).setEndsAt();
                    }
                    else if(remote==8)
                    {
                        List.tours.get(select).setStartDate();
                    }
                    else if(remote==9)
                    {
                        List.tours.get(select).setEndDate();
                    }
                }
                else if(remote==5)
                {
                    for(int i=0;i<List.tours.size();i++)
                    {
                        System.out.println((i+1)+". "+List.tours.get(i).getStartsAt().getName());
                        System.out.println("From "+List.tours.get(i).getStartDate().toString()+" to "+List.tours.get(i).getEndDate().toString());
                    }
                    System.out.println("Select the tour you want to remove:");
                    remote = in.nextInt();
                    remote--;
                    List.tours.remove(remote);
                }

            }
            else if(remote==3)
            {
                System.out.println("Enter 1 to view all locations.");
                System.out.println("Enter 2 to add a new location.");
                System.out.println("Enter 3 to edit a location.");
                remote = in.nextInt();
                if(remote==1)
                {
                    for(int i=0;i<List.countries.size();i++)
                    {
                        System.out.println((i+1)+". "+List.countries.get(i).getName());
                        for(int j=0;j<List.countries.get(i).getTownListSize();i++)
                        {
                            System.out.println("- "+List.countries.get(i).getTowns(j).getName());
                        }
                    }
                    System.out.println("Enter anything to go back.");
                    remote = in.nextInt();
                }
                else if(remote==2)
                {
                    System.out.println("Enter 1 to add a country.");
                    System.out.println("Enter 2 to add a town.");
                    remote = in.nextInt();
                    if(remote==1)
                    {
                        Country newCountry = new Country();
                        newCountry.newCountry();
                    }
                    else if(remote==2)
                    {
                        Town newTown = new Town();
                        newTown.newTown();
                    }
                }
                else if(remote==3)
                {
                    System.out.println("Enter 1 to edit a country.");
                    System.out.println("Enter 2 to edit a town.");
                    remote = in.nextInt();
                    if(remote==1)
                    {
                        for(int i=0;i<List.countries.size();i++)
                        {
                            System.out.println((i+1)+". "+List.countries.get(i).getName());
                        }
                        System.out.println("Select the country you want to edit:");
                        remote = in.nextInt();
                        int select = remote -1;
                        System.out.println("To edit name enter 1:");
                        //System.out.println("To remove country enter 2:");
                        remote = in.nextInt();
                        if(remote==1)
                        {
                            List.countries.get(select).setName();
                        }
                        //else if(remote==2)
                        //{
                        //    List.countries.remove(select);
                        //}
                    }
                    else if(remote==2)
                    {
                        for(int i=0;i<List.countries.size();i++)
                        {
                            System.out.println((i+1)+". "+List.countries.get(i).getName());
                        }
                        System.out.println("Select the country the town is in.");
                        remote = in.nextInt();
                        int select = remote - 1;
                        for(int i=0;i<List.countries.get(select).getTownListSize();i++)
                        {
                            System.out.println((i+1)+". "+List.countries.get(select).getTowns(i).getName());
                        }
                        remote = in.nextInt();
                        int select2 = remote - 1;
                        System.out.println("Enter 1 to edit name.");
                        System.out.println("Enter 2 to edit places.");
                        System.out.println("Enter 3 to edit country.");
                        System.out.println("Enter 4 to edit capital status.");
                        remote = in.nextInt();
                        if(remote==1)
                        {
                            List.countries.get(select).getTowns(select2).setName();
                        }
                        else if(remote==2)
                        {
                            System.out.println("Enter 1 to add a place.");
                            System.out.println("Enter 2 to remove a place.");
                            remote = in.nextInt();
                            if(remote==1)
                                List.countries.get(select).getTowns(select2).setPlaces();
                            if(remote==2)
                                List.countries.get(select).getTowns(select2).removePlaces();
                        }
                        else if(remote==3)
                        {
                            List.countries.get(select).getTowns(select2).setCountry();
                        }
                        else if(remote==4)
                        {
                            List.countries.get(select).getTowns(select2).setCapital();
                        }
                    }
                }
            }
        }

    }
    public static void loader()
    {
        Country iran = new Country();
        iran.setName("Iran");
        Town tehran = new Town();
        tehran.setName("Tehran");
        tehran.setCapital(true);
        tehran.setCountry(iran);
        tehran.setPlaces("Meydan e Azadi");tehran.setPlaces("Meydan e Enghelab");tehran.setPlaces("Sa'd Abad Palace");
        Town mashhad = new Town();
        mashhad.setName("Mashhad");
        //mashhad.setCapital(false);
        mashhad.setPlaces("Haram e Motahar");mashhad.setPlaces("Museum");
        mashhad.setCountry(iran);
        iran.finalizeCountry();
        Country turkey = new Country();
        turkey.setName("Turkey");
        Town istanbul = new Town();
        istanbul.setName("Istanbul");
        istanbul.setCapital(true);
        istanbul.setCountry(turkey);
        istanbul.setPlaces("Hagia Sophia");istanbul.setPlaces("Grand Bazaar");
        turkey.finalizeCountry();
        return;
    }

}
