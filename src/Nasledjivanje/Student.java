package Nasledjivanje;

public class Student extends Osoba
{
  private String brIndex;

  public Student(String ime, String prezime, String jmbg, String brIndex)
  {
    super(ime, prezime, jmbg);
    this.brIndex = brIndex;
  }

  public String getBrIndex()
  {
    return brIndex;
  }

  public void setBrIndex(String brIndex)
  {
    this.brIndex = brIndex;
  }
  
  @Override
  public void stampa()
  {
    super.stampa();
    System.out.println(", " + getBrIndex());
  }

}
