package labPrograms.program12;

import java.util.Iterator;
import java.util.LinkedList;

public class LListString {
    private LinkedList<String> nameList = new LinkedList<>();

    public void addName(String name){
        nameList.add(name);
    }

    public void disp5(){
        if(nameList.isEmpty())
            System.out.println("List is Empty");
        else {
            Iterator iterator = nameList.iterator();
            while(iterator.hasNext()){
                String name = iterator.next().toString();
                if (name.length() < 5)
                    System.out.println(name);
            }
        }
    }
}
