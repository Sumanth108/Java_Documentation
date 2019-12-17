package labPrograms.program11.resultPackage;

import labPrograms.program11.studentPackage.RegisterStudent;

public class DemoStudent {
    public static void main(String[] args) {
        RegisterStudent s1 = new RegisterStudent("1","Akash","ISE");
        //sem 1 data ( do not pass 0 as argument as sem starts with 1)
        System.out.println("sem 1 details");
        s1.registerSem(1);
        s1.sem[1].getGrades();
        s1.sem[1].calcSGPA();

        //sem 2 data
        System.out.println("sem 2 details");
        s1.registerSem(2);
        s1.sem[2].getGrades();
        s1.sem[2].calcSGPA();

        //CGPA

        s1.calcCGPA();
    }
}
