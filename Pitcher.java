/**
* Pitcher class simulates a baseball pitcher that can throw pitches.
*
* @author  Justin RIley
* @version 1.0
* @since   2023-09-20
*/
public class Pitcher {
  private String name;
  private int pitchCounter;

  /**
  *  Constructs a new Pitcher object that represents a baseball 
  *  pitcher that can throw baseballs. The pitcher's name must be 
  *  supplied as an argument. The object's pitchCounter is 
  *  initially set to zero.
  *
  *  @param String name   Name of the pitcher. Can be one-word or multi-word name.
  */
  public Pitcher(String name){
    this.name = name;
    this.pitchCounter = 0;
  }

  /**
  *  String getName() gets the name of the pitcher
  *  @return String name of pitcher
  */
  public String getName(){
    return name;
  }
  
  /**
  * The getPitch method looks at the player's name and the
  * current pitch number. If that number letter in the player's 
  * name is a vowel, then they throw a great pitch. If that 
  * number letter in the name is a consenent, then they throw a 
  * bad pitch. For example, "Eli" would throw great pitch, bad 
  * pitch, then great pitch. Finally, the pitchCounter is 
  * incremented.
  *
  * @return String   a String that says if they threw a bad pitch or great pitch.
  */
  public String getPitch(){
    String result = "Oof! " + this.name + " throws a bad pitch";
    if(isVowel(this.name, this.pitchCounter)){ 
      result = this.name + " throws a GREAT pitch!";
    }
    this.pitchCounter++;
    return result;
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
}
