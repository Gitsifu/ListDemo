package arraylist;

import java.util.ArrayList;

/**
 * Created by sifu on 2017/3/12.
 */
public class MyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        ArrayList<Integer> arrayList2 = null;
        arrayList2 = (ArrayList) arrayList1.clone();
        arrayList1.iterator();
        System.out.println(arrayList2);
        System.out.println(arrayList2.get(1));

    }
}
