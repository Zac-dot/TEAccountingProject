package TESoftware.Models;

import java.util.ArrayList;

public class Manager implements Employee {
    private String name = "Null Name";
    private String WorksUnder = "Null";
    private int ID = 1234567890;
    ArrayList<String> WorksOver = new ArrayList<String>();

    //Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWorksUnder() {
        return WorksUnder;
    }

    public void setWorksUnder(String worksUnder) {
        WorksUnder = worksUnder;
    }

    //Constructor
    public Manager(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    //Works Under does things for TESoftware.Models.Manager, must be overwritten
    @Override
    public void addsWorksUnder(String employee) {
        setWorksUnder(employee);
    }

    @Override
    public void getsWorksUnder() {
        System.out.println("This manager works under " + getWorksUnder());
    }

    //Works Over does things for TESoftware.Models.Manager, must be overwritten
    @Override
    public void addsWorksOver(String employee) {
        WorksOver.add(employee);
    }

    @Override
    public void getsWorksOver() {
        System.out.println("Employees that work under TESoftware.Models.Manager are ");
        WorksOver.forEach(System.out::println);
    }

}
