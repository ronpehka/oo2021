package tund;
public class human {
    public int head = 1;
    public int eyes = 2;
    public int hands = 2;
    public int legs = 2;

    public String name;
    public human(){
        System.out.println("Constructor");
    }
    public human(String name){
        this.name = name;
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
}
