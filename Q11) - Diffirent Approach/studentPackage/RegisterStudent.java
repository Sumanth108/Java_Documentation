package labPrograms.program11.studentPackage;

import labPrograms.program11.Sem;
import labPrograms.program11.Student;

import java.util.Scanner;

public class RegisterStudent implements Student {
    String usn;
    String name;
    String branch;
    public Sem[] sem = new Sem[20];

    public RegisterStudent(String usn,String name,String branch){
        setName(name);
        setBranch(branch);
        setUSN(usn);

    }


    @Override
    public void setName(String name) {
         this.name=name;
    }

    @Override
    public void setBranch(String branch) {
        this.branch= branch;
    }

    @Override
    public void setUSN(String usn) {
        this.usn = usn;
    }

    public void registerSem(int sem){
        this.sem[sem] = new Sem();
        this.sem[sem].registerCourses();
    }

    public void calcCGPA(){
        int i = 1;
        float totGP = 0;
        int totCr = 0;
        while(sem[i] != null){
            totGP += sem[i].gradePoints;
            totCr += sem[i].semCredits;
            i++;
        }


        System.out.println("CGPA = "+ (totGP/totCr));


    }
}
