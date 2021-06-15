package Dan_12_2;

public class Korisnik
{
  private String ime;
  private String prezime;
  private int tipLicence; // basic = 0, pro = 1, premium = 2
  
  public Korisnik(String ime, String prezime, int tipLicence)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
    this.tipLicence = tipLicence;
  }

  public String getIme()
  {
    return ime;
  }

  public void setIme(String ime)
  {
    this.ime = ime;
  }

  public String getPrezime()
  {
    return prezime;
  }

  public void setPrezime(String prezime)
  {
    this.prezime = prezime;
  }  
  
  public int getTipLicence()
  {
    return tipLicence;
  }

  public void pretplatiSe(int uplata)
  {    
    if(uplata == 100)
    {
      tipLicence = 1;
    }
    else if (uplata == 150)
    {
      tipLicence = 2;
    }
  }
  
  public void ponistiUplatu()
  {
    tipLicence = 0;
  }
  
  public int maxDuzina()
  {
    int maxDuzina = 0;
    
    switch(tipLicence)
    {
    case 0: maxDuzina = 40;
    break;
    
    case 1: maxDuzina = 240;
    break;
    
    case 2: maxDuzina = 1440;
    break;
    }    
    
    return maxDuzina;
  }
  
  public String vracaKorisnika()
  {
    return getIme() + " " + getPrezime();
  }
  
  public void stampaKorisnika()
  {
    System.out.println(vracaKorisnika());
  }
}
