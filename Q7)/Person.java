package prog7;

public class Person {
    String name;
    String edu;
    Salary salary;
    float yearOfExp;
    int noOfLoans;
    float loanAmount;

    Person(String name,String edu,float yearOfExp){
        this.name = name;
        this.edu = edu;
        this.yearOfExp = yearOfExp;
    }

    void setLoan(int noOfLoans,float loanAmount){
        this.noOfLoans = noOfLoans;
        this.loanAmount = loanAmount;
    }

    void setSalary(Salary salary){
        this.salary = salary;
    }

    boolean isEligible(){
        if(yearOfExp>5 && loanAmount < this.salary.grossSal*10)
            return true;
        else return false;
    }

    boolean isEligiblePromotion(){
        if (yearOfExp > 10) return  true;
        else return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", edu='" + edu + '\'' +
                ", salary=" + salary.netSalary +
                ", yearOfExp=" + yearOfExp +
                ", noOfLoans=" + noOfLoans +
                ", loanAmount=" + loanAmount +
                '}';
    }
}

class Salary{
    float basic;
    float daPer;
    float hraPer;
    float grossSal;                          // Jootha CTC
    float netSalary;                         // tax katvake

    float tax(float amount){              //Tax implies for the whole year
        float salPerYear = amount * 12;
        float taxAmount = 0;
        if(salPerYear < 500000)
            taxAmount = 25000;
        else if(salPerYear < 1000000)
            taxAmount = 25000 + (salPerYear - 500000)*.1f;
        else taxAmount = 75000+(salPerYear -1000000)*.2f;

        return taxAmount;
    }
    Salary(float basic,float daPer,float hraPer){
        this.basic = basic;
        this.daPer = daPer;
        this.hraPer = hraPer;


        grossSal = this.basic + this.basic*this.daPer/100+this.basic*this.hraPer/100;
        float taxPerMonth = tax(grossSal)/12;
        netSalary = grossSal - taxPerMonth;

    }
}
