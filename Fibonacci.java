package Prog1;
import java.util.Scanner;

public class Fibonacci 
{ int first;
  int second;
  int next;

	public Fibonacci()      //initiaqlizing initial 2 values 
	{   
		first = 0;
		second = 1;
		System.out.println(first);
		System.out.println(second);
	}
    void FiboDirect(int n)
    { int i = 2;
    	while(i<n){
    		next = first + second;
    		System.out.println(next);
    		first = second;
    		second = next;
    		i++;
    	}
    }
    int FiboRecursive(int n)
    {
    	if(n>2){
    	next = first + second;
		System.out.println(next);
		first = second;
		second = next;
		return(FiboRecursive(n-1));
     }
    	return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
        
        System.out.println("Do you want to print fibonacci :\n -->1. Directly\n-->2. Recursive");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Fibonacci fb = new Fibonacci();  //class instance created(now space is taken)
        switch(a)
        {
        case 1 :  fb.FiboDirect(8);
                  break;
        case 2 :  fb.FiboRecursive(8);
                  break;
        }
           
	}
}
