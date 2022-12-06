package exercice2;

class Main {
  public static void main(String[] args) {
    TripletHeterogene<String, Integer, String> TripletHeterogene = new TripletHeterogene<>("premier", 12, "troisieme");
    System.out.println(TripletHeterogene.getPremier());
    System.out.println(TripletHeterogene.getSecond());
    System.out.println(TripletHeterogene.getTroisieme());

    System.out.println(TripletHeterogene.affiche());
  }
}