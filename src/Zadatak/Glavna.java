package Zadatak;

import java.util.ArrayList;

//U glavnoj klasi napraviti listu pica koja ce sadrzati dve kafe I tri koktela (svako pice ima nekoliko
//sastojaka) i na kraju ispisati racun u formatu:
//Pica koja ste porucili:
//1. pice: Mocha, procenat kofeina: 1%, cena: 150.0 din
//Sastojci:
//Mleko, cena: 50.0 din
//Slag, cena: 70.0 din
//-----------------------------------
//2. pice: NesKafa, procenat kofeina: 3%, cena: 235.0 din
//Sastojci:
//Sladoled, cena: 25.0 din
//Slag, 70.0 din
//Mleko, cena: 50.cena: 0 din
//-----------------------------------
//3. pice: Koktel: mojito, cena:114.0 din
//Sastojci:
//limun, cena: 30.0 din
//menta, cena: 20.0 din
//votka, cena: 10.0 din
//-----------------------------------
//4. pice: Koktel: White Rusian, cena:114.0 din
//Sastojci:
//votka, cena: 10.0 din
//Mleko, cena: 50.0 din
//-----------------------------------
//5. pice: Koktel: Bambus, cena:95.0 din
//Sastojci:
//crno vino, cena: 20.0 din
//koka kola, cena: 30.0 din
//-----------------------------------
//Ukupan iznos racuna je: 708.0

public class Glavna
{
  public static void main(String[] args)
  {
    ArrayList <Pice> pica = new ArrayList <Pice>();
    
    Kafa ka1 = new Kafa("Mocha", 1);
    Kafa ka2 = new Kafa("NesKafa", 3);
    
    Koktel ko1 = new Koktel("Mojito");
    Koktel ko2 = new Koktel("White Rusian");
    Koktel ko3 = new Koktel("Bambus");
    
    Sastojak s1 = new Sastojak("Mleko", 10, 8);
    Sastojak s2 = new Sastojak("Slag", 10, 12);
    Sastojak s3 = new Sastojak("Sladoled", 20, 30);
        
    Sastojak s4 = new Sastojak("limun", 8, 20);
    Sastojak s5 = new Sastojak("menta", 3, 15);
    Sastojak s6 = new Sastojak("vodka", 10, 25);    
    
    Sastojak s7 = new Sastojak("crno vino", 15, 7);
    Sastojak s8 = new Sastojak("koka kola", 20, 5);    
    
    pica.add(ka1);
    pica.add(ka2);
    pica.add(ko1);
    pica.add(ko2);
    pica.add(ko3);
    
    ka1.dodatiSastojak(s1);
    ka1.dodatiSastojak(s2);
    
    ka2.dodatiSastojak(s1);
    ka2.dodatiSastojak(s2);
    ka2.dodatiSastojak(s3);
    
    ko1.dodatiSastojak(s4);
    ko1.dodatiSastojak(s5);
    ko1.dodatiSastojak(s6);
    
    ko2.dodatiSastojak(s1);
    ko2.dodatiSastojak(s6);
    
    ko3.dodatiSastojak(s7);
    ko3.dodatiSastojak(s8);
    
    double ukupnaSuma = 0;    
    int j = 1;    
    
    for (int i = 0; i < pica.size(); i++)
    {
      System.out.print(j + ". pice: ");
      j++;
      pica.get(i).stampa();
      System.out.println("---------------------------------------");
      ukupnaSuma = ukupnaSuma + pica.get(i).cenaPica();        
    }
    
    System.out.println("Ukupan iznos racuna je: " + ukupnaSuma);
  }
}
