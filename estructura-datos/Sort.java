public class Sort {
  public static void main(String[] args) throws Exception {
    int[][] array = {
        { 1 },
        { 1, 2 },
        { 3, 2, 1 },
        { 1, 3, 5, 6, 4, 2 },
        { 4, 1, 3, 1, 2, 4, 2 }
    };

    for (int i = 0; i < array.length; i++) {
      int[] arrayOrder = ordenarArreglo(array[i]);
      imprimeArreglo(arrayOrder);
    }
  }

  static int[] ordenarArreglo(int[] array) {
    for (int i = 1; i < array.length; i++) {
      int current = array[i];
      int previous = i - 1;

      while ((previous > -1) && (array[previous] > current)) {
        array[previous + 1] = array[previous];
        previous--;
      }
      array[previous + 1] = current;
    }
    return array;
  }

  static void imprimeArreglo(int[] array) {
    for (int x = 1; x <= array.length; x++) {
      System.out.print(array[x - 1] + " ");
    }
    System.out.print("\n");
  }
}
