package design;

public abstract class AbstractEmployee implements Employee {

    public final String founderName = "Fahim";
    static String address = "31-10, Astoria, NY";

    public void describeCompany() {
        System.out.println("In the year 2015 " + founderName + " founded the company located at " + address + ".");
    }
    public abstract void describeCompany(String Mission);
}
