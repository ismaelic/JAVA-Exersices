public class VEDArbin<E> {

  protected E val;
  protected VEDArbin<E> izq;
  protected VEDArbin<E> der;

  public static void main(String[] args) {
    VEDArbin<Integer> emptyTree = new VEDArbin<Integer>();
    VEDArbin<Integer> derTree = new VEDArbin<Integer>();
    VEDArbin<Integer> eightTree = new VEDArbin<Integer>(8, emptyTree, emptyTree);
    VEDArbin<Integer> sevenTree = new VEDArbin<Integer>(7, emptyTree, emptyTree);
    VEDArbin<Integer> izqTree = new VEDArbin<Integer>(10, eightTree, sevenTree);
    VEDArbin<Integer> filledTree = new VEDArbin<Integer>(12, izqTree, derTree);

    System.out.println(filledTree.altura());
  }

  public VEDArbin() {
    val = null;
    izq = null;
    der = null;
  }

  public VEDArbin(E pVal, VEDArbin<E> pIzq, VEDArbin<E> pDer) {
    if (pVal == null) {
      throw new NullPointerException("¡Un árbol no vacio debe tener raiz!");
    }

    if (pIzq == null) {
      throw new NullPointerException("¡Un árbol no vacio necesita subárbol izquierdo!");
    }

    if (pDer == null) {
      throw new NullPointerException("¡Un árbol no vacio necesita subárbol derecho!");
    }

    val = pVal;
    izq = pIzq;
    der = pDer;
  }

  public E getVal() {
    return val;
  }

  public VEDArbin<E> getIzq() {
    return izq;
  }

  public VEDArbin<E> getDer() {
    return der;
  }

  public boolean esVacio() {
    if (val == null) {
      return true;
    } else {
      return false;
    }
  }

  public boolean esHoja() {
    if (esVacio()) {
      return false;
    } else {
      if (izq.esVacio() && der.esVacio()) {
        return true;
      } else {
        return false;
      }
    }
  }

  public int peso() {
    if (esVacio()) {
      return 0;
    } else {
      return 1 + izq.peso() + der.peso();
    }
  }

  public int altura() {
    if (esVacio()) {
      return 0;
    } else {
      return 1 + Math.max(izq.altura(), der.altura());
    }
  }

  public boolean isContained(E valor) {
    if (esVacio()) {
      return false;
    }

    if (val.equals(valor)) {
      return true;
    }

    return (izq.isContained(valor) || der.isContained(valor));
  }
}
