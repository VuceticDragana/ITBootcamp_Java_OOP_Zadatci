package Dan_11_2;

import java.util.ArrayList;

//Kreirati klasu Pasta koja ima:
//     listu  sastojaka
//     metodu za dodavanje sastojka
//     metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
//     defaultni konstruktor
//     metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//     metodu za stampu koja stampa podatke u formatu:
//  Pasta je sa sastojcima:
//  naziv - cena.din
//  naziv - cena.din
//  naziv - cena.din
//  Cena paste je cena.din

public class Pasta
{
  private ArrayList<Sastojak> sastojci;

  public Pasta()
  {
    super();
    this.sastojci = new ArrayList<Sastojak>();
  }

  public ArrayList<Sastojak> getSastojci()
  {
    return sastojci;
  }

  public void setSastojci(ArrayList<Sastojak> sastojci)
  {
    this.sastojci = sastojci;
  }

  public void dodavanjeSastojka(Sastojak s)
  {
    getSastojci().add(s);
  }
  
  public void brisanjeSastojka(String naziv)
  {
    for (int i = 0; i < getSastojci().size(); i++)
    {
      if(getSastojci().get(i).getNaziv().equalsIgnoreCase(naziv))
      {
        getSastojci().remove(i);
        break;
      }
    }
  }
  
  public double cenaPaste()
  {
    double cena = 0;
    
    for (int i = 0; i < getSastojci().size(); i++)
    {
      cena = cena + getSastojci().get(i).getCena();
    }
    return cena;
  }
  
  public void stampaPodatke()
  {
    System.out.println("Pasta je sa sastojcima:");
    
    for (int i = 0; i < getSastojci().size(); i++)
    {
      getSastojci().get(i).stampaj();
    }
    
    System.out.printf("Cena paste je %.1f.din\n\n", cenaPaste());
  }
}
