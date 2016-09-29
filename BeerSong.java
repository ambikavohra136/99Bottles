/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author ambikavohra
 */
public class BeerSong {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Ninety_Nine_Bottles_of_Beer();
    }
    
    
  public static void Ninety_Nine_Bottles_of_Beer()
  {
  	int start = 99;
      
      for (int i = start; i >= 1; i--)
      {
          if (i==1)
          {
              System.out.println("" +i+ " bottles of beer on the wall, " +i+ " bottles of beer" +"\n" +
"take one down, pass it around, no more bottles of beer on the wall.");
              break;
          }
          System.out.println("" +i+ " bottles of beer on the wall, " +i+ " bottles of beer" +"\n" +
"take one down, pass it around, " +(i-1)+ " bottles of beer on the wall.");
      }
      
  }
    
}
