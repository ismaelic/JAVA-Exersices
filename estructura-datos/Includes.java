import java.util.HashSet;

public class Includes {
  public static void main(String[] args) throws Exception {
    int[] S = { 1, 3, 4, 8, 10, 50, 25 };
    int[] T = { 1, 3, 4, 7, 8, 23, 40, 50, 25, 10 };
    boolean estaContenido = estaSContenidoEnT(S, T);
    System.out.print("S esta contenido en T " + estaContenido);
  }

  public static boolean estaSContenidoEnT(int[] S, int[] T) {
    HashSet<Integer> table = new HashSet<>();

    for (int i : T) {
      table.add(i);
    }

    for (int j : S) {
      if (!table.contains(j)) {
        return false;
      }
    }

    return true;
  }
}
