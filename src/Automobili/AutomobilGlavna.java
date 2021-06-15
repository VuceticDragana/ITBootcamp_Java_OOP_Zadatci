package Automobili;

public class AutomobilGlavna
{

  public static void main(String[] args)
  {
    // iz AutomobilGlavna klase instancirajete nekoliko objekata klase automobil i
    // odstampajte podatke o njima pozivajuci metodu za stampanje te klase
    
    // iz glavne klase ispisite model automobila i koliko trosi za svaki objekat
    
    Automobil a1 = new Automobil("Zastava", "101", "Benzin", 3, 1980);
    Automobil a2 = new Automobil("Lada", "Niva", "Benzin", 5, 1982);
    
    Automobil a3 = new Automobil();
    a3.marka = "Zastava";
    a3.model = "Jugo";
    a3.pogonskoGorivo = "Benzin";
    a3.godinaProizvodnje = 1985;
    a3.brojVrata = 3;
    a3.potrosnjaNa100km();
    
    a1.stampaPodatke();
    a2.stampaPodatke();
    System.out.println(a3.getPotrosnja());

  }

}
