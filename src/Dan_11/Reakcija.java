package Dan_11;

//Kreirati klasu Reakcija koja ima 
//  tip reakcije (smajli, like, srce)
//   ime i prezime korisnika koji je reagovao 
//   gettere, settere i konstruktore

public class Reakcija
{
  private TipReakcije tipReakcije; 
  private String ime;
  private String prezime;
  
  public Reakcija(TipReakcije tipReakcije, String ime, String prezime)
  {
    super();
    this.tipReakcije = tipReakcije;
    this.ime = ime;
    this.prezime = prezime;
  }

  public TipReakcije getTipReakcije()
  {
    return tipReakcije;
  }

  public void setTipReakcije(TipReakcije tipReakcije)
  {
    this.tipReakcije = tipReakcije;
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
  
  
}
