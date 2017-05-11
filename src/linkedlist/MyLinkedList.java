package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by sifu on 2017/3/12.
 */
public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("D");
        linkedList1.add("E");
        linkedList1.add("F");
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("1");
        linkedList2.add("2");
        linkedList2.add("3");
        linkedList1.addAll(2,linkedList2);
        linkedList1.remove(0);
        Iterator it = linkedList1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
       // System.out.println(linkedList1.size());

    }
}
