package tund;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        human.sayHello();
        gamecharacter character1 = new gamecharacter("Juku", gamecharactertype.RANGER);
        System.out.println(
            character1.name + " " +
            character1.getSecret());
        character1.setSecret("My new secret");
        System.out.println(character1.getSecret());

        gamecharacter character2 = new gamecharacter("Kati", gamecharactertype.WARRIOR);
        System.out.println(character2);
        System.out.println(character1);
        System.out.println(character1.getXY());
        
    }

    public void human(){
        human human1 = new human();
        System.out.println(human1.hands + " " + human1.name);
        human1.hands = 5;
        human1.name = "Juku";
        System.out.println(human1.legs + " "+ human1.name);
        human human2 = new human("kati");
        System.out.println(human2.name);
        human2.legs = 10;
        System.out.println(human2.name + " " + human2.legs);
    }
    public void lists(){
      String[] stringArray = new String[5];
        int[] numberArray = new int[5];

        ArrayList<String> stringList = new ArrayList<>();

        numberArray[0] = 5;

        stringList.add(0, "Hello");
        stringList.add("Yellow");
        stringList.add(1, "Orange");

        for(String entry : stringList){
            System.out.println(entry);
        }
        System.out.println(stringList.get(1));
    }
}