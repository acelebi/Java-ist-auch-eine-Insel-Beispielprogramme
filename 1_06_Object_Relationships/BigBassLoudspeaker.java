class Loudspeaker {
  public Loudspeaker getThis() {
    return this;
  }
}

class BigBassLoudspeaker extends Loudspeaker {
  @Override public BigBassLoudspeaker getThis() {
//  Loudspeaker getThis()
    return this;
  }
}
