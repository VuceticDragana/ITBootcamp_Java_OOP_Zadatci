package Dan_9;

// polazniku kursa dodajte atribut polaznikov racunar
// i dodajte metodu koja stampa podatke o polaznikovom imenu i racunaru koji koristi

public class PolaznikKursa
{
  public int idPolaznika; // propertiji (atributi) klase
  public String ime;
  public String prezime;
  public int godinaRodjenja;
  public double prosek; 
  private String srednjaSkola;
  public Racunar polaznikovRacunar;
  
  public PolaznikKursa()
  {
    
  }  
  
  public PolaznikKursa(int idPolaznika, String ime, String prezime, int godinaRodjenja, double prosek)
  {
    super();
    this.idPolaznika = idPolaznika;
    this.ime = ime;
    this.prezime = prezime;
    this.godinaRodjenja = godinaRodjenja;
    this.prosek = prosek;
  }  
  
  public String getSrednjaSkola()
  {
    return srednjaSkola;
  }

  public void setSrednjaSkola(String srednjaSkola)
  {
    this.srednjaSkola = srednjaSkola;
  }

  public void stampanjePodataka()
  {
    System.out.println("Polaznik sa id-jem " + this.idPolaznika + " se zove " + this.ime + " " + this.prezime
        + " i rodjen je " + this.godinaRodjenja + " i ima prosek " + this.prosek + " a isla je u srednju " + getSrednjaSkola());
  }
  
  public void racunanjeProseka(int[] ocene)
  {
    double zbir = 0;
    for(int i = 0; i < ocene.length; i++)
    {
      zbir = zbir + ocene[i];
    }
    this.prosek = zbir/ocene.length;
  }
  
  public void stampanjeORacunaru()
  {
    System.out.printf("Polaznik %s %s koristi racunar marke %s model je %s sa ramom u %dGB",this.ime, this.prezime, 
        this.polaznikovRacunar.markaRacunara, this.polaznikovRacunar.modelRacunara, this.polaznikovRacunar.ramMemorijaGB);
  }
}
