package Models;

import Models.Client;

public class Individual extends Client {
    private String workfield;
    private int age;

    // Setters and Getters
    public String getWorkfield() {
        return workfield;
    }

    public void setWorkfield(String workfield) {
        this.workfield = workfield;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Constructor w/o inputs

    public Individual() {
        //Undefined variables
    }

    //Constructor with inputs

    public Individual(String name, String location, int ordernum, double budget, String workfield, int age) {
        super(name, location, ordernum, budget);
        this.workfield = workfield;
        this.age = age;
    }

    //toString method
    @Override
    public String toString() {
        return "Models.Individual " +
                "name is " + getName() +
                ", location is " + getLocation() +
                ", order number is " + getOrdernum() +
                ", budget is " + getBudget() +
                ", work-field is " + getWorkfield() +
                ", age of client is " + getAge();
    }
}
