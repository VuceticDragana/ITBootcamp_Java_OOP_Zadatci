package Zadatak;

//Napraviti klasu Koktel koja nasledjuje Pice koja ima
//Konstrukrore, gettere i settere
//Metodu koja racuna cenuPica po formuli 1.9 * cena svih sastojaka
//Metodu stampaj koja stampa ukupnu cenu koktela i sve sastojke sa cenama sastojaka
//Primer ispisa:
//Koktel: mojito, cena:114.0 din
//Sastojci:
//limun, cena: 30.0 din
//menta, cena: 20.0 din
//votka, cena: 10.0 din

public class Koktel extends Pice
{
  public Koktel(String naziv)
  {
    super(naziv);
  }

  @Override
  public double cenaPica()
  {
    return 1.9 * cenaSvihSastojaka();
  }

  @Override
  public void stampa()
  {
    System.out.println("Koktel: " + getNaziv() + ", cena: " + cenaPica() + "din");
    System.out.println("Sastojci: ");
    
    for (int i = 0; i < getSastojciPica().size(); i++)
    {
      getSastojciPica().get(i).stampa();
    }

  }

}
