// autor Oriana Reina

import java.util.Scanner;

public class weight_calculator {
  public static void main(String[] args) throws Exception {
    Scanner userEntry = new Scanner(System.in);
    System.out.println("Ingrese los gramos de un objeto que usted elija: ");
    double weightInGrams = userEntry.nextDouble();
    double kilograms = 0, pounds = 0, ounces = 0;
    kilograms = weightInGrams / 1000;
    pounds = weightInGrams / 454;
    ounces = weightInGrams / 28.35;
    System.out.println("Su objeto pesa " + kilograms + "kg, " + pounds + "lb, " + ounces + "oz");
    userEntry.close();
  }
}
