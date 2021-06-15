package Vezba1;

public class Student
{
  private String ime;
  private String prezime;
  private String brIndexa;
  private int godStudija;  

  public Student(String ime, String prezime, String brIndexa, int godStudija)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
    this.brIndexa = brIndexa;
    this.godStudija = godStudija;
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

  public String getBrIndexa()
  {
    return brIndexa;
  }

  public void setBrIndexa(String brIndexa)
  {
    this.brIndexa = brIndexa;
  }

  public int getGodStudija()
  {
    return godStudija;
  }

  public void setGodStudija(int godStudija)
  {
    this.godStudija = godStudija;
  }  
  
  public double skolarina()
  {
    return 0;
  }
  
  public boolean isBudzet()
  {
    return true;
  }

  public void stampa()
  {
    String finansiranje;
    
    if(isBudzet())
    {
      finansiranje = "budzet";
    }
    else
    {
      finansiranje = "samofinansirajuci";
    }
    System.out.printf("%s %s, %s, %d\nFinansiranje: %s\nCena skolarine: %.1f\n", 
        getIme(), getPrezime(), getBrIndexa(), getGodStudija(), finansiranje, skolarina());
  }
  
  
}
