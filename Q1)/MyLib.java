package prog1;

public class MyLib {
    public static void fibNoRec(int n){
        int first = 0;
        int next = 1;
        System.out.print(first+" ");
        System.out.print(next+" ");
        for(int i=2;i<n;i++){
            int temp = first+next;
            System.out.print(temp+" ");
            first = next;
            next = temp;

        }
    }

    public static int fiboRec(int n){
        if (n < 2)
            return n;
        else
            return fiboRec(n-1)+fiboRec(n-2);
    }

    public static boolean checkPrime(int n){
        boolean isPrime = true;
        if(n<=2) {
            System.out.println("Enter a value greater than 2");
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime = false;
                break;

            }

        }
        return isPrime;
    }

    public static void bubbleSort(int[] x){
        for(int i=x.length-1;i>0;i--)
            for(int j=0;j<i;j++){
                if(x[j]>x[j+1]){
                    int temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
    }
}

