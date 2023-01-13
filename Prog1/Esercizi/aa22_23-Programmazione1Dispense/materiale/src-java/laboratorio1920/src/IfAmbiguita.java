/**
  * Il compilatorie associa un ramo {@code else} all'ultima
  * selezione {@code if} incontrata.
  */
class IfAmbiguita
{
  public static void main(String[] args) {

    int x = 2;  // provare con x==1 e y!=1
    int y = 2;  // provare con x==1 e y==1
    int z = 100;

    if (x == 1) if (y == 1) z = x + y; else z = x - y;
    System.out.println(z);
  }
}
