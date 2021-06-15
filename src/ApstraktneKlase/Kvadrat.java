package ApstraktneKlase;

public class Kvadrat extends GeometrijskaFigura
{
  private int a;

  public Kvadrat(int a)
  {
    super();
    this.a = a;
  }

  public int getA()
  {
    return a;
  }

  public void setA(int a)
  {
    this.a = a;
  }

  @Override
  public double povrsina()
  {    
    return getA() * getA();
  }

  @Override
  public double obim()
  {    
    return 4 * getA();
  }
  
  
}
