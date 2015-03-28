**Pull request bo sprejet samo, če bo koda pred oddajo pregledana, stestirana in prevedena.**

ArraysKvadrat
=============

Utility class with methods to operate on arrays (sized NxN)

# Navodila
  - Da prispevate k skupni kodi:
    - naredite svoj fork (svoj podvojeni repository)
    - ga spreminjajte
    - posljite pull request (da vase spremembe dodamo v skupni repo)
  - Metode naj bodo splosne
  - Naj bodo 'fool proof' (naj ne rvacajo napak, tudi ce so podatki neustrezni)
  - Narejene naj bodo za int,char in long (vsako posebaj) 
  - Vse metode naj imajo pred sabo komentar, v katerem je:
    - Razlaga, kaj metoda pocne
    - `@params` , ki pove, katere pomenijo podani parametri
    - ce metoda vraca vrednost: `@return`, ki pove, kaj je vraca
    - `@since`, ki se nanasa na verzijjo jave, za katero je metoda napisana. To naj bo vedno 7
    - `@author`, doda avtorja, če se ta hoče identificirati
    - `@version`, doda verzijo, npr. 1.0
  - primer lahko vidite v ArraysKavdrat.java (toString metoda)

# Razdelitev nalog
## Osnovne
  - **vse postorjeno**

## Potapljanje ladic
  - **vse postorjeno**

## Krizci in krozci
  - *Naloge predpostavljajo pojem praznosti; prazen= če je 0, znak s kodo 32(presledek), oz je vrednost, ki je manjša od |10-8|, odvisno od tipa elementov tabele*
  - **simkeeeee** `boolean aliJihJeNvVrstici(int[][] a, int indeksX, int indeksY, int n, int vrednost);` Ugotovi, če je elementov z dano vrednostjo v vrstici, dani s koordinato vsaj n
  - **MonkeyNooldle** `boolean aliJihJeNvStolpcu(int[][] a, int indeksX, int indeksY, int n, int vrednost);` Ugotovi, če je elementov z dano vrednostjo v stolpcu, danem s koordinato vsaj n
  - **JureKomac** `boolean aliJeDelZapNVrstice(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v vrstici elementa
  - **Rous** `boolean aliJeDelZapNStolpca(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v stolpcu elementa
  - **Martinovič** `boolean aliJeDelZapNLeveD(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v levi diagonali tabele 'a’ (leva: od levo zgoraj, do desno spodaj
  - **Markovič** `boolean aliJeDelZapNDesneD(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v desni diagonali tabele 'a’ (leva: od levo zgoraj, do desno spodaj

## Sudoku
  - *'Polnost' je v naslednji nalogi opredeljena kot: element dolžine N vsebuje vse vrednosti od 1..N. Začetna vrednost pri tabelah z elementi tipa char je 'a' oz 'A'. Metode so definirane zgolj za celoštevilske tipa in char.* 
  - **Nitazi** `boolean vrsticaPolna(int[][] a, int indV);` Ali vrstica s številko indV polna?
  - **emir1122** `boolean stolpecPoln(int[][] a, int indS);` Ali je stolpec indS poln?
  - **Kosir** `boolean diagDesnaPolna(int[][] a);` Ali je desna diagonala polna?
  - **Weiss** `boolean kvadratNxNpoln(int[][] a, int indX, int indY, int n);` Ali je kvadrat z izhodiščem v (indX,indY) razsežnosti nXn poln ?

# Pripombe
  - `napolni20procNaklRazmejeno` deluje in je zanesliva (se ne more zaciklati), vendar je na velikih tabelah (50x50) pocasna. 

# Opombe

Za nekatere dijake iz G3A je zmanjkalo nalog. Ti so Klemen, Lovro, Dominik in Rijavec. Od teh se pričakuje, da bodo kodo, ki jo bodo spisali zgoraj navedeni dijaki **poskušali** optimizirati in izboljšati.
