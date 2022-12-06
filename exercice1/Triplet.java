package exercice1;

public class Triplet <T> {

  private T premier;
  private T second;
  private T troisieme;
  

  public Triplet(T premier, T second, T troisieme) {
    this.premier = premier;
    this.second = second;
    this.troisieme = troisieme;
    
  }

  public T getPremier() {
    return premier;
  }
  
   public T getSecond() {
    return second;
  }
  
   public T getTroisieme() {
    return troisieme;
  }

  public String affiche() {
    return premier + " " + second + " " + troisieme;
  }
}