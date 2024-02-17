package Seminars.Sem7.jobagency;

public class Main {

    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 50);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 100);
        Company microsoft = new Company(jobAgency, "Microsoft", 70);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Driver petya = new Driver("Petya");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petya);

        for(int i = 0; i< 10; i++){
            google.needEmpoyee();
            geekBrains.needEmpoyee();
            microsoft.needEmpoyee();
        }
    }
}
