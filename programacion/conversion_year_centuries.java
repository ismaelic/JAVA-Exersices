// autor Oriana Reina

import java.util.Scanner;

public class conversion_year_centuries {
  public static void main(String[] args) throws Exception {
    Scanner userEntry = new Scanner(System.in);
    System.out.println("Ingrese un año: ");
    double year = userEntry.nextDouble();
    int century = 0, firstYear = 0;
    century = getCentury(year);
    firstYear = getFirstYear(century);

    System.out.println("El año " + year + " pertenece al siglo " + century + " y su primer año es " + firstYear + ".");
    userEntry.close();
  }

  static int getCentury(double year) {
    return (int) (year + 99) / 100;
  }

  static int getFirstYear(int century) {
    return (int) (century * 100) - 99;
  }

}
