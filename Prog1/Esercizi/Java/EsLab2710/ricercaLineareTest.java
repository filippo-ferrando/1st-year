public class ricercaLineareTest {
  
  public static void main (String[] args) {
    ricercaLineareConTest();
    //ricercaLineareConLogicaTest();
    //ricercaLineareConTestIncrociato();
  }
  
  public static void ricercaLineareConTest() {
    System.out.println("-- Test per ricercaLineareCon ");
    int[] x0 = null;
    System.out.println(ricercaLineare.controllo(x0,1)==false);
    int[] x1 = {};     
    System.out.println(ricercaLineare.controllo(x1,1)==false);
    int[] x2 = {0};    
    System.out.println(ricercaLineare.controllo(x2,1)==false);
    int[] x3 = {1};    
    System.out.println(ricercaLineare.controllo(x3,1)==true);
    int[] x4 = {1,0};   
    System.out.println(ricercaLineare.controllo(x4,1)==true);
    int[] x5 = {0,1};   
    System.out.println(ricercaLineare.controllo(x5,1)==true);
    int[] x6 = {0,1,0,1,0};   
    System.out.println(ricercaLineare.controllo(x5,1)==true);    
  }
}