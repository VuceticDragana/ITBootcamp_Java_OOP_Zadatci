package Zadatak;

import java.util.ArrayList;

//Napraviti apstraktnu klasu Pice koja ima:
//Atribute:
// naziv,
// listu sastojaka (predstavlja listu svih sastojaka pica npr. Mohito ima limunadu, mentu i votku)
//Konstrukrore, gettere i settere
//Metodu dodaj sastojak (parametar prima sastojak i dodaje ga u listu sastojaka)
//Metodu cena svih sastojaka koja vraca zbir cena svih sastojaka iz liste sastojaka
//Apstraktnu metodu cenaPica
//Apstraktnu metodu stampaj

public abstract class Pice
{
  private String naziv;
  private ArrayList<Sastojak> sastojciPica;
  
  public Pice(String naziv)
  {
    super();
    this.naziv = naziv;
    this.sastojciPica = new ArrayList<Sastojak>();
  }

  public String getNaziv()
  {
    return naziv;
  }

  public void setNaziv(String naziv)
  {
    this.naziv = naziv;
  }

  public ArrayList<Sastojak> getSastojciPica()
  {
    return sastojciPica;
  }

  public void setSastojciPica(ArrayList<Sastojak> sastojciPica)
  {
    this.sastojciPica = sastojciPica;
  }
  
  public void dodatiSastojak(Sastojak s)
  {
    getSastojciPica().add(s);
  }
  
  public double cenaSvihSastojaka()
  {
    double suma = 0;
    for (int i = 0; i < getSastojciPica().size(); i++)
    {
      suma = suma + getSastojciPica().get(i).cenaSastojka();
    }
    return suma;
  }
  
  public abstract double cenaPica();
  public abstract void stampa();
  
  
}
