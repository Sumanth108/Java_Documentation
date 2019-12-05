import java.util.Scanner;
final class FourWheeler extends Vehicle{
    Scanner sc = new Scanner(System.in);

    @Override
    void getData() {
        System.out.println("Enter Year of Manufacture ");
        year_of_manufacture = sc.nextInt();
    }

    @Override
    void putData() {
        System.out.println("Year of Manufacture is " + year_of_manufacture);

    }
}
