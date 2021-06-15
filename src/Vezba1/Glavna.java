package Vezba1;

public class Glavna
{

  public static void main(String[] args)
  {
    Student s1 = new Student("Pera", "Peric", "12548", 4);
    
    StudentOsnovnih so = new StudentOsnovnih("Iva", "Ivic", "78549", 3);
    
    StudentMaster sm = new StudentMaster("Milos", "Milosevic", "21645", 5);

    s1.stampa();
    so.stampa();
    sm.stampa();
  }

}
