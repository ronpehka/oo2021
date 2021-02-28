package kodune.homework;
import java.util.List;

public class Army {
    public int Armysize;
    public int limit_unit_size;
    private List<Unit> rosterLst;
    public int counter;

    public List<Unit> getRosterLst(){
        return rosterLst;
    }
    public Army(int Armysize, int limit_unit_size, List<Unit> rosterLst, int counter){
        this.Armysize = Armysize;
        this.limit_unit_size = limit_unit_size;
        this.rosterLst = rosterLst;
        this.counter = counter;

    }

    public void addUnit(Unit unit){
        if(unit.getunitsize() > this.limit_unit_size){
            System.out.println("Liiga suur üksus, tee uus");
        }else{
            this.rosterLst.add(unit);
            counter ++;
        }
        if(this.counter == this.Armysize){
            System.out.println("Your army is complete");
            
        }

    }
}
