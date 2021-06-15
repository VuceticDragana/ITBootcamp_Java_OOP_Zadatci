package Vezba1;

public class StudentOsnovnih extends Student
{
  public StudentOsnovnih(String ime, String prezime, String brIndexa, int godStudija)
  {
    super(ime, prezime, brIndexa, godStudija);    
  }
  
  @Override
  public double skolarina()
  {
    return 90000;
  }

  @Override
  public boolean isBudzet()
  {
    if(getGodStudija() < 5)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
