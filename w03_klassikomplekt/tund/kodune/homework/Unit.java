package kodune.homework;

public class Unit {
    private int unitSize;
    private String unitName;
    private String unitType;

    public Unit(int unitSize, String unitName, String unitType)
{
    this.unitSize = unitSize;
    this.unitName = unitName;
    this.unitType = unitType;

}   
    public int getunitsize(){
        return unitSize;
    }
    public void setunitsize(int unitSize){
        this.unitSize = unitSize;
    }
    public String getunitName(){
        return unitName;
    }
    public void setunitName(String unitName){
        this.unitName = unitName;
    }
    public String getunitType(){
        return unitType;
    }
    public void setuniType(String unitType){
        this.unitType = unitType;
    }




}
