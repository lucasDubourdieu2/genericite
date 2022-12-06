package exercice1;

class Main {
  public static void main(String[] args) {
    Triplet<String> triplet = new Triplet<>("premier", "second", "troisieme");
    System.out.println(triplet.getPremier());
    System.out.println(triplet.getSecond());
    System.out.println(triplet.getTroisieme());

    System.out.println(triplet.affiche());
  }
}