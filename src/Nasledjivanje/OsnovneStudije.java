package Nasledjivanje;

public class OsnovneStudije extends Student
{
  public OsnovneStudije(String ime, String prezime, String jmbg, String brIndex)
  {
    super(ime, prezime, jmbg, brIndex);
  }
  
  @Override
  public void stampa()
  {
    System.out.print("Student osnovnih studija: ");
    super.stampa();
  }

}
