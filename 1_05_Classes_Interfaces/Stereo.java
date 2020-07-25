public class Stereo {

  static         final int STANDARD = 1000;
  /*non-static*/ final int standard = 1000;
  public int watt;
  
  public Stereo() {
    // this( standard );
    // Führt auskommentiert zum Compilerfehler:
    // Cannot refer to an instance field standard while explicitly invoking a constructor

    this( STANDARD );
  }

  public Stereo( int watt ) {
  	this.watt = watt;
  }
}