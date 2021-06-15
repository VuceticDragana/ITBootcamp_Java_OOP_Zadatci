package Vezba1;

public class StudentMaster extends Student
{
  public StudentMaster(String ime, String prezime, String brIndexa, int godStudija)
  {
    super(ime, prezime, brIndexa, godStudija);    
  }
  
  @Override
  public double skolarina()
  {
    return 100000;
  }

  @Override
  public boolean isBudzet()
  {
    if(getGodStudija() <= 2)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
