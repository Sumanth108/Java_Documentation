package labPrograms.program12;

public class ListQueueDemo {
    public static void main(String[] args) {
        ListQueue myQueue = new ListQueue(5);
        //insert demo
        for(int i = 0;i<15;i+=2)
            myQueue.insertEnd(i+" ");
        //delete demo
        for(int i = 0;i < 6; i++)
            System.out.println("Deleted item is " + myQueue.deleteFront());


        //display - comment previous two lines for these to work; else default exception handler terminates program
        myQueue.displayContents();
    }

}
