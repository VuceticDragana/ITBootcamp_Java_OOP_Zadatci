package Nasledjivanje2;

public class PlatnaKartica
{
  private double suma;
  private String brKartice;
  private int godina;
  private int mesec;
  
  public PlatnaKartica(double suma, String brKartice, int godina, int mesec)
  {
    super();
    this.suma = suma;
    this.brKartice = brKartice;
    this.godina = godina;
    this.mesec = mesec;
  }

  public double getSuma()
  {
    return suma;
  }

  public String getBrKartice()
  {
    return brKartice;
  }

  public int getGodina()
  {
    return godina;
  }

  public int getMesec()
  {
    return mesec;
  }
  
  public void dodajSredstva(double novac)
  {
    this.suma = this.suma + novac;
  }
  
  public void izvrsiTransakciju(double trosak)
  {
    this.suma = this.suma - trosak;
  }
  
  public void stampa()
  {
    System.out.println(getBrKartice() + ", " + getMesec() + "/" + getGodina() + ", " + "$" + getSuma());
  }
}
