package Dan_12;

public class Test
{

  public static void main(String[] args)
  {
    MotornoVozilo a1 = new Autobus(4, 3, "su-123456", "Ikarbus", 15);
    MotornoVozilo k2 = new Kamion(6, 2, "ns-598746", 1, "Fap", "Kamion");     
    
    System.out.println(a1);
    System.out.println(k2);
  }

}
