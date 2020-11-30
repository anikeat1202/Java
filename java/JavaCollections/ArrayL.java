import java.util.*;
import java.util.ArrayList;

class ArrayL{

public static void main(String args[]) {

ArrayList<Integer> list = new ArrayList<Integer>();

//For Adding Elements
list.add(10);
list.add(30);
list.add(20);
list.add(5);
//For Removing Elements

//printing using iterator 

Iterator itr=list.iterator();


while(itr.hasNext())
{

    System.out.println(itr.next());


}


//printing using for-each loop

for(int i:list)
{
    System.out.println(i);


}

Collections.sort(list);


System.out.println(list);

}





}