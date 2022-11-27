public interface Employee {
    //All 4 MUST be replaced, even in ones that dont happen
    public void addsWorksUnder(String employee);
    public void addsWorksOver(String employee);
    public void getsWorksUnder();
    public void getsWorksOver();

    //toString is a default here, can be overwritten in other classes
}
