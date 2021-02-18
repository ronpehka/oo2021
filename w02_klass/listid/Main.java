package listid;

import java.util.ArrayList;
//linked list sama moodi peaagu, kuid on nüansi erinevused nagu arrayga tahad siseneda rohkem kui random asju kuid linked list pole parim selleks
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
