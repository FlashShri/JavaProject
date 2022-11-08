import java.util.LinkedList;

class Ex1{
public static void main(String[] args) {
    LinkedList  mylist= new LinkedList ();

    mylist.add("Mi");
    mylist.add("Samsung");
    mylist.add("Apple");
    mylist.add(null);
    System.out.println(mylist);

    //peek
    System.out.println(mylist.peek());// only get the head node

    System.out.println(mylist.poll());// will delete
    System.out.println(mylist);


}
    

}