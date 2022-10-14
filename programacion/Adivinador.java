// autor Oriana Reina

import java.util.Scanner;

public class Adivinador {
  public static void main(String[] args) throws Exception {
    String[] characters = {
        "Radamel Falcao Garcia", "Goku", "Michael Jordan",
        "Eminem", "Darth Vader", "Adam Sandler", "Bruce Wayne",
        "Tin Tin", "Ayudante de Santa",
        "Joe Biden", "José Saramago", "Günter Grass", "Kim Jong Un"
    };

    System.out.println("Escoge un personaje de la lista: ");
    for (int i = 0; i < characters.length; i++) {
      System.out.println(characters[i]);
    }
    System.out.println("Responde con si o no");

    if (handlerQuestion("¿Es real?")) {
      if (handlerQuestion("Es americano")) {
        if (handlerQuestion("Es deportista")) {
          System.out.println("Es Michael Jordan");
        } else {
          if (handlerQuestion("Es politico")) {
            System.out.println("Es Joe Biden");
          } else {
            if (handlerQuestion("Es actor")) {
              System.out.println("Es Adam Sandler");
            } else {
              System.out.println("Es Eminem");
            }
          }
        }
      } else {
        if (handlerQuestion("Es deportista")) {
          System.out.println("Es Radamel Falcao Garcia");
        } else {
          if (handlerQuestion("Es gobernante")) {
            System.out.println("Es Kim Jong Un");
          } else {
            if (handlerQuestion("Es alemán")) {
              System.out.println("Es Gunte Grass");
            } else {
              System.out.println("Es José Saramago");
            }
          }
        }
      }
    } else {
      if (handlerQuestion("¿Es un dibujo animado?")) {
        if (handlerQuestion("¿Es un perro?")) {
          System.out.println("Es Ayudante de santa");
        } else {
          if (handlerQuestion("¿Es un super sayayin?")) {
            System.out.println("Es Goku");
          } else {
            System.out.println("Es Tintin");
          }
        }
      } else {
        if (handlerQuestion("¿Vive en Gotham?")) {
          System.out.println("Es Bruce Wayne");
        } else {
          System.out.println("Es Darth Vader");
        }
      }
    }
  }

  static boolean handlerQuestion(String question) {
    System.out.println(question);
    if (new Scanner(System.in).nextLine().equals("si")) {
      return true;
    } else {
      return false;
    }
  }

}