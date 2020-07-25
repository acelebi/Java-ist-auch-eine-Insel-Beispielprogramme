interface Likeable {
  void act();
}

interface Assertive {
  void act();
}

public class Politician implements Likeable, Assertive {
  @Override public void act() {
    // Implementation
  }
}
