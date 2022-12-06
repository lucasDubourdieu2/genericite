package exercice2;

public class TripletHeterogene<S, U, V> {
  private S premier;
  private U second;
  private V troisieme;

  public TripletHeterogene(S premier, U second, V troisieme) {
    this.premier = premier;
    this.second = second;
    this.troisieme = troisieme;
    
  }

  public S getPremier() {
    return premier;
  }

  public U getSecond() {
    return second;
  }

  public V getTroisieme() {
    return troisieme;
  }

  public String affiche() {
    return premier + " " + second + " " + troisieme;
  }
}