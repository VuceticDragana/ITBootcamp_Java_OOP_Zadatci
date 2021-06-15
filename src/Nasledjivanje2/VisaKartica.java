package Nasledjivanje2;

public class VisaKartica extends PlatnaKartica
{
  private String ime;
  private String prezime;

  public VisaKartica(double suma, String brKartice, int godina, int mesec, String ime, String prezime)
  {
    super(suma, brKartice, godina, mesec);
    this.ime = ime;
    this.prezime = prezime;
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
  
  public void izvrsiTransakciju(double novac)
  {
    double sumaZaSkidanje = novac * 0.018;
    
    if(sumaZaSkidanje < 4)
    {
      
    }
  }

}
