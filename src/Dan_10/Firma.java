package Dan_10;

// dodajte klasu firma koja ima od atributa naziv oblastPoslovanja i 
// godinu kada je osnovana

// klasi firma dodati atribut radmnici koji je tipa lista radnika, 
// zatim napraviti funkciju dodavanja radnika u klasi firma koja 
// dodaje radnike toj firm, takodje dodati funkciju koja ispisuje 
// podatke o radnicima te firme (ako firma nema ni jednog radnika 
// onda to i ispisati).

import java.util.ArrayList;

public class Firma
{
  private String naziv;
  private String oblastPoslovanja;
  private int godinaOsnivanja;
  private ArrayList<Radnik> radnici;

  public Firma(String naziv, String oblastPoslovanja, int godinaOsnivanja)
  {
    super();
    this.naziv = naziv;
    this.oblastPoslovanja = oblastPoslovanja;
    this.godinaOsnivanja = godinaOsnivanja;
    this.radnici = new ArrayList<Radnik>();
  }

  public String getNaziv()
  {
    return naziv;
  }

  public void setNaziv(String naziv)
  {
    this.naziv = naziv;
  }

  public String getOblastPoslovanja()
  {
    return oblastPoslovanja;
  }

  public void setOblastPoslovanja(String oblastPoslovanja)
  {
    this.oblastPoslovanja = oblastPoslovanja;
  }

  public int getGodinaOsnivanja()
  {
    return godinaOsnivanja;
  }

  public void setGodinaOsnivanja(int godinaOsnivanja)
  {
    this.godinaOsnivanja = godinaOsnivanja;
  }  

  public ArrayList<Radnik> getRadnici()
  {
    return radnici;
  }

  public void setRadnici(ArrayList<Radnik> radnici)
  {
    this.radnici = radnici;
  }
  
  public void dodajRadnika(Radnik radnik)
  {
    getRadnici().add(radnik);
  }
  
  public void stampajRadnike()
  {
    for (int i = 0; i < getRadnici().size(); i++)
    {
      System.out.println(getRadnici().get(i).getIme());
    }
    
  }

  public void stampajOFirmi()
  {
    System.out.printf("Nasa firma se zove %s i bavi se %s , a osnovani smo %d\n", naziv, oblastPoslovanja,
        godinaOsnivanja);
  }

}
