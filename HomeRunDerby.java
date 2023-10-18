/** 
 * represents a home run derby that is an 
 * event where a batter hits a ball thrown 
 * by the pitcher and tries to hit a home run.
 */

public class HomeRunDerby {

  /* Variables */

  private Pitcher pitcher;
  private Batter batter;
  private int pitchNumber;

  /* Constructor(s) */

  /**
   *
   * Constructs a new HomeRunDerby object that represents a home run derby 
   * that is an event where a batter hits a ball thrown by the pitcher and 
   * tries to hit a home run. A pitcher and batter object must be supplied 
   * as arguments. 
   * 
   * @param Pitcher _pitcher   A pitcher object
   * @param Batter _batter   A batter object
   *
   */
  public HomeRunDerby(Pitcher _pitcher, Batter _batter) {

    this.pitcher = new Pitcher(_pitcher.getName());
    this.batter = new Batter(_batter.getName());
    this.pitchNumber = 0;
    
  }
  

  /* Methods */
  
  /** void nextPitch()
  * increments pitchNumber & moves the pitchers and batters to the next pitch/swing.
  */
  public void nextPitch(){
    pitchNumber++;
    pitcher.nextPitch();
    batter.nextSwing();
  }
  
  /** string getResults()
  gets a swing and a pitch then returns the resulting hit based off those values
  */
  public String getResults(){
    String pitch = this.pitcher.getPitch();
    String swing = this.batter.getSwing();
    if (this.pitcher.isGoodPitch() && this.batter.isGoodSwing()){
      return pitch + "\n" + swing + "\n" + "It's a hit\n";
    }
    if (this.pitcher.isGoodPitch() && !this.batter.isGoodSwing()){
      return pitch + "\n" + swing + "\n" + "It's a strike\n";
    }
    if (!this.pitcher.isGoodPitch() && this.batter.isGoodSwing()){
      return pitch + "\n" + swing + "\n" + "It's a homerun\n";
    }
    if (!this.pitcher.isGoodPitch() && !this.batter.isGoodSwing()){
      return pitch + "\n" + swing + "\n" + "It's a foul ball\n";
    }
  }
  /** void setPitchNumer()
  * sets the pitch number the game is currently on
  * @param new pitch number
  */
  public void setPitchNumber(int _pitchNumber){
    pitchNumber = _pitchNumber;
  }
  
}
