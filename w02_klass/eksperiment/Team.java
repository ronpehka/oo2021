package eksperiment;
public class Team {
    public static void main(String[] args) {
        People people1 = new People("Mari", 24, PeopleType.PHYSIO);
        people1.getSecret();
        people1.setSecret("Ma vihkan oma tööd");
        System.out.println(people1.name + " " + people1.age +" "+  people1.getSecret());
        People people2 = new People("Oliver", 36, PeopleType.MANAGER);
        people2.getSecret();
        people2.setSecret("Ma olen täielik udu");
        System.out.println(people2.name + "" + people2.age + "" +people2.getSecret());
    
    
    }
    
}
