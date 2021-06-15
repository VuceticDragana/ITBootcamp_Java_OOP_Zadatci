package Vezba5;

//Tip Disciplina koji ima:
// promenljivu koja sadrzi naziv discipline
// promenljivu koja sadrzi normu
// konstruktor koji prihvata i setuje naziv i normu

public class Disciplina
{
  private String nazivDiscipline;
  private double norma;
  
  public Disciplina(String nazivDiscipline, double norma)
  {
    super();
    this.nazivDiscipline = nazivDiscipline;
    this.norma = norma;
  }

  public String getNazivDiscipline()
  {
    return nazivDiscipline;
  }

  public double getNorma()
  {
    return norma;
  }

  public void setNazivDiscipline(String nazivDiscipline)
  {
    this.nazivDiscipline = nazivDiscipline;
  }

  public void setNorma(int norma)
  {
    this.norma = norma;
  }
  
  
}
