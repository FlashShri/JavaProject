public class Main {
    
    public static void main(String[] args) {
        
        Box b = new Box("text");
        System.out.println(b.getValues());

        System.out.println(new Box(5635).getValues());

        Box2<String> b2 = new Box2<>("strind data");
        System.out.println(b2.getValues());
        System.out.println(b2.container.getClass().getName()); // this is get which type of class is getting from programmer

        Box2<Integer> b3 = new Box2<>(868698);
        System.out.println(b3.getValues());

        System.out.println(new Box2<Double>(3.14).getValues());
    }
}
