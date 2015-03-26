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

	// zagotovimo, da se ne da narediti objekta iz tega; privzeti konstruktor je
	// privaten
	private ArraysKvadrat() {
	}

	/**
	 * Vrne besedilno interpretacijo tabele, podane z argumentom. Če argument ni
	 * tabela ali ni dvorazsežna 'kvadratna' tabela, mora vrniti 'null'.
	 * 
	 * @param ar
	 *            tabela, ki jo skušamo predstaviti
	 * @return String ki predstavlja to tabelo
	 * @since 7
	 * 
	 *        ref:
	 *        http://developer.classpath.org/doc/java/util/Arrays-source.html in
	 *        http://www.docjar.com/html/api/java/util/Arrays.java.html
	 */
	public static String toString(int[][] ar) {
		if (ar == null)
			return "null";

		int arl = ar.length;
		String ss = "[ ";
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				return "null"; // ena izmed vrstic ne obstaja
			if (arl != ar[i].length)
				return "nonSquare"; // ce ni kvadratna
			ss += (i == 0 ? "" : " , ") + Arrays.toString(ar[i]);
		}
		ss += " ]";
		return ss;
	}

	/**
	 * Vrne besedilno interpretacijo tabele, podane z argumentom. Če argument ni
	 * tabela ali ni dvorazsežna 'kvadratna' tabela, mora vrniti 'null'.
	 * 
	 * @param ar
	 *            tabela, ki jo skušamo predstaviti
	 * @return String ki predstavlja to tabelo
	 * @since 7
	 * 
	 *        ref:
	 *        http://developer.classpath.org/doc/java/util/Arrays-source.html in
	 *        http://www.docjar.com/html/api/java/util/Arrays.java.html
	 */
	public static String toString(char[][] ar) {
		if (ar == null)
			return "null";

		int arl = ar.length;
		String ss = "[ ";
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				return "null"; // ena izmed vrstic ne obstaja
			if (arl != ar[i].length)
				return "nonSquare"; // ce ni kvadratna
			ss += (i == 0 ? "" : " , ") + Arrays.toString(ar[i]);
		}
		ss += " ]";
		return ss;
	}

	/**
	 * Vrne besedilno interpretacijo tabele, podane z argumentom. Ce argument ni
	 * tabela ali ni dvorazsezna 'kvadratna' tabela, mora vrniti 'null'.
	 * 
	 * @param ar
	 *            tabela, ki jo skušamo predstaviti
	 * @return String ki predstavlja to tabelo
	 * @since 7
	 * 
	 *        ref:
	 *        http://developer.classpath.org/doc/java/util/Arrays-source.html in
	 *        http://www.docjar.com/html/api/java/util/Arrays.java.html
	 */
	public static String toString(long[][] ar) {

		if (ar == null)
			return "null";
		// if (ar[0].length != ar.length) return "null"; // tale ni zadosten,
		// tudi vse ostale

		int arl = ar.length;
		String ss = "[ ";
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == null)
				return "null"; // ena izmed vrstic ne obstaja
			if (arl != ar[i].length)
				return "nonSquare"; // ce ni kvadratna
			ss += (i == 0 ? "" : " , ") + Arrays.toString(ar[i]);
		}
		ss += " ]";
		return ss;
	}

	/**
	 * Izpise tabelo ar tipa int v kvadratni obliki
	 */

	public static void print(int[][] ar) {
		for (int x = 0; x < ar.length; x++) {
			System.out.print("[");
			for (int y = 0; y < ar.length; y++) {
				System.out.printf("%2d ", ar[x][y]);
			}
			System.out.println("]");
		}
	}

	/**
	 * Izpise tabelo ar tipa char v kvadratni obliki
	 */

	public static void print(char[][] ar) {
		for (int x = 0; x < ar.length; x++) {
			System.out.print("[");
			for (int y = 0; y < ar.length; y++) {
				System.out.printf("%c ", ar[x][y]);
			}
			System.out.println("]");
		}
	}

	/**
	 * Izpise tabelo ar tipa long v kvadratni obliki
	 */

	public static void print(long[][] ar) {
		for (int x = 0; x < ar.length; x++) {
			System.out.print("[");
			for (int y = 0; y < ar.length; y++) {
				System.out.printf("%2d ", ar[x][y]);
			}
			System.out.println("]");
		}
	}

	/**
	 * Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val tipa int
	 * 
	 * @param a
	 *            podana tabela, val vrednost
	 * @since 7
	 * 
	 */
	public static void fill(int[][] a, int val) {
		fill(a, 0, 0, a.length, a[0].length, val);
	}

	/**
	 * Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val tipa char
	 * 
	 * @param a
	 *            podana tabela, val vrednost
	 * @since 7
	 * 
	 */
	public static void fill(char[][] a, char val) {
		fill(a, 0, 0, a.length, a[0].length, val);
	}

	/**
	 * Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val tipa long
	 * 
	 * @param a
	 *            podana tabela, val vrednost
	 * @since 7
	 * 
	 */
	public static void fill(long[][] a, long val) {
		fill(a, 0, 0, a.length, a[0].length, val);
	}

	/**
	 * Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val v kvadratu
	 * omjenemu z stririmi koordinatami
	 * 
	 * @param a
	 *            podana tabela, fromIndexX, fromIndexY, toIndexX, toIndexY -
	 *            koordinate ogljisc kvadrata, val vrednost
	 * @since 7
	 */
	public static void fill(int[][] a, int fromIndexX, int fromIndexY,
			int toIndexX, int toIndexY, int val) {
		if (fromIndexX < 0)
			fromIndexX = 0;
		if (fromIndexY < 0)
			fromIndexY = 0;
		if (toIndexX > a.length)
			toIndexX = a.length;

		for (int x = fromIndexX; x < toIndexX; x++)
			for (int y = fromIndexY; y < toIndexY && y < a[x].length; y++)
				// prevarjanje dolzine vsake vrstice
				a[x][y] = val;
	}

	/**
	 * Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val (tipa char) v
	 * kvadratu omjenemu z stririmi koordinatami
	 * 
	 * @param a
	 *            podana tabela, fromIndexX, fromIndexY, toIndexX, toIndexY -
	 *            koordinate ogljisc kvadrata , val vrednost
	 * @since 7
	 */
	public static void fill(char[][] a, int fromIndexX, int fromIndexY,
			int toIndexX, int toIndexY, char val) {
		if (fromIndexX < 0)
			fromIndexX = 0;
		if (fromIndexY < 0)
			fromIndexY = 0;
		if (toIndexX > a.length)
			toIndexX = a.length;

		for (int x = fromIndexX; x < toIndexX; x++)
			for (int y = fromIndexY; y < toIndexY && y < a[x].length; y++)
				// prevarjanje dolzine vsake vrstice
				a[x][y] = val;
	}

	/**
	 * Napolne 'kvadratno' dvorazsezno tabelo a z vrednostmi val(tipa long) v
	 * kvadratu omjenemu z stririmi koordinatami
	 * 
	 * @param a
	 *            podana tabela, fromIndexX, fromIndexY, toIndexX, toIndexY -
	 *            koordinate ki omejujejo kvadrat, val vrednost
	 * @since 7
	 */
	public static void fill(long[][] a, int fromIndexX, int fromIndexY,
			int toIndexX, int toIndexY, long val) {
		if (fromIndexX < 0)
			fromIndexX = 0;
		if (fromIndexY < 0)
			fromIndexY = 0;
		if (toIndexX > a.length)
			toIndexX = a.length;

		for (int x = fromIndexX; x < toIndexX; x++)
			for (int y = fromIndexY; y < toIndexY && y < a[x].length; y++)
				// prevarjanje dolzine vsake vrstice
				a[x][y] = val;
	}
	
	/**
	 * Pregleda tabelo 'a',če v njej obstaja element z vrednostjo 'vrednost'
	 */
   
	public static boolean obstajaVrednost(int [][] a, int vrednost){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(vrednost==a[i][j]){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Pregleda tabelo 'a',če v njej obstaja element z vrednostjo 'vrednost'
	 */
   
	public static boolean obstajaVrednost(char [][] a, char vrednost){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(vrednost==a[i][j]){
					return true;
				}
			}
		}
		return false;
	}
		
	/**
	 * Pregleda tabelo 'a',če v njej obstaja element z vrednostjo 'vrednost'
	 */
   
	public static boolean obstajaVrednost(long [][] a, long vrednost){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(vrednost==a[i][j]){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * Vzame zgornji levi del podane tabele in jo ga shrani v novo tabelo podane
	 * velikosti, vrne to tabelo
	 * 
	 * @param t
	 *            tabela, velikost
	 * @return tabela podane velikost
	 */

	public static int[][] copyOf(int t[][], int velikost) {
		int[][] tn = new int[velikost][velikost];
		for (int i = 0; i < velikost; i++)
			for (int j = 0; j < velikost; j++)
				tn[i][j] = t[i][j];

		return tn;
	}

	/**
	 * Vzame zgornji levi del podane tabele in jo ga shrani v novo tabelo podane
	 * velikosti, vrne to tabelo
	 * 
	 * @param t
	 *            tabela, velikost
	 * @return tabela podane velikost
	 */

	public static long[][] copyOf(long t[][], int velikost) {
		long[][] tn = new long[velikost][velikost];
		for (int i = 0; i < velikost; i++)
			for (int j = 0; j < velikost; j++)
				tn[i][j] = t[i][j];

		return tn;
	}

	/**
	 * Vzame zgornji levi del podane tabele in jo ga shrani v novo tabelo podane
	 * velikosti, vrne to tabelo
	 * 
	 * @param t
	 *            tabela
	 * @param velikost
	 * @return tabela podane velikost
	 */

	public static char[][] copyOf(char t[][], int velikost) {
		char[][] tn = new char[velikost][velikost];
		for (int i = 0; i < velikost; i++)
			for (int j = 0; j < velikost; j++)
				tn[i][j] = t[i][j];

		return tn;
	}

	/**
	 * Napolni 20% tabele z vrednostjo. Ne napolni sosednjih mest.
	 * 
	 * @param tabela
	 *            in vrednost
	 */

	public static void napolni20procNaklRazmejeno(int[][] a, int vrednost) {

		int ponov = a.length * a[0].length;
		ponov = ponov / 5;
		int ponov2 = ponov;
		int x, y;
		boolean isti = false;
		boolean nezasicenost = true;
		int[][] polnost = new int[a.length][a[0].length];

		for (;;) {
			for (int i = 0; i < a[0].length; i++)
				for (int j = 0; j < a.length; j++) {
					a[j][i] = 0;
					polnost[j][i] = 0;
				}
			ponov = ponov2;
			nezasicenost = true;

			while ((0 < ponov) && nezasicenost) {
				x = (int) (Math.random() * (a.length));
				y = (int) (Math.random() * (a[0].length));

				int yz = y - 1;
				if (y == 0)
					yz = y;

				int ys = y + 1;
				if (y == a[0].length - 1)
					ys = y;

				int xz = x - 1;
				if (x == 0)
					xz = x;

				int xs = x + 1;
				if (x == a.length - 1)
					xs = x;

				isti = false;
				for (int i = yz; i <= ys; i++)
					for (int j = xz; j <= xs; j++) {
						polnost[j][i] += 1;
						if (a[j][i] == vrednost)
							isti = true;
					}

				if (isti == false) {
					a[x][y] = vrednost;
					ponov--;
				} else {
					for (int i = yz; i <= ys; i++)
						for (int j = xz; j <= xs; j++)
							polnost[j][i] -= 1;
				}

				nezasicenost = false;
				for (int i = 0; i < a[0].length; i++)
					for (int j = 0; j < a.length; j++)
						if (polnost[j][i] == 0)
							nezasicenost = true;
			}

			if (ponov == 0)
				break;
		}
	}

	/**
	 * Napolni 20% tabele z vrednostjo. Ne napolni sosednjih mest.
	 * 
	 * @param tabela
	 *            in vrednost
	 */

	public static void napolni20procNaklRazmejeno(char[][] a, char vrednost) {

		int ponov = a.length * a[0].length;
		ponov = ponov / 5;
		int ponov2 = ponov;
		int x, y;
		boolean isti = false;
		boolean nezasicenost = true;
		int[][] polnost = new int[a.length][a[0].length];

		for (;;) {
			for (int i = 0; i < a[0].length; i++)
				for (int j = 0; j < a.length; j++) {
					a[j][i] = 0;
					polnost[j][i] = 0;
				}
			ponov = ponov2;
			nezasicenost = true;

			while ((0 < ponov) && nezasicenost) {
				x = (int) (Math.random() * (a.length));
				y = (int) (Math.random() * (a[0].length));

				int yz = y - 1;
				if (y == 0)
					yz = y;

				int ys = y + 1;
				if (y == a[0].length - 1)
					ys = y;

				int xz = x - 1;
				if (x == 0)
					xz = x;

				int xs = x + 1;
				if (x == a.length - 1)
					xs = x;

				isti = false;
				for (int i = yz; i <= ys; i++)
					for (int j = xz; j <= xs; j++) {
						polnost[j][i] += 1;
						if (a[j][i] == vrednost)
							isti = true;
					}

				if (isti == false) {
					a[x][y] = vrednost;
					ponov--;
				} else {
					for (int i = yz; i <= ys; i++)
						for (int j = xz; j <= xs; j++)
							polnost[j][i] -= 1;
				}

				nezasicenost = false;
				for (int i = 0; i < a[0].length; i++)
					for (int j = 0; j < a.length; j++)
						if (polnost[j][i] == 0)
							nezasicenost = true;
			}

			if (ponov == 0)
				break;
		}
	}

	/**
	 * Napolni 20% tabele z vrednostjo. Ne napolni sosednjih mest.
	 * 
	 * @param tabela
	 *            in vrednost
	 */

	public static void napolni20procNaklRazmejeno(long[][] a, long vrednost) {

		int ponov = a.length * a[0].length;
		ponov = ponov / 5;
		int ponov2 = ponov;
		int x, y;
		boolean isti = false;
		boolean nezasicenost = true;
		int[][] polnost = new int[a.length][a[0].length];

		for (;;) {
			for (int i = 0; i < a[0].length; i++)
				for (int j = 0; j < a.length; j++) {
					a[j][i] = 0;
					polnost[j][i] = 0;
				}
			ponov = ponov2;
			nezasicenost = true;

			while ((0 < ponov) && nezasicenost) {
				x = (int) (Math.random() * (a.length));
				y = (int) (Math.random() * (a[0].length));

				int yz = y - 1;
				if (y == 0)
					yz = y;

				int ys = y + 1;
				if (y == a[0].length - 1)
					ys = y;

				int xz = x - 1;
				if (x == 0)
					xz = x;

				int xs = x + 1;
				if (x == a.length - 1)
					xs = x;

				isti = false;
				for (int i = yz; i <= ys; i++)
					for (int j = xz; j <= xs; j++) {
						polnost[j][i] += 1;
						if (a[j][i] == vrednost)
							isti = true;
					}

				if (isti == false) {
					a[x][y] = vrednost;
					ponov--;
				} else {
					for (int i = yz; i <= ys; i++)
						for (int j = xz; j <= xs; j++)
							polnost[j][i] -= 1;
				}

				nezasicenost = false;
				for (int i = 0; i < a[0].length; i++)
					for (int j = 0; j < a.length; j++)
						if (polnost[j][i] == 0)
							nezasicenost = true;
			}

			if (ponov == 0)
				break;
		}
	}

	/**
	 * metoda preveri praznost na podanem mestu
	 * 
	 * @param tabela
	 *            , x in y koordinate
	 * @return true/false
	 */

	public static boolean lahkoPostavimNa(int[][] a, int x, int y) {
		if (a[x][y] == 0)
			return true;
		else
			return false;
	}

	/**
	 * metoda preveri praznost na podanem mestu
	 * 
	 * @param tabela
	 *            , x in y koordinate
	 * @return true/false
	 */

	public static boolean lahkoPostavimNa(char[][] a, int x, int y) {
		if (a[x][y] == 0)
			return true;
		else if (a[x][y] == 32)
			return true;
		else
			return false;
	}

	/**
	 * metoda preveri praznost na podanem mestu
	 * 
	 * @param tabela
	 *            , x in y koordinate
	 * @return true/false
	 */

	public static boolean lahkoPostavimNa(long[][] a, int x, int y) {
		if (a[x][y] == 0)
			return true;
		else
			return false;
	}

	/**
	 * Postavi vrednost na dano koordinato, če lahkoPostavimNa to dovoli
	 * 
	 * @param tabela
	 *            a, v katero vstavljamo
	 * @param indeksX
	 *            in indeksY, pozicija katero postavljamo
	 * @param vrednost
	 * @since 7
	 */

	public static void postaviNa(int[][] a, int indeksX, int indeksY,
			int vrednost) {
		if (lahkoPostavimNa(a, indeksX, indeksY) == true)
			a[indeksX][indeksY] = vrednost;
	}

	/**
	 * Postavi vrednost na dano koordinato, če lahkoPostavimNa to dovoli
	 * 
	 * @param tabela
	 *            a, v katero vstavljamo
	 * @param indeksX
	 *            in indeksY, pozicija katero postavljamo
	 * @param vrednost
	 * @since 7
	 */

	public static void postaviNa(char[][] a, int indeksX, int indeksY,
			char vrednost) {
		if (lahkoPostavimNa(a, indeksX, indeksY) == true)
			a[indeksX][indeksY] = vrednost;
	}

	/**
	 * Postavi vrednost na dano koordinato, če lahkoPostavimNa to dovoli
	 * 
	 * @param tabela
	 *            a, v katero vstavljamo
	 * @param indeksX
	 *            in indeksY, pozicija katero postavljamo
	 * @param vrednost
	 * @since 7
	 */

	public static void postaviNa(long[][] a, int indeksX, int indeksY,
			long vrednost) {
		if (lahkoPostavimNa(a, indeksX, indeksY) == true)
			a[indeksX][indeksY] = vrednost;
	}

	/**
	 * V podani tabeli opravi binarno iskanje po izbrani vrstici in vrne mesto
	 * iskane vrednosti. Ce je vrednosti vec, vrne pozicijo prve
	 * Pogoj za pravilo izvajanje je naraščujoče razvrščena vrstica
	 * 
	 * @param a
	 *            podana tabela vrednosti
	 * @param s
	 *            iskana vrednost
	 * @param v
	 *            podana vrstica
	 * @return mesto iskane vrednosti
	 *			Ce iskane vrednsti v tabeli ni, funkcija vrne -1  
	 */

	public static int binarySearchVrstica(int[][] a, int v, int s) {
		int sMeja = 0; // vkljucno
		int zMeja = a.length; // izkljucno
		int kje = -1;

		while (sMeja + 1 < zMeja) {
			int mesto = (sMeja + zMeja) / 2;
			if (s < a[v][mesto]) {
				zMeja = mesto;
			} else {
				sMeja = mesto;
			}
			if (a[v][sMeja] == s) {
				kje = sMeja;
			}
		}

		if(kje>0) {
			// da je vrednost prva
			while (kje > 0 && a[v][kje] == s)
				kje--;
			kje++;
		}

		return kje;
	}

	/**
	 * V podani tabeli opravi binarno iskanje po izbranem stolpcu in vrne mesto
	 * iskane vrednosti. Ce je vrednosti vec, vrne pozicijo prve
	 * Pogoj za pravilo izvajanje je naraščujoče razvrščen stolpec
	 * 
	 * @param a
	 *            podana tabela vrednosti
	 * @param s
	 *            iskana vrednost
	 * @param st
	 *            podan stolpec
	 * @return mesto iskane vrednosti
	 *			Ce iskane vrednsti v tabeli ni, funkcija vrne -1  
	 */
	public static int binarySearchStolpec(int[][] a, int st, int s) {
		int sMeja = 0; // vkljucno
		int zMeja = a.length; // izkljucno
		int kje = -1;

		while (sMeja + 1 < zMeja) {
			int mesto = (sMeja + zMeja) / 2;
			if (s < a[mesto][st]) {
				zMeja = mesto;
			} else {
				sMeja = mesto;
			}
			if (a[sMeja][st] == s) {
				kje = sMeja;
			}
		}

		if(kje>0) {
			// da je vrednost prva
			while (kje > 0 && a[kje][st] == s)
				kje--;
			kje++;
		}

		return kje;
	}

 	/**
	 * V podani tabeli opravi binarno iskanje po celotni tabeli
	 * Ce je vrednosti vec, vrne pozicijo tiste, s najmajšima kordinatama
	 * Pogoj za pravilo izvajanje je naraščujoče razvrščen stolpec
	 * @param a podana tabela z vrednostmi
	 * @param s iskana vrednost
	 * @return stevilo, katerega modulos s dolzino vrstice predstavlja pozicjo iskane vrednosti v vrstici, 
	 *			celostevilski kolicnik pri takem deljenu pa index vrstice, v kateri se ta vrednost nahaja. 
	 *			Ce iskane vrednsti v tabeli ni, funkcija vrne -1  
	 */
	
	public static int binarySearch(int [][]a, int s){
		int kjeX = -1;
		int kjeY = 0;

		for(; kjeY<a.length && kjeX == -1; kjeY++){
			kjeX = binarySearchVrstica(a, kjeY, s);
			System.out.println(kjeX);
		}

		if(kjeX == -1)
			return -1;

		return kjeX + (kjeY-1)*a[0].length;
	}

	/**
	 * Primerjava dveh vrstic
	 */

	public static boolean equalsVrstica(int[][] t1, int v1, int[][] t2, int v2) {
		if (t1[v1].length != t2[v2].length)
			return false;

		boolean b = true;
		for (int i = 0; i < t1[v1].length && b; i++)
			b = b && t1[v1][i] == t2[v2][i];

		return b;
	}

	/**
	 * Primerjava dveh vrstic
	 */

	public static boolean equalsVrstica(char[][] t1, int v1, char[][] t2, int v2) {
		if (t1[v1].length != t2[v2].length)
			return false;

		boolean b = true;
		for (int i = 0; i < t1[v1].length && b; i++)
			b = b && t1[v1][i] == t2[v2][i];

		return b;
	}

	/**
	 * Primerjava dveh vrstic
	 */

	public static boolean equalsVrstica(long[][] t1, int v1, long[][] t2, int v2) {
		if (t1[v1].length != t2[v2].length)
			return false;

		boolean b = true;
		for (int i = 0; i < t1[v1].length && b; i++)
			b = b && t1[v1][i] == t2[v2][i];

		return b;
	}

	/**
	 * Primerjava dveh stolpcev
	 */

	public static boolean equalsStolpec(int[][] t1, int s1, int[][] t2, int s2) {
		if (t1.length != t2.length)
			return false;

		boolean b = true;
		for (int i = 0; i < t1.length && b; i++)
			b = b && t1[i][s1] == t2[i][s2];

		return b;
	}
	
	/**
	 * preveri, ali je leva diagonala dolzine N vsebuje vse vrednosti od 1..N
	 * @params a
	 * 			tabela, ki jo preverjamo
	 */
	
	static boolean diagLevaPolna(int [][]a){
		int []stevila=new int [a.length];
		for(int i=0;i<a.length;i++){
			if(a[i][i]<a.length && a[i][i]>0) {
				stevila[(a[i][i])-1]++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(stevila[i]!=1){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * preveri, ali je leva diagonala dolzine N vsebuje vse vrednosti od 1..N
	 * @params a
	 * 			tabela, ki jo preverjamo
	 */
	
	static boolean diagLevaPolna(char [][]a){
		int []crke=new int [a.length];
		for(int i=0;i<a.length;i++){
			int c = (int) (Character.toUpperCase(a[i][i])) - 64;
			if(c<a.length && c>0) {
				crke[c-1]++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(crke[i]!=1){
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * preveri, ali je leva diagonala dolzine N vsebuje vse vrednosti od 1..N
	 * @params a
	 * 			tabela, ki jo preverjamo
	 */
	
	static boolean diagLevaPolna(long [][]a){
		int []stevila=new int [a.length];
		for(int i=0;i<a.length;i++){
			if(a[i][i]<a.length && a[i][i]>0) {
				stevila[(int)(a[i][i])-1]++;
			}
		}
		
		for(int i=0;i<a.length;i++){
			if(stevila[i]!=1){
				return false;
			}
		}
		
		return true;
	}
	
}
