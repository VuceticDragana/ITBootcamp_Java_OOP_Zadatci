package ApstraktneKlase;

public class Pravougaonok extends GeometrijskaFigura
{
  private double a;
  private double b;  

  public Pravougaonok(double a, double b)
  {
    super();
    this.a = a;
    this.b = b;
  } 

  public double getA()
  {
    return a;
  }
  
  public void setA(double a)
  {
    this.a = a;
  }

  public double getB()
  {
    return b;
  }

  public void setB(double b)
  {
    this.b = b;
  }

  @Override
  public double povrsina()
  {    
    return getA() * getB();
  }

  @Override
  public double obim()
  {    
    return (2 * getA()) + (2 * getB());
  }

}
