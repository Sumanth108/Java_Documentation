package prog7;

public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person("Abhijit","M.Tech",5);
        person.setSalary(new Salary(40000,125,30));
        person.setLoan(1,10000);
        System.out.println(person);
        System.out.println(person.noOfLoans+" "+person.loanAmount);
        System.out.println(person.salary.grossSal);
        System.out.println(person.salary.tax(person.salary.grossSal)/12);
        System.out.println(person.isEligible());
        System.out.println(person.isEligiblePromotion());
    }
}
