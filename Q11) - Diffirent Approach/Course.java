package labPrograms.program11;

public class Course {
    String name;
    int credits;
    float grade;  // for simplicity direct grade point is taken, not letter grade

//    Course(String name, int credits){
//        this.name = name;
//        this.credits = credits;
//    }

    void setGrade(char grade){
        this.grade = grade;
    }

    public String toString(){
        return name + ":" + credits + "(" + grade +")";
    }

}
