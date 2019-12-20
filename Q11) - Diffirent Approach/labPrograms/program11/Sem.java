package labPrograms.program11;

import java.util.Scanner;

public class Sem {
    //int semId;
    Course[] courses = new Course[4];
    public float gradePoints;
    public int semCredits;


    public void registerCourses(){

        Scanner sc = new Scanner(System.in);
        for(int i =0;i<4;i++){
            courses[i] = new Course();
            System.out.println("Enter the name of course "+(i+1));
            courses[i].name=sc.next();
            System.out.println("Enter number of credits");
            courses[i].credits = sc.nextInt();
            semCredits += courses[i].credits;
            if (semCredits > 30 )
                    throw new RuntimeException("Credit limit Exceeded");


        }
    }

    public void getGrades(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<4;i++){
            System.out.println("Enter the grade for course "+(i+1));
            courses[i].grade = sc.nextFloat();
        }
    }

    public void calcSGPA(){
        int totCredits = 0;
        for(int i = 0;i < 4;i++) {
            totCredits += courses[i].credits;
            gradePoints += courses[i].credits * courses[i].grade;
        }

        float sgpa = gradePoints/totCredits; // assign greater value than 10 manually for exception demo
        if (sgpa > 10) throw new RuntimeException("Something is wrong, SGPA can not be more than 10");
        System.out.println("SGPA: "+ sgpa);
    }



}
