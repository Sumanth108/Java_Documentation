import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("\nEnter Radius : \t");
        float r = sc.nextFloat();
        System.out.println("\nEnter angle : \t");
        float angle = sc.nextFloat();
        System.out.println("\nEnter lenght : \t");
        float lenght = sc.nextFloat();
        Circle C1 = new Circle(r);
        Segment Seg1 = new Segment(r,lenght);
        Sector sec = new Sector(r,angle);
        System.out.println("\nArea of Circle: " + C1.area());
        System.out.println("\nArea of Segment : " + Seg1.area_segment());
        System.out.println("\nArea of Sector : "+ sec.area_sector());
    }

}
