package Vezba3;

//Klasu Prijava koja sadrži
//– Atributi: naziv predmeta, broj indeksa studenta, ispitni rok
//– Konstruktor koji prihvata i setuje naziv predmeta, broj indeksa studenta i ispitni rok

public class Prijava
{
  private String nazivPredmeta;
  private String brIndeksa;
  private String ispitniRok;
  
  public Prijava(String nazivPredmeta, String brIndeksa, String ispitniRok)
  {
    super();
    this.nazivPredmeta = nazivPredmeta;
    this.brIndeksa = brIndeksa;
    this.ispitniRok = ispitniRok;
  }

  public String getNazivPredmeta()
  {
    return nazivPredmeta;
  }

  public void setNazivPredmeta(String nazivPredmeta)
  {
    this.nazivPredmeta = nazivPredmeta;
  }

  public String getBrIndeksa()
  {
    return brIndeksa;
  }

  public void setBrIndeksa(String brIndeksa)
  {
    this.brIndeksa = brIndeksa;
  }

  public String getIspitniRok()
  {
    return ispitniRok;
  }

  public void setIspitniRok(String ispitniRok)
  {
    this.ispitniRok = ispitniRok;
  }

  
}
