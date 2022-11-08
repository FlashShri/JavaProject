import java.util.ArrayList;

class Alex1{


    /*
     * in case of big data the updation of ArrayList takes time
     * prefer LinkedList for data/List manupalation
     */
    public static void main(String[] args) {
        ArrayList<Integer> mylist= new ArrayList<Integer>(10);

        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);
        mylist.add(4);

        System.out.println(mylist);

        ArrayList my2list=new ArrayList ();

        my2list.add(34);
        my2list.add("Elon Musk");
        System.out.println(my2list);

        my2list.add(mylist);
        System.out.println(my2list);

        System.out.println(my2list.get(2));
        System.out.println(my2list.contains(34)); // return bolean
        my2list.set(0, 64); //update 
        System.out.println(my2list);

        my2list.remove(2);
        System.out.println(my2list);


        int n=10;
        while(n<500){
            my2list.add(n);

            n++;
        }

        System.out.println(my2list);

        my2list.set(2, "Shrikant");
        System.out.println(my2list);

    }
}