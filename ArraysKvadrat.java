
/**
 * class ArraysKvadrat 
 * 
 * utility class za 'kvadratne' dvorazsežne tabele
 * 
 * @author G3ab
 * @version 0.1/201415
 */

import java.util.Arrays;

public class ArraysKvadrat {
	
	// zagotovimo, da se ne da narediti objekta iz tega; privzeti konstruktor je privaten
	public ArraysKvadrat() {
	}
	  
	/**
	 *  Vrne besedilno interpretacijo tabele, podane z argumentom. Če argument ni tabela ali
	 *  ni dvorazsežna 'kvadratna' tabela, mora vrniti 'null'.
	 *  @param ar tabela, ki jo skušamo predstaviti
	 *  @return String ki predstavlja to tabelo
	 *  @since 7
	 *  
	 *  ref: http://developer.classpath.org/doc/java/util/Arrays-source.html in http://www.docjar.com/html/api/java/util/Arrays.java.html
	 */  
	public static String toString(int[][] ar){     
		if (ar == null) return "null";
		 
		int arl = ar.length; 
		String ss="[ ";
		for(int i=0; i<ar.length; i++) {
			if(ar[i] == null) return "null";		// ena izmed vrstic ne obstaja
			if(arl != ar[i].length) return "nonSquare";	// ce ni kvadratna
			ss += (i==0?"":" , ")+ Arrays.toString(ar[i]);
		}
		ss+=" ]";
		return ss;
	}

	/**
	 *  Vrne besedilno interpretacijo tabele, podane z argumentom. Če argument ni tabela ali
	 *  ni dvorazsežna 'kvadratna' tabela, mora vrniti 'null'.
	 *  @param ar tabela, ki jo skušamo predstaviti
	 *  @return String ki predstavlja to tabelo
	 *  @since 7
	 *  
	 *  ref: http://developer.classpath.org/doc/java/util/Arrays-source.html in http://www.docjar.com/html/api/java/util/Arrays.java.html
	 */  
	public static String toString(char[][] ar){
		if (ar == null) return "null";
		 
		int arl = ar.length; 
		String ss="[ ";
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == null) return "null";		// ena izmed vrstic ne obstaja
			if(arl != ar[i].length) return "nonSquare";	// ce ni kvadratna
			ss += (i==0? "":" , ") + Arrays.toString(ar[i]);
		}
		ss+=" ]";
		return ss;
	}
	
	/**
	 *  Vrne besedilno interpretacijo tabele, podane z argumentom. Ce argument ni tabela ali
	 *  ni dvorazsezna 'kvadratna' tabela, mora vrniti 'null'.
	 *  @param ar tabela, ki jo skušamo predstaviti
	 *  @return String ki predstavlja to tabelo
	 *  @since 7
	 *  
	 *  ref: http://developer.classpath.org/doc/java/util/Arrays-source.html in http://www.docjar.com/html/api/java/util/Arrays.java.html
	 */  
	public static String toString(long[][] ar){
		 
		if (ar == null) return "null";
		//if (ar[0].length != ar.length) return "null"; // tale ni zadosten, tudi vse ostale

		int arl = ar.length; 
		String ss="[ ";
		for(int i=0;i<ar.length;i++){
			if(ar[i] == null) return "null";		// ena izmed vrstic ne obstaja
			if(arl != ar[i].length) return "nonSquare";	// ce ni kvadratna
			ss += (i==0? "":" , ")+ Arrays.toString(ar[i]);
		}
		ss+=" ]";
		return ss;
	}

	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val
	 *  @param tabela a, vrednost val
	 *  @since 7
	 *   	
	 */
	public static void fill(int[][] a, int val) {
		fill(a,0,0,a.length,a[0].length,val);
	}

	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val v kvadratu omjenemu z stririmi koordinatami
	 *  @param tabela a, koordinate, vrednost val
	 *  @since 7
	 */
	public static void fill(int[][] a, int fromIndexX, int fromIndexY, int toIndexX, int toIndexY, int val) {
		if(fromIndexX<0)
			fromIndexX=0;
		if(fromIndexY<0)
			fromIndexY=0;
		if(toIndexX>a.length)
			toIndexX=a.length;

		for(int x=fromIndexX; x<toIndexX;x++)
			for(int y=fromIndexY;y<toIndexY && y<a[x].length;y++)	// prevarjanje dolzine vsake vrstice	
				a[x][y]=val;
	}
}




