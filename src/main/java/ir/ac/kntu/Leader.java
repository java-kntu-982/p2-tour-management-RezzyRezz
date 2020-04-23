package ir.ac.kntu;

import java.util.LinkedList;
import java.util.Scanner;

public class Leader extends User {
    private String name;
    private int melliCode;
    private int shenasnameNumber;
    private Date dob;
    private Date doe;
    private boolean married;
    private LinkedList<Country> knownCountries = new LinkedList<>();
    private LinkedList<City> knownCities = new LinkedList<>();

    public Leader(String name, String user, String pass) {
        this.name = name;
        this.setUsername(user);
        this.setPassword(pass);
        this.addToList();
    }

    public Leader() {

    }

    public void addToList() {
        int lflag = 0;
        int uflag = 0;
        for (int i = 0; i < Tools.leaders.size(); i++) {
            if (Tools.leaders.get(i).equals(this)) {
                lflag = 1;
                break;
            }
        }
        if (lflag == 0)
            Tools.leaders.addLast(this);
        for (int i = 0; i < Tools.users.size(); i++) {
            if (Tools.users.get(i).getUsername().equals(this.getUsername())) {
                uflag = 1;
                break;
            }
        }
        if (uflag == 0)
            Tools.users.addLast(this);

    }

    public void setName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first and last name:");
        name = in.nextLine();
    }

    public String getName() {
        return name;
    }

    public void setMelliCode() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Melli Code:");
        melliCode = in.nextInt();
    }

    public int getMelliCode() {
        return melliCode;
    }

    public void setShenasnameNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Shenasname Number:");
        shenasnameNumber = in.nextInt();
    }

    public int getShenasnameNumber() {
        return shenasnameNumber;
    }

    public void setDob() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year of birth:");
        int year = in.nextInt();
        System.out.println("Enter the month of birth:");
        int month = in.nextInt();
        System.out.println("Enter day of birth:");
        int day = in.nextInt();
        dob = new Date(year, month, day);
    }

    public Date getDob() {
        return dob;
    }

    public void setDoe() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year of employment:");
        int year = in.nextInt();
        System.out.println("Enter the month of employment:");
        int month = in.nextInt();
        System.out.println("Enter day of employment:");
        int day = in.nextInt();
        doe = new Date(year, month, day);
    }

    public Date getDoe() {
        return doe;
    }

    public void setMarried() {
        Scanner in = new Scanner(System.in);
        System.out.println("Is the employee married?");
        married = Tools.yesOrNo();
    }

    public boolean getMarried() {
        return married;
    }

    public void setKnownCountries(Country country) {
        knownCountries.addLast(country);
    }

    public void setKnownCountries() {
        System.out.println("Select a country where the employee can lead a tour at:");
        Tools.listPrinter(Tools.countries);
        int answer = Tools.listChooser(Tools.countries);
        knownCountries.addLast(Tools.countries.get(answer));
        System.out.println("Do you want to add another country to his know countries:");
        boolean yesno = Tools.yesOrNo();
        while (yesno) {
            System.out.println("Select a country where the employee can lead a tour at:");
            Tools.listPrinter(Tools.countries);
            answer = Tools.listChooser(Tools.countries);
            knownCountries.addLast(Tools.countries.get(answer));
            System.out.println("Do you want to add another country to his know countries:");
            yesno = Tools.yesOrNo();
        }

        if (knownCountries.size() > 1) {
            for (int i = 0; i < knownCountries.size(); i++) {
                for (int j = i + 1; j < knownCountries.size(); i++) {
                    if (knownCountries.get(i).equals(knownCountries.get(j))) {
                        knownCountries.remove(j);
                    }
                }
            }
        }
    }

    public LinkedList<Country> getKnownCountries() {
        return knownCountries;
    }

    public void removeKnownCountries() {
        Tools.listPrinter(this.knownCountries);
        int ans = Tools.listChooser(this.knownCountries);
        ans--;
        knownCountries.remove(ans);
    }

    public void setKnownCities() {
        System.out.println("For cities where the employee can lead,");
        System.out.println("Select the country the city is in:");
        Tools.listPrinter(Tools.countries);
        int ans = Tools.listChooser(Tools.countries);
        for (int i = 0; i < Tools.cities.size(); i++) {
            if (Tools.cities.get(i).getCountry().equals(Tools.countries.get(ans))) {
                System.out.println((i + 1) + ". " + Tools.cities.get(i).getName());
            }
        }
        System.out.println("(dont worry if the numbers are messed up, enter it to choose)");
        ans = Tools.listChooser(Tools.cities);
        knownCities.addLast(Tools.cities.get(ans));
        System.out.println("Do you want to add another city?");
        boolean yesno = Tools.yesOrNo();
        while (yesno) {
            System.out.println("Select the country the city is in:");
            Tools.listPrinter(Tools.countries);
            ans = Tools.listChooser(Tools.countries);
            for (int i = 0; i < Tools.cities.size(); i++) {
                if (Tools.cities.get(i).getCountry().equals(Tools.countries.get(ans))) {
                    System.out.println((i + 1) + ". " + Tools.cities.get(i).getName());
                }
            }
            System.out.println("(dont worry if the numbers are messed up, enter it to choose)");
            ans = Tools.listChooser(Tools.cities);
            knownCities.addLast(Tools.cities.get(ans));
            System.out.println("Do you want to add another city?");
            yesno = Tools.yesOrNo();
        }
    }

    public LinkedList<City> getKnownCities() {
        return knownCities;
    }

    public void removeKnownCities() {
        Tools.listPrinter(this.knownCities);
        int ans = Tools.listChooser(this.knownCities);
        ans--;
        knownCities.remove(ans);

    }

    public void addCustomer() {
        Customer customer = new Customer();
        customer.setName();
        customer.setUsername();
        customer.setEmail();
        customer.setPhone();
        customer.addToList();
    }
}
