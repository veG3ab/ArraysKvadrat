# ArraysKvadrat

Utility class with methods to operate on arrays (sized NxN)

# Razdelitev nalog
 - Osnovne
  - vercek - copyOf
  -  fill				(za char in long)
  -  fill from-to 	(za char in long)
  -  equals   		- dodali bi še npr. ali ima tabela t1 enako vrstico Z kot tabela t2 vrstico K, stolpci
  -  sort 			- sort izbrane vrstice
  -  binarySearch 	- na izbrani vrstici, na izbranem stolpcu, na celotni tabeli po posameznih vrsticah
  -  static int prestejVrednost(int[][] a, int vrednost);
  
-  Potapljanje ladic
  -  obstajaVrednost(int[][] a, int vrednost);
  -  napolniSosede(int[][] a, int indeksX, int indeksY);
  -  napolniSosede(int[][] a, int indeksX, int indeksY , int vrednost);
  -  aliJeVrednost(int[][] a, int indeksX, int indeksY,int vrednost);
  -  napolni20procNaklRazmejeno(int[][] a, int vrednost);

- Krizci in krozci
 - lahkoPostavimNa(int[][] a, int indeksX, int indeksY);
 - postaviNa(int[][] a, int indeksX, int indeksY, int vrednost);
 - aliJihJeNvVrstici(int[][] a, int indeksX, int indeksY, int n, int vrednost);
 - aliJihJeNvStolpcu(int[][] a, int indeksX, int indeksY, int n, int vrednost);
 - aliJeDelZapNVrstice(int[][] a, int indX, int indY, int n);
 - aliJeDelZapNStolpca(int[][] a, int indX, int indY, int n);
 - aliJeDelZapNLeveD(int[][] a, int indX, int indY, int n);
 - aliJeDelZapNDesneD(int[][] a, int indX, int indY, int n);

- Sudoku
 - vrsticaPolna(int[][] a, int indV);
 - stolpecPoln(int[][] a, int indS);
 - diagLevaPolna(int[][] a);
 - diagDesnaPolna(int[][] a);
 - kvadratNxNpoln(int[][] a, int indX, int indY, int n);

 
