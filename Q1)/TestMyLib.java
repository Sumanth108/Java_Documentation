package prog1;

public class TestMyLib {
    public static void main(String[] args) {
        MyLib.fibNoRec(10);

        for(int i=0;i<10;i++)
            System.out.print(MyLib.fiboRec(i)+" ");

        System.out.println(MyLib.checkPrime(3));

        int[] myArr = {5,4,3,2,1};
        MyLib.bubbleSort(myArr);
        for(int x:myArr)
            System.out.println(x);
    }
}
