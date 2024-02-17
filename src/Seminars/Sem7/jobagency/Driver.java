package Seminars.Sem7.jobagency;

public class Driver implements Observer{
    String name;
    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (nameCompany.equals("Microsoft")) {
            System.out.println(String.format("Driver %s: Ok. I am ready for this job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
        else {
            System.out.println(String.format("Driver %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
        }
    }
}
