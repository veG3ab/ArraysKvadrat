
/**
 * class ArraysKvadrat 
 * 
 * utility class za 'kvadratne' dvorazsežne tabele
 * 
 * @author G3ab
 * @version 0.1/201415
 */

import java.util.Arrays;

public class ArraysKvadrat
{
    
    // zagotovimo, da se ne da narediti objekta iz tega; privzeti konstruktor je privaten
      private ArraysKvadrat(){
      }
    
    /**
     *  Vrne besedilno interpretacijo tabele, podane z argumentom. Če argument ni tabela ali
     *  ni dvorazsežna 'kvadratna' tabela, mora vrniti 'null'.
     *  @param ar tabela, ki jo skušamo predstaviti
     *  @return String ki predstavlja to tabelo
     *  @since 7
     *  
     *  ref: http://developer.classpath.org/doc/java/util/Arrays-source.html
     */  
    public static String toString(int[][] ar){
         
        String ss="[ ";
        for(int i=0;i<ar.length;i++)
          ss += (i==0)? Arrays.toString(ar[i]):" , "+ Arrays.toString(ar[i]);
        ss+=" ]";
        return ss;
    }
    
    
}




