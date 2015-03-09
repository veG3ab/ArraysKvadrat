
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
	private ArraysKvadrat() {
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
	 *	Izpise tabelo ar tipa int v kvadratni obliki
	 */

	public static void print(int [][] ar) {
		for(int x=0;x<ar.length;x++) {
			System.out.print("[");
			for(int y=0;y<ar.length;y++) {
				System.out.printf("%2d ",ar[x][y]);
			}
			System.out.println("]");
		}
	}
	
	public static void random(int [][]t, int min, int max) {
		for(int y=0;t.length>y;y++){
			for(int x=0;t[x].length>x ;x++){
			t[y][x] = (int)(Math.random()*max)+min; 	
			}	
		}
	}

	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val tipa int
	 *  @param a podana tabela, val vrednost
	 *  @since 7
	 *   	
	 */
	public static void fill(int[][] a, int val) {
		fill(a,0,0,a.length,a[0].length,val);
	}
	
	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val tipa char
	 *  @param a podana tabela, val vrednost
	 *  @since 7
	 *   	
	 */
	public static void fill(char[][] a, char val) {
		fill(a,0,0,a.length,a[0].length,val);
	}
	
	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val tipa long
	 *  @param a podana tabela, val vrednost
	 *  @since 7
	 *   	
	 */
	public static void fill(long[][] a, long val) {
		fill(a,0,0,a.length,a[0].length,val);
	}

	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val v kvadratu omjenemu z stririmi koordinatami
	 *  @param a podana tabela, fromIndexX, fromIndexY, toIndexX, toIndexY - koordinate ogljisc kvadrata, val vrednost
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
	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val (tipa char) v kvadratu omjenemu z stririmi koordinatami
	 *  @param a podana tabela, fromIndexX, fromIndexY, toIndexX, toIndexY - koordinate ogljisc kvadrata , val vrednost
	 *  @since 7
	 */
	public static void fill(char[][] a, int fromIndexX, int fromIndexY, int toIndexX, int toIndexY, char val) {
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
	
	/**
	 *	Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val(tipa long) v kvadratu omjenemu z stririmi koordinatami
	 *  @param a podana tabela, fromIndexX, fromIndexY, toIndexX, toIndexY - koordinate ki omejujejo kvadrat, val vrednost
	 *  @since 7
	 */
	public static void fill(long[][] a, int fromIndexX, int fromIndexY, int toIndexX, int toIndexY, long val) {
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
	
	/**
	 * Vzame zgornji levi del podane tabele in jo ga shrani v novo tabelo podane velikosti, vrne to tabelo
	 * @param t tabela, velikost
	 * @return tabela podane velikost
	 */
	 
	public static int[][] copyOf(int t[][], int velikost){
		int[][] tn = new int[velikost][velikost];
		for(int i=0;i<velikost;i++)
			for(int j=0;j<velikost;j++)
				tn[i][j] = t[i][j];
		
		return tn;
	}

	/**
	 * Vzame zgornji levi del podane tabele in jo ga shrani v novo tabelo podane velikosti, vrne to tabelo
	 * @param t tabela, velikost
	 * @return tabela podane velikost
	 */
	
	public static long[][] copyOf(long t[][], int velikost){
		long[][] tn = new long[velikost][velikost];
		for(int i=0;i<velikost;i++)
			for(int j=0;j<velikost;j++)
				tn[i][j] = t[i][j];
		
		return tn;
	}

	/**
	 * Vzame zgornji levi del podane tabele in jo ga shrani v novo tabelo podane velikosti, vrne to tabelo
	 * @param t tabela
	 * @param velikost 
	 * @return tabela podane velikost
	 */
	
	public static char[][] copyOf(char t[][], int velikost){
		char[][] tn = new char[velikost][velikost];
		for(int i=0;i<velikost;i++)
			for(int j=0;j<velikost;j++)
				tn[i][j] = t[i][j];
		
		return tn;
	}
}




