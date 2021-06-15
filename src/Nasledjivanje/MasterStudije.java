package Nasledjivanje;

public class MasterStudije extends Student
{

  public MasterStudije(String ime, String prezime, String jmbg, String brIndex)
  {
    super(ime, prezime, jmbg, brIndex);    
  }
  
  @Override
  public void stampa()
  {
    System.out.print("Student master studija: ");
    super.stampa();
  }

}
