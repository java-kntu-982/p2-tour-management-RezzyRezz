package ir.ac.kntu;

import javax.tools.Tool;
import java.util.LinkedList;
import java.util.Scanner;

public class Tour {
    //private String name;
    private int lengthInDays;
    private int price;
    private int minSize;
    private int maxSize;
    private City startPoint;
    private City endPoint;
    private LinkedList<String> sights = new LinkedList<>();
    private Leader leader;
    private String id;
    private Date startDate;
    private Date endDate;

    public void newTour(){
        Scanner in = new Scanner(System.in);
        setLengthInDays();
        setPrice();
        setMinSize();
        setMaxSize();
        System.out.println("Select the Country the tour starts at:");
        Tools.listPrinter(Tools.countries);
        int select = Tools.listChooser(Tools.countries);
        Country country = Tools.countries.get(select);
        System.out.println("Select the city the tour starts at:");
        for(int i=0;i<Tools.cities.size();i++){
            if(Tools.cities.get(i).getCountry().equals(country)){
                System.out.println((i+1)+". "+Tools.cities.get(i).getName());
            }
        }
        select = in.nextInt();
        select--;
        setStartPoint(Tools.cities.get(select));
        System.out.println("Select the Country the tour ends at:");
        Tools.listPrinter(Tools.countries);
        select = Tools.listChooser(Tools.countries);
        country = Tools.countries.get(select);
        System.out.println("Select the city the tour ends at:");
        for(int i=0;i<Tools.cities.size();i++){
            if(Tools.cities.get(i).getCountry().equals(country)){
                System.out.println((i+1)+". "+Tools.cities.get(i).getName());
            }
        }
        select = in.nextInt();
        select--;
        setEndPoint(Tools.cities.get(select));
        System.out.println("Select the leader of the Tour");
        for(int i=0;i<Tools.leaders.size();i++){
            for(int j=0;j<Tools.leaders.get(i).getKnownCities().size();j++){
                if(Tools.leaders.get(i).getKnownCities().get(j).equals(startPoint)){
                    System.out.println((i+1)+". "+Tools.leaders.get(i).getName());
                }
            }
        }
        int ans = Tools.listChooser(Tools.leaders);
        setLeader(Tools.leaders.get(ans));
        setId();
        setStartDate();
        setEndDate();
        addToList();
    }
    public void setStartDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year the tour starts:");
        int year = in.nextInt();
        System.out.println("Enter the month the tour starts");
        int month = in.nextInt();
        System.out.println("Enter the day the tour starts");
        int day = in.nextInt();
        Date temp = new Date(year,month,day);
        startDate = temp;
    }

    public String getStartDate() {
        return startDate.toString();
    }
    public void setEndDate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year the tour Ends:");
        int year = in.nextInt();
        System.out.println("Enter the month the tour Ends");
        int month = in.nextInt();
        System.out.println("Enter the day the tour Ends");
        int day = in.nextInt();
        Date temp = new Date(year,month,day);
        endDate = temp;
    }

    public String getEndDate() {
        return endDate.toString();
    }
    public void setLengthInDays(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the tour:");
        lengthInDays = in.nextInt();
    }
    public int getLengthInDays(){
        return lengthInDays;
    }
    public void setPrice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of the tour:");
        price = in.nextInt();
    }
    public int getPrice(){
        return price;
    }
    public void setMinSize(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the minimum participants required for the tour:");
        minSize = in.nextInt();
    }
    public int getMinSize(){
        return minSize;
    }
    public void setMaxSize(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the maximum participants required for the tour:");
        maxSize = in.nextInt();
    }
    public int getMaxSize(){
        return maxSize;
    }

    public void setStartPoint(City city){
        startPoint = city;
    }
    public City getStartPoint(){
        return startPoint;
    }
    public void setEndPoint(City city){
        endPoint = city;
    }
    public City getEndPoint(){
        return endPoint;
    }
    public void setSights(){
        System.out.println("Enter the name of the sight:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        sights.addLast(str);
        System.out.println("Do you want to add another sight?");
        boolean ans = Tools.yesOrNo();
        while(ans){
            System.out.println("Enter the name of the sight:");
            str = in.nextLine();
            sights.addLast(str);
            System.out.println("Do you want to add another sight?");
            ans = Tools.yesOrNo();
        }
    }
    public void getSights(){
        if(sights.size()<1){
            System.out.println("No sights have been entered.");
        }
        else {
            for (int i = 0; i < sights.size(); i++) {
                System.out.println((i + 1) + ". " + sights.get(i));
            }
        }
    }
    public void setLeader(Leader leader){
        this.leader = leader;
    }
    public Leader getLeader(){
        return leader;
    }
    public void setId(){
        System.out.println("Enter the name/I.D for the tour:");
        Scanner in = new Scanner(System.in);
        id = in.nextLine();
    }

    public void addToList(){
        Tools.tours.addLast(this);
    }
}
