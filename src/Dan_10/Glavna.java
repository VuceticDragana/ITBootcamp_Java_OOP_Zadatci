package Dan_10;

import java.util.ArrayList;

// Na kraju iz glavne klase dodajte par radnika firmi i ispisite podatke o zaposlenima u firmi

public class Glavna
{

  public static void main(String[] args)
  {
    Radnik r1 = new Radnik("1234567891234", "Pera", "Peric", 2, 5, 12);
    System.out.println(r1.getJmbg());
    System.out.println(r1.plataRadnika());
    System.out.println(r1.kreditnoSposoban());
    System.out.println(r1.slobodniDani());
    
    Firma f1 = new Firma("Firma1", "gradjevinarstvo", 2000);
    Firma f2 = new Firma("Firma2", "ugostiteljstvo", 2012);
    
    ArrayList<Firma> listaFirmi = new ArrayList<Firma>();
    listaFirmi.add(f1);
    listaFirmi.add(f2);

    for(int i = 0; i < listaFirmi.size(); i++)
    {
      listaFirmi.get(i).stampajOFirmi();
    }
    
    f1.dodajRadnika(r1);
    
    f1.stampajRadnike();
    
    
    
  }

}
