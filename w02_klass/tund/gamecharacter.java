package tund;
public class gamecharacter {
   private int x;
   private int y;
   
   public String name;
   private String secret = "my secret";
   
    private gamecharactertype gameCharacterType;


   public gamecharacter(String name, gamecharactertype gameCharacterType){
       this.gameCharacterType = gameCharacterType;
       this.x = (int) (Math.random() * 30 + 1);
       this.y = (int) (Math.random() * 30 + 1);
       this.name = name;
   }
   public String getSecret(){
       return secret;
   }
   public void setSecret(String secret){
       this.secret = secret;
   }
   public int[] getXY(){
       return new int[]{x, y};
   }
   @Override
   public String toString(){
       return "My name is " + name + " and x: " + x + " and y: " + y;
   }
}
