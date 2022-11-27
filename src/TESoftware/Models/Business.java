package TESoftware.Models;

public class Business extends Client {
    private int peopleamount;
    //Type meaning business type
    private String type;

    //Setters and Getters
    public int getPeopleamount() {
        return peopleamount;
    }

    public void setPeopleamount(int peopleamount) {
        this.peopleamount = peopleamount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Default Constructor
    public Business() {
        //Undefined variables
    }
    //Constructor with inputs
    public Business(String name, String location, int ordernum, double budget, int peopleamount, String type) {
        super(name, location, ordernum, budget);
        this.peopleamount = peopleamount;
        this.type = type;
    }

    //toString method
    @Override
    public String toString() {
        return "TESoftware.Models.Business " +
                "name is " + getName() +
                ", location is " + getLocation() +
                ", order number is " + getOrdernum() +
                ", budget is " + getBudget() +
                ", amount of people is " + getPeopleamount() +
                ", business type is " + getType();
    }
}
