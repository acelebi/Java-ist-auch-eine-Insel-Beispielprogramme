package com.tutego.insel.pattern.oberserver.generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class JokeTeller extends Observable<String> {
  
  private static final List<String> jokes = Arrays.asList(
    "Sorry, aber du siehst so aus, wie ich mich fühle.",
    "Eine Null kann ein bestehendes Problem verzehnfachen.",
    "Wer zuletzt lacht, hat es nicht eher begriffen.",
    "Wer zuletzt lacht, stirbt wenigstens fröhlich.",
    "Unsere Luft hat einen Vorteil: Man sieht, was man einatmet."
  );

  public void tellJoke() {
    Collections.shuffle( jokes );
    notifyObservers( jokes.get(0) );
  }
}