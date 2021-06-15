package Vezba5;

import java.util.ArrayList;

//Tip Takmicenje koji ima:
// staticki niz disciplina
// niz takmicara
// naziv takmicenja
// broj takmicara pocetno inicijalizovan na nulu
// konstruktor koji prihvata i setuje naziv takmicenja
// metodu pronadjiDisciplinu koja za dati naziv discipline vraca disciplinu tog naziva ukoliko
//postoji u suprotnom vraca null
// metudu Prijava koja prihvata takmicara ukoliko njegova disciplina postoji u suprotnom
//ispisuje da nije prijavljen
// metodu izlistajTakmicare koja izlistava takmicare prema disciplini ukoliko ima takmicara date
//discipline

public class Takmicenje
{
  private static ArrayList<Disciplina> disciplina;
  private ArrayList<Takmicar> takmicar;
  private String nazivTakmicenja;
  private int brTakmicara;

  public Takmicenje(String nazivTakmicenja)
  {
    super();
    this.nazivTakmicenja = nazivTakmicenja;
    this.brTakmicara = 0;
    //disciplina = new ArrayList<Disciplina>();
    this.takmicar = new ArrayList<Takmicar>();
  }

  public static ArrayList<Disciplina> getDisciplina()
  {
    return disciplina;
  }

  public static void setDisciplina(ArrayList<Disciplina> disciplina)
  {
    Takmicenje.disciplina = disciplina;
  }

  public int getBrTakmicara()
  {
    this.brTakmicara = getTakmicar().size();
    return brTakmicara;
  }

//  public void setBrTakmicara(int brTakmicara)
//  {
//    this.brTakmicara = brTakmicara;
//  }

  public ArrayList<Takmicar> getTakmicar()
  {
    return takmicar;
  }

  public String getNazivTakmicenja()
  {
    return nazivTakmicenja;
  }

  public Disciplina pronadjiDisciplinu(String naziv)
  {// metodu pronadjiDisciplinu koja za dati naziv discipline vraca disciplinu tog
   // naziva ukoliko
   // postoji u suprotnom vraca null

    for (int i = 0; i < getDisciplina().size(); i++)
    {
      if (getDisciplina().get(i).getNazivDiscipline() == naziv)
      {
        return getDisciplina().get(i);
      }
    }
    return null;
  }

//metudu Prijava koja prihvata takmicara ukoliko njegova disciplina postoji u suprotnom
//ispisuje da nije prijavljen
  public void Prijava(Takmicar t)
  {
    Disciplina disc;
    disc = pronadjiDisciplinu(t.getNazivDiscipline());
    
    if(disc != null)
    {
      getTakmicar().add(t);
      t.setRedniBroj(getBrTakmicara());
    }
    else
    {
      System.out.println("nije prijavljen");
    }
  }

//metodu izlistajTakmicare koja izlistava takmicare prema disciplini ukoliko ima takmicara date
//discipline
  public void izlistajTakmicare(String naziv)
  {
    for (int i = 0; i < getTakmicar().size(); i++)
    {
      if(getTakmicar().get(i).getNazivDiscipline().equalsIgnoreCase(naziv))
      {
      System.out.println(getTakmicar().get(i));
      }
    }
  }
}
