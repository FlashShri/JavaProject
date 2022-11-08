import java.util.ArrayList;

public class ALEx{
    //arrayList is implementation class of List Interface
    /*
     * size is dyanamicall inceasse
     * insertion order is maintain byindexing
     * duplicate can allowed
     * null is also allowed
     * default capacity=10
     * incease capacity= current capacity*3/2+1
     * ArrayList inherits AbstractList class and implements the List interface.
     * 
     * ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
     * 
     * ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.
     * 
     * 
     * 
     */
    public static void main(String[] args) 
    {

        //declaration and Instanciatin
    //     ArrayList<> dataList = new ArrayList<>(15);//here ArrayList() is default constructor of initial capacity 10
    //     dataList.add(32);
    //     dataList.add(16);
    //     dataList.add("Ths is data");
    //     datalist.add(43);

    //    int c= datalist.size();
    //    System.out.println(c);

    ArrayList<Integer> arrr = new ArrayList<Integer>();

    for(int i=1;i<=15;i++){
        arrr.add(i);
    }
    System.out.println(arrr);
    arrr.add(15, 16); // adding element at index
    System.out.println(arrr);

    arrr.remove(4); // remove element at index 4
    System.out.println(arrr);

    ArrayList a1= new ArrayList<>(); // we dont specifi any typr to this arraylist

    a1.add("Elon");
    a1.add("Mark");
    a1.add("Jeff");

    System.out.println(a1);

   // a1.addAll(arrr); //append an entire collection at end of this collection
    //System.out.println(a1);

    a1.addAll(1, arrr);
    System.out.println(a1); // append collection at index

    a1.set(0, "Shri");
    System.out.println(a1); // set/change an element

    a1.remove(17); // delete
    System.out.println(a1);

    System.out.println("************************");

    //traversing ArrayList

    for(int i=0;i<a1.size();i++){
        System.out.print(a1.get(i)+" ");
    }

    // for each loop

    // for (String str :a1){
    //     System.out.println(str+" ");
    // }

    /*
     * this enhanced for loop is getting error of
     * type mismatch bcoz our data is heterogenous
     */
    }
    
}