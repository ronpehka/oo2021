// Olemasolevast stringist luua uus string,
// kus muudad suvaliselt olemasolevad tähed kas suureks või väikseks


package kodune.homework;
public class Changing{
    public static void main(String[] args){//Convert to LowerCase
        String sample = "RockStar";
        System.out.println("Convert to LowerCase: " + sample.toLowerCase());
        //Convert to UpperCase
        System.out.println("Convert to UpperCase: " + sample.toUpperCase());
        //Convert single letter
        String sample1 = sample.replace("k","K");
        System.out.println(sample1);
        //connvert single letter option2
        String n2ide = "jdskdjs";
        char [] uus_n2ide = n2ide.toCharArray();
        uus_n2ide[5] = 'Y';
        n2ide = String.valueOf(uus_n2ide);
        System.out.println(uus_n2ide);
    }
}