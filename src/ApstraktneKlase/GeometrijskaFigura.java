package ApstraktneKlase;

public abstract class GeometrijskaFigura
{
  public abstract double povrsina();  
  public abstract double obim();
  
  public void stampa()
  {
    System.out.println("Povrsina je " + povrsina());
    System.out.println("Obim je " + obim());
  }

}
