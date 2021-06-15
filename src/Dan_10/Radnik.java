package Dan_10;

public class Radnik
{
  private String jmbg;
  private String ime;
  private String prezime;
  private int brDece;
  private int sss;
  private int staz;  
  
  public Radnik(String jmbg, String ime, String prezime, int brDece, int sss, int staz)
  {
    super();
    this.jmbg = jmbg;
    this.ime = ime;
    this.prezime = prezime;
    this.brDece = brDece;
    this.sss = sss;
    this.staz = staz;
  }

  public String getJmbg()
  {
    return jmbg;
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
  
  public int getBrDece()
  {
    return brDece;
  }
  
  public void setBrDece(int brDece)
  {
    this.brDece = brDece;
  }
  
  public int getSss()
  {
    return sss;
  }
  
  public void setSss(int sss)
  {
    this.sss = sss;
  }
  
  public int getStaz()
  {
    return staz;
  }
  
  public void setStaz(int staz)
  {
    this.staz = staz;
  }
  
  public double koeficijentSlozenosti ()
  {
    switch(sss)
    {
    case 1: return 1.03;
    case 2: return 1.65;
    case 3: return 2.00;
    case 4: return 2.27;
    case 5: return 2.88;
    case 6: return 3.09;
    case 7: return 3.40;
    case 8: return 4.12;
    default: return 1;
    
    }
  }
  
  public double minuliRad()
  {
    if(staz < 10)
    {
      return 0.05;
    }
    else if(staz > 10 && staz < 20)
    {
      return 0.75;
    }
    else 
    {
      return 1.0;
    }
  }
  
  public double plataRadnika()
  {
    double plata;
    plata = 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
    return plata;
  }
  
  public boolean kreditnoSposoban()
  {
    if(plataRadnika() > 50000)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  
  public int slobodniDani()
  {
    int dani;    
    dani = 22 + (brDece * 2);
    return dani;
  }
  
  
}
