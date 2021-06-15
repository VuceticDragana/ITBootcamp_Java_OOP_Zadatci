package Dan_10;

import java.util.ArrayList;

public class Liste
{

  public static void main(String[] args)
  {
    String[] imena = new String[4];
    
    imena[0] = "Petar";
    imena[1] = "Marija";
    imena[2] = "Dragana";
    imena[3] = "Jelisaveta";
   
    ArrayList<String> imena1 = new ArrayList<String>();
    
    imena1.add("Milovan");
    System.out.println(imena1.get(0));
    imena1.add("Dragan");
    imena1.add("Petar");
    imena1.add("Milutin");
    imena1.add("Zika");
    
    
    int duzinaListe = imena1.size();
    System.out.println("Vrednost drugog elementa liste je " + imena1.get(1));
    System.out.println("Duzina liste pre brisanja drugog elementa je: " + duzinaListe);
    
    imena1.remove(1);
    System.out.println("Vrednost drugog elementa liste je posle brisanja drugog elementa " + imena1.get(1));
    duzinaListe = imena1.size();
    System.out.println("Duzina liste posle brisanja drugog elementa je: " + duzinaListe);
    
    for(int i = 0; i < imena1.size(); i++ )
    {
      System.out.println((i+1)+". element liste je "+imena1.get(i));
    }
    
//    Collections.swap(imena1, 1, 3);
//    System.out.println();
    String elementPrePromene = imena1.get(1);
    imena1.set(1, imena1.get(3));
    System.out.println(imena1.get(1));
    imena1.set(3, elementPrePromene);
  }

}
