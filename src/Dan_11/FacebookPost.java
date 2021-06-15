package Dan_11;

import java.util.ArrayList;

//Kreirati klasu FacebookPost koja ima:
//   ime i prezime korisnika koji je stavio oglas
//   tekst objave
//   Listu reakcija
//   metodu reaguj, koja dodaje reakciju u niz
//   privatnu metodu koja vraca broj reakcija odredjenog tipa 
// (prosledjuje se tip reakcije koji moze da bude smajli, like ili srce)
//   metodu stampaj koja stampa info o postu u formatu:
//ime i prezime
//tekst objave
//Smajli 10 | Like 15 | Srce 2

public class FacebookPost
{
  private String ime;
  private String prezime;
  private String tekstPoruke;
  private ArrayList<Reakcija> reakcije;
  
  public FacebookPost(String ime, String prezime, String tekstPoruke)
  {
    super();
    this.ime = ime;
    this.prezime = prezime;
    this.tekstPoruke = tekstPoruke;
    this.reakcije = new ArrayList<Reakcija>();
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
  
  public String getTekstPoruke()
  {
    return tekstPoruke;
  }
  
  public void setTekstPoruke(String tekstPoruke)
  {
    this.tekstPoruke = tekstPoruke;
  }
  
  public ArrayList<Reakcija> getReakcije()
  {
    return reakcije;
  }
  
  public void setReakcije(ArrayList<Reakcija> reakcije)
  {
    this.reakcije = reakcije;
  }
  
  public void reaguj(Reakcija r)
  {
    getReakcije().add(r);
  }
  
  private int countReaction(TipReakcije tip)
  {
    int count = 0;

    for (int i = 0; i < getReakcije().size(); i++)
    {
      if(tip == getReakcije().get(i).getTipReakcije())
      {
        count = count + 1;
      }
    }    
    return count;
  }
  
  public void stampaj()
  {  
    System.out.printf("%s %s\n%s\nSmajli %d | Like %d | Srce %d\n", getIme(),getPrezime(), getTekstPoruke(), 
        countReaction(TipReakcije.Smajli), countReaction(TipReakcije.Like), countReaction(TipReakcije.Srce));
  }
}
