/**
* Batter class simulates a baseball batter that can swing a bat.
*
* @author  Justin RIley
* @version 1.0
* @since   2023-09-20
*/
public class Batter {
  private String name;
  private int pitchCounter;

  /**
  *  Constructs a new Batter object that represents a baseball 
  *  batter that can swing a bat. The batter's name must be 
  *  supplied as an argument. The object's pitchCounter is 
  *  initially set to zero.
  *
  *  @param String name   Name of the batter. Can be one-word or multi-word name.
  */
  public Batter(String name){
    this.name = name;
    this.pitchCounter = 0;
  }
  
    /**
  *  The pitch number must be supplied as an argument.
  *
  *  @param int _pitchNumber   Integer number of pitches thrown.
  */
  public void setPitchNumber(int _pitchNumber){
    this.pitchCounter = _pitchNumber;
  }

  /**
  * The getSwing method looks at the player's name and the 
  * current pitch number. If that number letter in the player's 
  * name is a vowel, then they hit a homerun. If that number 
  * letter in the name is a consonsant, then they miss the ball.
  * For example, "Ian" would hit a homerun, hit a homerun, then
  * miss. Finally, the pitchCounter is incremented.
  *
  * @return String   a String that says if they hit a home run or missed the ball.
  */
  public String getSwing(){
    String result = "Strike! Swing and a miss by " + this.name;
    if(isVowel(this.name, this.pitchCounter){ 
      result = "BOOM! " + this.name + " hit a home run!";
    }
    //this.pitchCounter++;
    return result;
  }
/**
*the isGoodSwing methid uses the isVowel function with the batter
*name and pitchCounter and returns either true or false depending
*on the name and number.
*
*@return boolean   a true or false value that that decides the swing 
*
*/
  public boolean isGoodSwing(){
    return isVowel(this.name,this.pitchCounter);
  }
  /**
  * The static isVowel method takes a String word and an int num.
  * If the letter at index location num is a vowel, returns true
  * otherwise return false.
  * @param String     a String word that might contain vowels
  * @param int        an int num that is the index location to look at
  * @return boolean   If the letter at index location num is a vowel, returns true. Otherwise, false.
  */
  private static boolean isVowel(String word, int num){
    String vowels = "aeiou";
    String letter = word.substring(num % word.length(),num % word.length() + 1);
    return vowels.indexOf(letter.toLowerCase()) >= 0;
  }

  /**
  * The getName method returns the name of the batter as a String.
  * @return String   The name of the batter.
  */
  public String getName(){
    return name;
  }
  /**
  * The nextPitch method incraeses the pitch counter
  
  */
  public void nextPitch(){
    this.pitchCounter++;

  }
}
