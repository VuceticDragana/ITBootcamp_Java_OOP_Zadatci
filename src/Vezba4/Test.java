package Vezba4;

import java.util.ArrayList;

//Testnu klasu koja treba da:
// kreira niz takmicara
// kreira drugi niz sa takmicarima koji ispunjavaju normu
// stampa podatke takmicara koji ispunjavaju normu.

public class Test
{
  public static void main(String[] args)
  {
    ArrayList<Takmicar> takmicari = new ArrayList<Takmicar>();
    
    Takmicar t1 = new Takmicar("Pera", "Peric", 5);
    Takmicar t2 = new Takmicar("Zika", "Zikic", 7);
    Takmicar t3 = new Takmicar("Mika", "Mikic", 2);
    
    takmicari.add(t1);
    takmicari.add(t2);
    takmicari.add(t3);
    
    //System.out.println(takmicari.get(0));
    
    Takmicar.setNorma(5);
    
    ArrayList<Takmicar> takmicariNorma = new ArrayList<Takmicar>();
    
    for (int i = 0; i < takmicari.size(); i++)
    {
      if(takmicari.get(i).ispuniNormu())
      {
        takmicariNorma.add(takmicari.get(i));
        System.out.println(takmicari.get(i));
      }
    }

  }

}
