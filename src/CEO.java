import java.util.ArrayList;

public class CEO implements Employee{
    private String name = "Null Name";
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

    //Constructor
    public CEO(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    //Works Under does not do anything for CEO, but must be overwritten
    @Override
    public void addsWorksUnder(String employee) {
        System.out.println("Cannot add " + employee + " as CEO will not work under anyone");
    }

    @Override
    public void getsWorksUnder() {

    }

    //Works Over does things for CEO, must be overwritten
    @Override
    public void addsWorksOver(String employee) {
        WorksOver.add(employee);
    }

    @Override
    public void getsWorksOver() {
        System.out.println("Employees that work under CEO are ");
        WorksOver.forEach(System.out::println);
    }

}
