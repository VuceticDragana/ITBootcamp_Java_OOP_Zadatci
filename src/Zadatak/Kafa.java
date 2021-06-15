package Zadatak;

//Napraviti klasu Kafa koja nasledjuje Pice koja ima
//Atribute:
//Procenat kofeina
//Konstrukrore, gettere i settere
//Metodu koja racuna cenuPica po formuli (procenat kofeina * 30) + cena svih sastojaka
//Metodu stampaj koja stampa ukupnu cenu kafe i sve sastojke sa cenama sastojaka
//Primer ispisa:
//Mocha, procenat kofeina: 1%, cena: 150.0 din
//Sastojci:
//Mleko, cena: 50.0 din
//Slag, cena: 70.0 din

public class Kafa extends Pice
{
  private double procenatKofeina;

  public Kafa(String naziv, double procenatKofeina)
  {
    super(naziv);
    this.procenatKofeina = procenatKofeina;
  }

  public double getProcenatKofeina()
  {
    return procenatKofeina;
  }

  public void setProcenatKofeina(double procenatKofeina)
  {
    this.procenatKofeina = procenatKofeina;
  }

  @Override
  public double cenaPica()
  {   
    return getProcenatKofeina() * 30 + cenaSvihSastojaka();
  }

  @Override
  public void stampa()
  {    
    System.out.println(getNaziv() + ", procenat kofeina: " + getProcenatKofeina() + "%, cena: " + cenaPica() + "din");
    System.out.println("Sastojci: ");
    
    for (int i = 0; i < getSastojciPica().size(); i++)
    {
      getSastojciPica().get(i).stampa();
    }
  }
  
  
  
}
