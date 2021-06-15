package Automobili;

//napraviti klasu automobil koja od atributa ima marku, model, pogonsko gorivo, 
//broj vrata, godinu proizvodnje. Takodje ima 2 konstruktora: prvi prima sve 
//atribute za argumente, a drugi je prazan
//takodje, ima funkciju koja stampa podatke o objektima

//Dodati private atribut potrosnja na 100km, napraviti getter i setter i napraviti
//metodu koja odredjuje potrosnju na 100km, ako auto ima 3 vrata potrosnja je 5 litara,
//a ako auto ima 5 vrata potrosnja je 6 litara

public class Automobil
{
  public String marka;
  public String model;
  public String pogonskoGorivo;
  public int brojVrata;
  public int godinaProizvodnje;
  private double potrosnja;

  public Automobil()
  {

  }

  public Automobil(String marka, String model, String pogonskoGorivo, int brojVrata, int godinaProizvodnje)
  {
    super();
    this.marka = marka;
    this.model = model;
    this.pogonskoGorivo = pogonskoGorivo;
    this.brojVrata = brojVrata;
    this.godinaProizvodnje = godinaProizvodnje;
  }
  
  public double getPotrosnja()
  {
    return potrosnja;
  }

  private void setPotrosnja(double potrosnja)
  {
    this.potrosnja = potrosnja;
  }

  public void potrosnjaNa100km()
  {
    if(brojVrata == 3)
    {
      setPotrosnja(5);
    }
    else
    {
      setPotrosnja(6);
    }
  }
  
  public void stampaPodatke()
  {
    System.out.printf("Marka: %s, Model: %s, Pogonsko gorivo: %s, Broj vrata: %d, Godina proizvodnje: %d\n", this.marka,
        this.model, this.pogonskoGorivo, this.brojVrata, this.godinaProizvodnje);
  }

}
