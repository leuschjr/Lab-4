//  Lab 4 Jacob Leusch 





import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The random number is:" + randomNum);

    for (int count = randomNum; count >= 0; count--) {
      System.out.println(count);
    }
      if (randomNum < 25) {
        System.out.println("Ahoy Matrys!");
      } 
      else if (randomNum > 25 && randomNum < 42) {
        System.out.println("Cannonball!");
      } 
      else {
        System.out.println("Blast Off!");
      }
    }
  }