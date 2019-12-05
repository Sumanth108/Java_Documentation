import java.util.Scanner;
class TwoWheeler extends Vehicle{
    TwoWheeler()
    {

    }
    @Override
    void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year of Manufacture ");
        year_of_manufacture = sc.nextInt();
    }

    @Override
    void putData() {
        System.out.println("Year of Manufacture is " + year_of_manufacture);
    }

}
