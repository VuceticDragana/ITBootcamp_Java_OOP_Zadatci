package Zadatak;

//Napraviti klasu Sastojak koja ima:
//Atribute:
//Naziv
//Kolicina u gramima
//Cena po gramu
//Konstrukrore, gettere i settere
//Metodu cena sastojaka (vraca cenu sastojka koja se racuna po formuli kolicina u gr * cana po gr)
//Metodu stampaj koja vrsi ispis u formatu naziv sastojak, cena sastojka
//Primer ispisa:
//limun, cena: 30.0 din

public class Sastojak
{
  private String naziv;
  private double kolicinaGr;
  private double cenaGr;
  
  public Sastojak(String naziv, double kolicinaGr, double cenaGr)
  {
    super();
    this.naziv = naziv;
    this.kolicinaGr = kolicinaGr;
    this.cenaGr = cenaGr;
  }

  public String getNaziv()
  {
    return naziv;
  }

  public void setNaziv(String naziv)
  {
    this.naziv = naziv;
  }

  public double getKolicinaGr()
  {
    return kolicinaGr;
  }

  public void setKolicinaGr(double kolicinaGr)
  {
    this.kolicinaGr = kolicinaGr;
  }

  public double getCenaGr()
  {
    return cenaGr;
  }

  public void setCenaGr(double cenaGr)
  {
    this.cenaGr = cenaGr;
  }
  
  public double cenaSastojka()
  {
    return getKolicinaGr() * getCenaGr();
  }
  
  public void stampa()
  {
    System.out.println(getNaziv() + ", cena: " + cenaSastojka() + " din");
  }
}
