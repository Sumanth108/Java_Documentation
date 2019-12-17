package labPrograms.program12;

import java.util.ArrayList;
import java.util.Iterator;

public class ListQueue {
    private ArrayList<String> qList;
    private int capacity;
    ListQueue(int capacity){
        qList = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

//    public void insertFront(String item){
//        int size = qList.size();
//        if(size == capacity){
//            System.out.println("Queue if full");
//        } else {
//            qList.add(0,item);
//        }
//    }

    public void insertEnd(String item) {
        int size = qList.size();
        if(size == capacity){
            System.out.println("Queue if full");
        } else {
            qList.add(size,item);
        }
    }

    public String deleteFront(){
        int size = qList.size();

        if (size == 0){
            throw new NullPointerException("Queue is Empty!!!!");
        } else {
            return qList.remove(0);
        }


    }


    public void displayContents(){
        int size = qList.size();
        if (size == 0) {
            System.out.println("Queue is Empty");
        } else {
            Iterator<String> iterator = qList.iterator();
            while (iterator.hasNext())
                System.out.print(iterator.next()+" ");
        }

    }

}
