package ir.ac.kntu;

import org.antlr.v4.runtime.atn.PredictionMode;

import javax.tools.Tool;
import java.util.Scanner;

public class Menu {
    public void tourLeader(Leader me) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 to view all Leaders.");
        System.out.println("Enter 2 to add a new Leader.");
        System.out.println("Enter 3 to remove a Leader.");
        System.out.println("Enter 4 to edit a leader.");
        System.out.println("Enter 5 to add a customer.");
        System.out.println("Enter 0 to log out.");
        int remote = in.nextInt();
        if (remote == 1) {
            System.out.println("List of all Leaders:");
            for (int i = 0; i < Tools.leaders.size(); i++) {
                System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                System.out.println("- National I.D: " + Tools.leaders.get(i).getMelliCode());
                System.out.println("- Date of Birth: " + Tools.leaders.get(i).getDob().toString());
                System.out.println("- Date of Employment" + Tools.leaders.get(i).getDoe().toString());
                Tools.leaders.get(i).getKnownCities();
                Tools.leaders.get(i).getKnownCountries();
                System.out.println("- Married: " + Tools.leaders.get(i).getMarried());
            }
        } else if (remote == 2) {
            System.out.println("Add new Leader:");
            Leader temp = new Leader();
            {
                temp.setName();
                temp.setMelliCode();
                temp.setShenasnameNumber();
                temp.setDob();
                temp.setDoe();
                temp.setKnownCities();
                temp.setKnownCountries();
                temp.setMarried();
                temp.addToList();
            }
        } else if (remote == 3) {
            System.out.println("Delete Leader:");
            for (int i = 0; i < Tools.leaders.size(); i++) {
                System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
            }
            System.out.println("Enter the number:");
            remote = in.nextInt();
            remote--;
            for (int i = 0; i < Tools.users.size(); i++) {
                if (Tools.users.get(i).getUsername().equals(Tools.leaders.get(remote).getUsername())) {
                    Tools.users.remove(i);
                }
            }
            Tools.leaders.remove(remote);
        } else if (remote == 4) {
            for (int i = 0; i < Tools.leaders.size(); i++) {
                System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
            }
            System.out.println("Select the Leader you want to edit:");
            remote = in.nextInt();
            int select = remote - 1;
            System.out.println("To edit name enter 1:");
            System.out.println("To edit Melli Code enter 2:");
            System.out.println("To edit Shenasname Number enter 3:");
            System.out.println("To edit date of birth enter 4:");
            System.out.println("To edit date of employment enter 5:");
            System.out.println("To edit known towns enter 6:");
            System.out.println("To edit known countries enter 7:");
            System.out.println("To edit marriage status enter 8:");
            System.out.println("To go back enter 0");
            remote = in.nextInt();
            if (remote == 1) {
                Tools.leaders.get(select).setName();
            } else if (remote == 2) {
                Tools.leaders.get(select).setMelliCode();
            } else if (remote == 3) {
                Tools.leaders.get(select).setShenasnameNumber();
            } else if (remote == 4) {
                Tools.leaders.get(select).setDob();
            } else if (remote == 5) {
                Tools.leaders.get(select).setDoe();
            } else if (remote == 6) {
                System.out.println("Enter 1 to add to known Cities.");
                System.out.println("Enter 2 to remove known Cities.");
                remote = in.nextInt();
                if (remote == 1)
                    Tools.leaders.get(select).setKnownCities();
                if (remote == 2)
                    Tools.leaders.get(select).removeKnownCities();
            } else if (remote == 7) {
                System.out.println("Enter 1 to add to known countries.");
                System.out.println("Enter 2 to remove known countries.");
                remote = in.nextInt();
                if (remote == 1)
                    Tools.leaders.get(select).setKnownCountries();
                if (remote == 2)
                    Tools.leaders.get(select).removeKnownCountries();
            } else if (remote == 8) {
                Tools.leaders.get(select).setMarried();
            }
        } else if (remote == 5) {
            me.addCustomer();
        } else if (remote == 0) {
            return;
        }
    }

    public void admin(Admin admin) {
        int remote;
        System.out.println("Enter 1 for Tour Leader menus.");
        System.out.println("Enter 2 for Tour menus.");
        System.out.println("Enter 3 for Location menus.");
        System.out.println("Enter 4 for employee menus.");
        System.out.println("Enter 0 to log out.");
        Scanner in = new Scanner(System.in);
        remote = in.nextInt();
        if (remote == 1) {
            in = new Scanner(System.in);
            System.out.println("Enter 1 to view all Leaders.");
            System.out.println("Enter 2 to add a new Leader.");
            System.out.println("Enter 3 to remove a Leader.");
            System.out.println("Enter 4 to edit a leader.");
            System.out.println("Enter 0 to go back.");
            remote = in.nextInt();
            if (remote == 1) {
                System.out.println("List of all Leaders:");
                for (int i = 0; i < Tools.leaders.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                    System.out.println("- National I.D: " + Tools.leaders.get(i).getMelliCode());
                    System.out.println("- Date of Birth: " + Tools.leaders.get(i).getDob().toString());
                    System.out.println("- Date of Employment" + Tools.leaders.get(i).getDoe().toString());
                    Tools.leaders.get(i).getKnownCities();
                    Tools.leaders.get(i).getKnownCountries();
                    System.out.println("- Married: " + Tools.leaders.get(i).getMarried());
                }
            } else if (remote == 2) {
                System.out.println("Add new Leader:");
                Leader temp = new Leader();
                {
                    temp.setName();
                    temp.setMelliCode();
                    temp.setShenasnameNumber();
                    temp.setDob();
                    temp.setDoe();
                    temp.setKnownCities();
                    temp.setKnownCountries();
                    temp.setMarried();
                    temp.addToList();
                }
            } else if (remote == 3) {
                System.out.println("Delete Leader:");
                for (int i = 0; i < Tools.leaders.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                }
                System.out.println("Enter the number:");
                remote = in.nextInt();
                remote--;
                for (int i = 0; i < Tools.users.size(); i++) {
                    if (Tools.users.get(i).getUsername().equals(Tools.leaders.get(remote).getUsername())) {
                        Tools.users.remove(i);
                    }
                }
                Tools.leaders.remove(remote);
            } else if (remote == 4) {
                for (int i = 0; i < Tools.leaders.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                }
                System.out.println("Select the Leader you want to edit:");
                remote = in.nextInt();
                int select = remote - 1;
                System.out.println("To edit name enter 1:");
                System.out.println("To edit Melli Code enter 2:");
                System.out.println("To edit Shenasname Number enter 3:");
                System.out.println("To edit date of birth enter 4:");
                System.out.println("To edit date of employment enter 5:");
                System.out.println("To edit known towns enter 6:");
                System.out.println("To edit known countries enter 7:");
                System.out.println("To edit marriage status enter 8:");
                System.out.println("To go back enter 0");
                remote = in.nextInt();
                if (remote == 1) {
                    Tools.leaders.get(select).setName();
                } else if (remote == 2) {
                    Tools.leaders.get(select).setMelliCode();
                } else if (remote == 3) {
                    Tools.leaders.get(select).setShenasnameNumber();
                } else if (remote == 4) {
                    Tools.leaders.get(select).setDob();
                } else if (remote == 5) {
                    Tools.leaders.get(select).setDoe();
                } else if (remote == 6) {
                    System.out.println("Enter 1 to add to known Cities.");
                    System.out.println("Enter 2 to remove known Cities.");
                    remote = in.nextInt();
                    if (remote == 1)
                        Tools.leaders.get(select).setKnownCities();
                    if (remote == 2)
                        Tools.leaders.get(select).removeKnownCities();
                } else if (remote == 7) {
                    System.out.println("Enter 1 to add to known countries.");
                    System.out.println("Enter 2 to remove known countries.");
                    remote = in.nextInt();
                    if (remote == 1)
                        Tools.leaders.get(select).setKnownCountries();
                    if (remote == 2)
                        Tools.leaders.get(select).removeKnownCountries();
                } else if (remote == 8) {
                    Tools.leaders.get(select).setMarried();
                }
            } else if (remote == 0) {
                return;
            }
        } else if (remote == 2) {
            System.out.println("Enter 1 to see all tour types.");
            System.out.println("Enter 2 to see all available tours.");
            System.out.println("Enter 3 to add a new tour.");
            System.out.println("Enter 4 to edit a tour.");
            System.out.println("Enter 5 to remove a tour.");
            //6 for search

            remote = in.nextInt();
            if (remote == 1) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i));
                }
                System.out.println("Enter any number to go back:");
                remote = in.nextInt();
            } else if (remote == 2) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i).getStartPoint().getName());
                    System.out.println("From " + Tools.tours.get(i).getStartDate() + " to " + Tools.tours.get(i).getEndDate());
                }
                System.out.println("Enter any number to go back:");
                remote = in.nextInt();
            } else if (remote == 3) {
                Tour newTour = new Tour();
                newTour.newTour();
                System.out.println("Enter any number to go back:");
                remote = in.nextInt();
            } else if (remote == 4) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i).getStartPoint().getName());
                    System.out.println("From " + Tools.tours.get(i).getStartDate() + " to " + Tools.tours.get(i).getEndDate());
                    System.out.println("Select a tour:");
                    remote = in.nextInt();
                    int select = remote - 1;
                    System.out.println("To edit length of the tour");
                    System.out.println("To edit price enter 2:");
                    System.out.println("To edit minimum of participants enter 3:");
                    System.out.println("To edit maximum of participants enter 4:");
                    System.out.println("To edit starting location of tour enter 5:");//
                    System.out.println("To edit ending location of tour enter 6:");//
                    System.out.println("To edit the leader of the tour enter 7:");
                    System.out.println("To edit the id of the tour 8:");
                    System.out.println("To edit start date of tour enter 9:");
                    System.out.println("To edit end date of tour enter 9:");
                    remote = in.nextInt();
                    if (remote == 1) {
                        Tools.tours.get(select).setLengthInDays();
                    } else if (remote == 2) {
                        Tools.tours.get(select).setPrice();
                    } else if (remote == 3) {
                        Tools.tours.get(select).setMinSize();
                    } else if (remote == 4) {
                        Tools.tours.get(select).setMaxSize();
                    } else if (remote == 5) {
                        System.out.println("Select the Country the tour starts at:");
                        Tools.listPrinter(Tools.countries);
                        int select2 = Tools.listChooser(Tools.countries);
                        Country country = Tools.countries.get(select2);
                        System.out.println("Select the city the tour starts at:");
                        for (int j = 0; j < Tools.cities.size(); i++) {
                            if (Tools.cities.get(j).getCountry().equals(country)) {
                                System.out.println((j + 1) + ". " + Tools.cities.get(i).getName());
                            }
                        }
                        select2 = in.nextInt();
                        select2--;
                        Tools.tours.get(select).setStartPoint(Tools.cities.get(select2));
                    } else if (remote == 6) {
                        System.out.println("Select the Country the tour ends at:");
                        Tools.listPrinter(Tools.countries);
                        int select2 = Tools.listChooser(Tools.countries);
                        Country country = Tools.countries.get(select2);
                        System.out.println("Select the city the tour ends at:");
                        for (int j = 0; j < Tools.cities.size(); i++) {
                            if (Tools.cities.get(j).getCountry().equals(country)) {
                                System.out.println((j + 1) + ". " + Tools.cities.get(i).getName());
                            }
                        }
                        select2 = in.nextInt();
                        select2--;
                        Tools.tours.get(select).setEndPoint(Tools.cities.get(select2));
                    } else if (remote == 7) {
                        System.out.println("Select the leader of the Tour");
                        for (i = 0; i < Tools.leaders.size(); i++) {
                            for (int j = 0; j < Tools.leaders.get(i).getKnownCities().size(); j++) {
                                if (Tools.leaders.get(i).getKnownCities().get(j).equals(Tools.tours.get(select).getStartPoint().getCountry())) {
                                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                                }
                            }
                        }
                        int ans = Tools.listChooser(Tools.leaders);
                        Tools.tours.get(select).setLeader(Tools.leaders.get(ans));
                    } else if (remote == 8) {
                        Tools.tours.get(select).setId();
                    } else if (remote == 9) {
                        Tools.tours.get(select).setStartDate();
                    } else if (remote == 10) {
                        Tools.tours.get(select).setEndDate();
                    }
                }
            } else if (remote == 5) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i).getStartPoint().getName());
                    System.out.println("From " + Tools.tours.get(i).getStartDate() + " to " + Tools.tours.get(i).getEndDate());
                }
                System.out.println("Select the tour you want to remove:");
                remote = in.nextInt();
                remote--;
                Tools.tours.remove(remote);
            }

        }
        else if (remote == 3) {
            System.out.println("To view all locations enter 1:");
            remote = in.nextInt();
            if (remote == 1) {
                for (int i = 0; i < Tools.countries.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.countries.get(i).getName());
                    for (int j = 0; j < Tools.cities.size(); i++) {
                        if (Tools.cities.get(j).getCountry().equals(Tools.countries.get(i)))
                            System.out.println("- " + Tools.cities.get(j).getName());
                    }
                }
                System.out.println("Enter anything to go back.");
                remote = in.nextInt();
            } else if (remote == 2) {
                System.out.println("Enter 1 to add a country.");
                System.out.println("Enter 2 to add a city.");
                remote = in.nextInt();
                if (remote == 1) {
                    Country country = new Country();
                    country.newCountry();
                } else if (remote == 2) {
                    City city = new City();
                    city.newCity();
                }
                System.out.println("Enter anything to go back.");
                remote = in.nextInt();
            }
        }
        else if(remote==4){
            System.out.println("Enter 1 to add a new admin.");
            System.out.println("Enter 2 to add a new tour leader.");
            System.out.println("Enter 3 to add a new employee");
            System.out.println("Enter 4 to add new customer.");
            System.out.println("Enter 5 to view all admins.");
            System.out.println("Enter 6 to view all employees");
            System.out.println("Enter 7 to view all customers");
            System.out.println("Enter 8 to view all tour leaders");

            remote = in.nextInt();
            if(remote==1){
                admin.addAdmin();
            }
            else if(remote==2){
                //-------------------------
                admin.addTourLeader();
            }
            else if(remote==3){
                admin.addEmployee();
            }
            else if(remote==4){
                admin.addCustomer();
            }
            else if(remote==5){
                for(int i=0;i<Tools.users.size();i++){
                    if(Tools.users.get(i).getClass() == Admin.class){
                        System.out.println("- "+Tools.users.get(i).getUsername());
                    }
                }
            }
            else if(remote==6){
                for(int i=0;i<Tools.users.size();i++){
                    if(Tools.users.get(i).getClass() == Employee.class){
                        System.out.println("- "+Tools.users.get(i).getUsername());
                    }
                }
            }
            else if(remote==7){
                for(int i=0;i<Tools.users.size();i++){
                    if(Tools.users.get(i).getClass() == Customer.class){
                        System.out.println("- "+Tools.users.get(i).getUsername());
                    }
                }
            }
            else if(remote==8){
                for(int i=0;i<Tools.users.size();i++){
                    if(Tools.users.get(i).getClass() == Leader.class){
                        System.out.println("- "+Tools.users.get(i).getUsername());
                    }
                }
            }
            System.out.println("Enter anything to go back.");
            remote = in.nextInt();
        }
        else if (remote == 0)
            return;
    }

    public void employee(Employee employee){
        int remote;
        System.out.println("Enter 1 for Tour Leader menus.");
        System.out.println("Enter 2 for Tour menus.");
        System.out.println("Enter 3 for Location menus.");
        System.out.println("Enter 4 to add a new customer.");
        System.out.println("Enter 0 to log out.");
        Scanner in = new Scanner(System.in);
        remote = in.nextInt();
        if (remote == 1) {
            in = new Scanner(System.in);
            System.out.println("Enter 1 to view all Leaders.");
            System.out.println("Enter 2 to add a new Leader.");
            System.out.println("Enter 3 to remove a Leader.");
            System.out.println("Enter 4 to edit a leader.");
            System.out.println("Enter 0 to go back.");
            remote = in.nextInt();
            if (remote == 1) {
                System.out.println("List of all Leaders:");
                for (int i = 0; i < Tools.leaders.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                    System.out.println("- National I.D: " + Tools.leaders.get(i).getMelliCode());
                    System.out.println("- Date of Birth: " + Tools.leaders.get(i).getDob().toString());
                    System.out.println("- Date of Employment" + Tools.leaders.get(i).getDoe().toString());
                    Tools.leaders.get(i).getKnownCities();
                    Tools.leaders.get(i).getKnownCountries();
                    System.out.println("- Married: " + Tools.leaders.get(i).getMarried());
                }
            } else if (remote == 2) {
                System.out.println("Add new Leader:");
                Leader temp = new Leader();
                {
                    temp.setName();
                    temp.setMelliCode();
                    temp.setShenasnameNumber();
                    temp.setDob();
                    temp.setDoe();
                    temp.setKnownCities();
                    temp.setKnownCountries();
                    temp.setMarried();
                    temp.addToList();
                }
            } else if (remote == 3) {
                System.out.println("Delete Leader:");
                for (int i = 0; i < Tools.leaders.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                }
                System.out.println("Enter the number:");
                remote = in.nextInt();
                remote--;
                for (int i = 0; i < Tools.users.size(); i++) {
                    if (Tools.users.get(i).getUsername().equals(Tools.leaders.get(remote).getUsername())) {
                        Tools.users.remove(i);
                    }
                }
                Tools.leaders.remove(remote);
            } else if (remote == 4) {
                for (int i = 0; i < Tools.leaders.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                }
                System.out.println("Select the Leader you want to edit:");
                remote = in.nextInt();
                int select = remote - 1;
                System.out.println("To edit name enter 1:");
                System.out.println("To edit Melli Code enter 2:");
                System.out.println("To edit Shenasname Number enter 3:");
                System.out.println("To edit date of birth enter 4:");
                System.out.println("To edit date of employment enter 5:");
                System.out.println("To edit known towns enter 6:");
                System.out.println("To edit known countries enter 7:");
                System.out.println("To edit marriage status enter 8:");
                System.out.println("To go back enter 0");
                remote = in.nextInt();
                if (remote == 1) {
                    Tools.leaders.get(select).setName();
                } else if (remote == 2) {
                    Tools.leaders.get(select).setMelliCode();
                } else if (remote == 3) {
                    Tools.leaders.get(select).setShenasnameNumber();
                } else if (remote == 4) {
                    Tools.leaders.get(select).setDob();
                } else if (remote == 5) {
                    Tools.leaders.get(select).setDoe();
                } else if (remote == 6) {
                    System.out.println("Enter 1 to add to known Cities.");
                    System.out.println("Enter 2 to remove known Cities.");
                    remote = in.nextInt();
                    if (remote == 1)
                        Tools.leaders.get(select).setKnownCities();
                    if (remote == 2)
                        Tools.leaders.get(select).removeKnownCities();
                } else if (remote == 7) {
                    System.out.println("Enter 1 to add to known countries.");
                    System.out.println("Enter 2 to remove known countries.");
                    remote = in.nextInt();
                    if (remote == 1)
                        Tools.leaders.get(select).setKnownCountries();
                    if (remote == 2)
                        Tools.leaders.get(select).removeKnownCountries();
                } else if (remote == 8) {
                    Tools.leaders.get(select).setMarried();
                }
            } else if (remote == 0) {
                return;
            }
        }
        else if (remote == 2) {
            System.out.println("Enter 1 to see all tour types.");
            System.out.println("Enter 2 to see all available tours.");
            System.out.println("Enter 3 to add a new tour.");
            System.out.println("Enter 4 to edit a tour.");
            //System.out.println("Enter 5 to remove a tour.");
            //6 for search

            remote = in.nextInt();
            if (remote == 1) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i));
                }
                System.out.println("Enter any number to go back:");
                remote = in.nextInt();
            } else if (remote == 2) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i).getStartPoint().getName());
                    System.out.println("From " + Tools.tours.get(i).getStartDate() + " to " + Tools.tours.get(i).getEndDate());
                }
                System.out.println("Enter any number to go back:");
                remote = in.nextInt();
            } else if (remote == 3) {
                Tour newTour = new Tour();
                newTour.newTour();
                System.out.println("Enter any number to go back:");
                remote = in.nextInt();
            } else if (remote == 4) {
                for (int i = 0; i < Tools.tours.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.tours.get(i).getStartPoint().getName());
                    System.out.println("From " + Tools.tours.get(i).getStartDate() + " to " + Tools.tours.get(i).getEndDate());
                    System.out.println("Select a tour:");
                    remote = in.nextInt();
                    int select = remote - 1;
                    System.out.println("To edit length of the tour");
                    System.out.println("To edit price enter 2:");
                    System.out.println("To edit minimum of participants enter 3:");
                    System.out.println("To edit maximum of participants enter 4:");
                    System.out.println("To edit starting location of tour enter 5:");//
                    System.out.println("To edit ending location of tour enter 6:");//
                    System.out.println("To edit the leader of the tour enter 7:");
                    System.out.println("To edit the id of the tour 8:");
                    System.out.println("To edit start date of tour enter 9:");
                    System.out.println("To edit end date of tour enter 9:");
                    remote = in.nextInt();
                    if (remote == 1) {
                        Tools.tours.get(select).setLengthInDays();
                    } else if (remote == 2) {
                        Tools.tours.get(select).setPrice();
                    } else if (remote == 3) {
                        Tools.tours.get(select).setMinSize();
                    } else if (remote == 4) {
                        Tools.tours.get(select).setMaxSize();
                    } else if (remote == 5) {
                        System.out.println("Select the Country the tour starts at:");
                        Tools.listPrinter(Tools.countries);
                        int select2 = Tools.listChooser(Tools.countries);
                        Country country = Tools.countries.get(select2);
                        System.out.println("Select the city the tour starts at:");
                        for (int j = 0; j < Tools.cities.size(); i++) {
                            if (Tools.cities.get(j).getCountry().equals(country)) {
                                System.out.println((j + 1) + ". " + Tools.cities.get(i).getName());
                            }
                        }
                        select2 = in.nextInt();
                        select2--;
                        Tools.tours.get(select).setStartPoint(Tools.cities.get(select2));
                    } else if (remote == 6) {
                        System.out.println("Select the Country the tour ends at:");
                        Tools.listPrinter(Tools.countries);
                        int select2 = Tools.listChooser(Tools.countries);
                        Country country = Tools.countries.get(select2);
                        System.out.println("Select the city the tour ends at:");
                        for (int j = 0; j < Tools.cities.size(); i++) {
                            if (Tools.cities.get(j).getCountry().equals(country)) {
                                System.out.println((j + 1) + ". " + Tools.cities.get(i).getName());
                            }
                        }
                        select2 = in.nextInt();
                        select2--;
                        Tools.tours.get(select).setEndPoint(Tools.cities.get(select2));
                    } else if (remote == 7) {
                        System.out.println("Select the leader of the Tour");
                        for (i = 0; i < Tools.leaders.size(); i++) {
                            for (int j = 0; j < Tools.leaders.get(i).getKnownCities().size(); j++) {
                                if (Tools.leaders.get(i).getKnownCities().get(j).equals(Tools.tours.get(select).getStartPoint().getCountry())) {
                                    System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                                }
                            }
                        }
                        int ans = Tools.listChooser(Tools.leaders);
                        Tools.tours.get(select).setLeader(Tools.leaders.get(ans));
                    } else if (remote == 8) {
                        Tools.tours.get(select).setId();
                    } else if (remote == 9) {
                        Tools.tours.get(select).setStartDate();
                    } else if (remote == 10) {
                        Tools.tours.get(select).setEndDate();
                    }
                }
            }
        }
        else if (remote == 3) {
            System.out.println("To view all locations enter 1:");
            remote = in.nextInt();
            if (remote == 1) {
                for (int i = 0; i < Tools.countries.size(); i++) {
                    System.out.println((i + 1) + ". " + Tools.countries.get(i).getName());
                    for (int j = 0; j < Tools.cities.size(); i++) {
                        if (Tools.cities.get(j).getCountry().equals(Tools.countries.get(i)))
                            System.out.println("- " + Tools.cities.get(j).getName());
                    }
                }
                System.out.println("Enter anything to go back.");
                remote = in.nextInt();
            } else if (remote == 2) {
                System.out.println("Enter 1 to add a country.");
                System.out.println("Enter 2 to add a city.");
                remote = in.nextInt();
                if (remote == 1) {
                    Country country = new Country();
                    country.newCountry();
                } else if (remote == 2) {
                    City city = new City();
                    city.newCity();
                }
                System.out.println("Enter anything to go back.");
                remote = in.nextInt();
            }
        }
        else if(remote==4){
            employee.addCustomer();
        }
        else if (remote == 0)
            return;
    }

    public void customer(Customer customer){
        System.out.println("Enter 1 to view all tour leaders.");
        System.out.println("Enter 2 to view all tours.");
        System.out.println("Enter 0 to log out.");

        Scanner in = new Scanner(System.in);
        int remote = in.nextInt();
        if(remote==1){
            System.out.println("List of all Leaders:");
            for (int i = 0; i < Tools.leaders.size(); i++) {
                System.out.println((i + 1) + ". " + Tools.leaders.get(i).getName());
                System.out.println("- National I.D: " + Tools.leaders.get(i).getMelliCode());
                System.out.println("- Date of Birth: " + Tools.leaders.get(i).getDob().toString());
                System.out.println("- Date of Employment" + Tools.leaders.get(i).getDoe().toString());
                Tools.leaders.get(i).getKnownCities();
                Tools.leaders.get(i).getKnownCountries();
                System.out.println("- Married: " + Tools.leaders.get(i).getMarried());
            }
            System.out.println("Enter any number to go back:");
            remote = in.nextInt();
        }
        else if (remote == 2) {
            for (int i = 0; i < Tools.tours.size(); i++) {
                System.out.println((i + 1) + ". " + Tools.tours.get(i).getStartPoint().getName());
                System.out.println("From " + Tools.tours.get(i).getStartDate() + " to " + Tools.tours.get(i).getEndDate());
            }
            System.out.println("Enter any number to go back:");
            remote = in.nextInt();
        }
        else if(remote==0)
            return;
    }
}

