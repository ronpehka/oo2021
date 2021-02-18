package eksperiment;
public class People {
    
    public String name;
    public int age; 
    private PeopleType peopleType;
    private String secret = "my secret";

    public People(String name, int age, PeopleType peopleType){
        this.name = name;
        this.age = age;
        this.peopleType = peopleType;
    }

    public String getSecret(){
        return secret;
    }
    public void setSecret(String secret){
        this.secret = secret;

    }



}   
