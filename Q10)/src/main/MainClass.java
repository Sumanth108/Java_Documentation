package main;
import ISE.*;
import java.util.Scanner;
public class MainClass {
    Scanner sc = new Scanner(System.in);
    int n;
    public void main(String [] args)
    {
        System.out.println("Enter the no. of faculty : ");
        n = sc.nextInt();
        ISE_Department ise = new ISE_Department();
        //array of faculty object
        Faculty [] f = new Faculty[n];
        //reading data
        for(int i=0;i<n;i++){
            ise.read_data(f[i]);
        }
        //printing data
        for (int i=0;i<n;i++){
            ise.print_data(f[i]);
        }


    }

}
