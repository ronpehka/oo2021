package kodune.homework;

import java.util.ArrayList;
import java.util.List;

public class Army_Info {
    public static void main(String[] args) {
        
        List<Unit> emptyrosterlst = new ArrayList<Unit>();
        Army army1 = new Army(5, 150, emptyrosterlst, 0);
        Unit archer1 = new Unit(160, "Eagle", "Archers");
        Unit archer2 = new Unit(200, "Beginners", "Archers");
        Unit cataphrac1 = new Unit(108, "Veterans", "Horses");
        Unit cataphract2 = new Unit(94, "Kings_guard", "Horses");
        Unit phalxman = new Unit(250, "Spear_wall","Spearman" );
        Unit phalxman2 = new Unit(300, "Recruits","Spearman" );
        army1.addUnit(archer1);
        army1.addUnit(archer2);
        army1.addUnit(cataphrac1);
        army1.addUnit(cataphract2);
        army1.addUnit(phalxman);
        army1.addUnit(phalxman2);

        for (Unit unit : army1.getRosterLst()) {
            System.out.println( "We have a unit: ");
            System.out.println(unit.getunitName());
            System.out.println("They have a total of: ");
            System.out.println(unit.getunitsize()+" men" );
            System.out.println("And They are: ");
            System.out.println(unit.getunitType());
          }

    }

}