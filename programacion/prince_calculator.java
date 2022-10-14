// autor Oriana Reina

import java.util.Scanner;

public class prince_calculator {
  public static void main(String[] args) throws Exception {
    Scanner userEntry = new Scanner(System.in);
    System.out.println("Ingrese el precio: ");
    double price = userEntry.nextDouble();
    int priceAt9 = 0, priceAt1 = 0;
    priceAt9 = getPriceAt9(price);
    priceAt1 = getPrinceAt1(price);

    System.out.println("El precio a las 9am era: " + priceAt9 + " y el precio a la 1pm era: " + priceAt1 + ".");
    userEntry.close();
  }

  static int getPriceAt9(double price) {
    int percentage = (int) (price * 10) / 100;
    return (int) (price - percentage);
  }

  static int getPrinceAt1(double price) {
    int percentage = (int) (price * 10) / 100;
    return (int) (price - percentage);
  }

  // Podriamos crear un solo método que reciba el precio y devuelva el precio a
  // las 9am y el precio a la 1pm.
}
