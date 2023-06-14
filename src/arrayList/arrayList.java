package arrayList;

import java.util.*;
public class arrayList{
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sunil");
        al.add("Akuthota");
        al.add("Dihesh");
        al.add("Dev");
        al.add("Ramesh");
        al.add("Pavan");
        al.add("Mallikarjun");
        System.out.println("ArrayList before sorting"+ al);
        
        Collections.sort(al);

        System.out.println("ArrayList after sorting ascending order"+ al);
        
        Collections.sort(al, Collections.reverseOrder());

        System.out.println("ArrayList after sorting decending order"+ al);
        
        
    }
}
