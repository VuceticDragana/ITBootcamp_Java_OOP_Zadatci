package Vezba3;

//Klasu Student koja sadrži
//– Atribute: broj indeksa, ime i prezime
//– Konstruktor koji prihvata i setuje broj indeksa, ime i prezime
//– Medodu PrijaviIspit koja kao argumente prihvata studentsku sluzbu u kojoj treba prijaviti ispit,
//rok i naziv ispita. Zatim kreira prijavu sa odgovarajucim podacima i prijavljuje ispit studentskoj
//sluzbi.

public class Student
{
  private String brIndeksa;
  private String ime;
  private String prezime;
  
  public Student(String brIndeksa, String ime, String prezime)
  {
    super();
    this.brIndeksa = brIndeksa;
    this.ime = ime;
    this.prezime = prezime;
  }

  public String getBrIndeksa()
  {
    return brIndeksa;
  }

  public void setBrIndeksa(String brIndeksa)
  {
    this.brIndeksa = brIndeksa;
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
  
  public void prijaviIspit(StudentskaSluzba ss, Prijava p)
  {  
    System.out.printf("%s prijavljuje ispit %s u %s roku\n", 
        getIme(), p.getNazivPredmeta(), p.getIspitniRok());
  }
}
