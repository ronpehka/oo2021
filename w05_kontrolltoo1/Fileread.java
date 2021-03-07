import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//esimene ülesanne ja teine ülesanne
public class Fileread {
    private int counter;
    private int count;
    private int total_letters;
    private char char_to_search = 'a';
    private char char_to_search2 = 'A';
    private int countWords;
    private int lettersperword;
    //tabeli muutujad
    private int oneA;
    private int twoA;
    private int threeA;
    private int fourA;
    private int fiveA;
        
  
   
    public void letterInWords() throws IOException {
        //leian suhte arvu vist ja mitu A-d esines failis kokku
        BufferedReader br = new BufferedReader(new FileReader("n2ide.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
            
            
            for(int i=0; i < line.length(); i++){
                if(Character.isLetter(line.charAt(i))){
                  total_letters++;  
                }
                if(line.charAt(i) == char_to_search){
                    counter++;
                }
                if(line.charAt(i) == char_to_search2){
                    counter++;
                }

            }
            //suhtearv = % ?
            float relationship = (float) counter/ (float) total_letters;
             System.out.println("letter a occured: " + counter + " times.");
             System.out.println("there is a total of: " + total_letters + " characters.");
             System.out.println("letter A occured approximately " + relationship + "times");
             
            
        } br.close();


    }

    public void wordData() throws IOException{
        //leian mitu A-d oli uhes sonas ja mitu a-d keskmiselt sõna kohta, komasid väga ei saa kasutada kuna sõnas ei saa olla 1.5a-d
        BufferedReader br = new BufferedReader(new FileReader("n2ide.txt"));
        String words;
        while((words = br.readLine()) != null){
            String [] word = words.split(" ");
                for(String wordarr : word){
                    countWords++;
                    for(int i=0; i<wordarr.length();i++){
                        char a = wordarr.charAt(i);
                        if(a == char_to_search){
                            count++;
                            lettersperword++;
                        }
                        if(a == char_to_search2){
                            count++;
                            lettersperword++;
                        }
                        
                    }
                    System.out.println(wordarr + "->" + count);
                    //seda saaks kindlasti lihtsamalt teha aga ma polnud päris kindel
                    //kuidas seda ellu viia vb for-tsükkel
                    //võibolla eraldi funktsioon või siis listi panna asjad kuidagi
                    if(count==1){
                        oneA = oneA +1;
                    }
                    if(count==2){
                        twoA = twoA +1;
                    }
                    if(count==3){
                        threeA = threeA +1;
                    }
                    if(count==4){
                        fourA = fourA +1;
                    }
                    if(count==5){
                        fiveA = fiveA +1;
                    }
                    count=0;
                    
                }
                System.out.println("\t\tTabel\t\t" + "\n" +
                    "a\taa\taaa\taaaa\taaaaa" + "\n" +
                                    oneA+"\t"+twoA+"\t"+threeA+"\t"+fourA+"\t"+fiveA);

                 System.out.println("we have approximately " + (lettersperword/countWords) + " letter A for a word");
        }br.close();  
    }

}

    















        

    


