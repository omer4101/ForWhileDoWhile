public class Main {
    public static void main(String[] args) {
        int i;

      for (int say = i=0; i<=5; i++){//for loop
          System.out.println("counting=" + i);
          while (i<10){//while loop
             System.out.println(i);
             i++;
          }
          System.out.println("While loop finished");
          //It only prints once, even if the condition is not met in the do while loop.!!
          int a=15;
          do {
              System.out.println(a);

          }while(a>100);
          System.out.println("Do while loop finished");
      }
    }
}
