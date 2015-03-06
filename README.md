ArraysKvadrat
=============

Utility class with methods to operate on arrays (sized NxN)

# Navodila
  - Da prispevate k skupni kodi:
    - naredite svoj fork (svoj podvojeni repository)
    - ga spreminjajte
    - posljite pull request (da vase spremembe dodamo v skupni repo)
  - Metode naj bodo splosne
  - Naj bodo 'fool proof' (naj ne vracajo napak, tudi ce so podatki neustrezni)
  - Narejene naj bodo za int,char in long (vsako posebaj) 
  - Vse metode naj imajo pred sabo komentar, v katerem je:
    - Razlaga, kaj metoda pocne
    - `@params` , ki pove, katere pomenijo podani parametri
    - ce metoda vraca vrednost: `@return`, ki pove, kaj je vraca
    - `@since`, ki se nanasa na verzijjo jave, za katero je metoda napisana. To naj bo vedno 7
  - primer lahko vidite v ArraysKavdrat.java (toString metoda)

# Razdelitev nalog
##Osnovne
  - **jovi**    - `fillRandom(int [][]a, int min, int max)` - fill z nakjljucnimi vrednostmi iz podanega ranga 
  - **savelli** - `equals(int [][]t1, int z1, int [][]t2, int z2)` - ali ima tabela t1 enako vrstico z1 kot tabela t2 vrstico z1, isto s stolpci
  - **MaticML** - `sort(int [][]a, int z)` - sort izbrane vrstice z v tabeli a
  - **Bobby** 	- `binarySearch(int [][]a, int s)` 	- na izbrani vrstici, na izbranem stolpcu, na celotni tabeli po posameznih vrsticah
    
## Potapljanje ladic
  - *Sosed elementa: so vsi elementi okoli izbranega elementa.Sosedov je največ 8, najmanj 5.*
  - **ziga** `int prestejVrednost(int[][] a, int vrednost);`  - Koliko vrednosti 'vrednost' se nahaja v tabeli 'a'?
  - **patrik** `bool obstajaVrednost(int[][] a, int vrednost);` - Ali v tabeli 'a' obstaja vsaj en element z vrednostjo 'vrednost'?
  - **trobec** `void napolniSosede(int[][] a, int indeksX, int indeksY, int vrednost);`   - Napolni vse sosede elementa (indeksX,indeksY) z vrednostjo 'vrednost'
  - **trobec** `void napolniSosede(int[][] a, int indeksX, int indeksY);`  - Napolni vse sosede elementa (indeksX,indeksY) z vrednostjo elementa (uporabi kar prejsnjo metodo)
  - **habjanic** `bool primerjajVrednost(int[][] a, int indeksX, int indeksY,int vrednost);`  - Preveri, če je vrednost danega elementa enaka 'vrednost'
  - **vercek** `void napolni20procNaklRazmejeno(int[][] a, int vrednost);` - Napolni 20% elementov tabele 'a' z vrednostmi 'vrednost'. Pri teh so elementi izbrani naključno, in se med seboj ne smejo dotikati (element ne sme imeti soseda z isto vrednostjo

## Krizci in krozci
  - *Naloge predpostavljajo pojem praznosti; prazen= če je 0, znak s kodo 32(presledek), oz je vrednost, ki je manjša od |10-8|, odvisno od tipa elementov tabele*
  - `boolean lahkoPostavimNa(int[][] a, int indeksX, int indeksY);` Ugotovi, ali lahko zapišemo vrednostna dano korrdinato? Postavljamo lahko, če je 'prazna+.
  - `void postaviNa(int[][] a, int indeksX, int indeksY, int vrednost);` Postavi vrednost na dano koordinato, če lahkoPostavimNa to dovoli
  - `boolean aliJihJeNvVrstici(int[][] a, int indeksX, int indeksY, int n, int vrednost);` Ugotovi, če je elementov z dano vrednostjo v vrstici, dani s koordinato vsaj n
  - `boolean aliJihJeNvStolpcu(int[][] a, int indeksX, int indeksY, int n, int vrednost);` Ugotovi, če je elementov z dano vrednostjo v stolpcu, danem s koordinato vsaj n
  - `boolean aliJeDelZapNVrstice(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v vrstici elementa
  - `boolean aliJeDelZapNStolpca(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v stolpcu elementa
  - `boolean aliJeDelZapNLeveD(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v levi diagonali tabele 'a’ (leva: od levo zgoraj, do desno spodaj
  - `boolean aliJeDelZapNDesneD(int[][] a, int indX, int indY, int n);` Ugotovi, ali je element, podan s koordinato, del zaporedja enakih elementov dolžine vsaj n v desni diagonali tabele 'a’ (leva: od levo zgoraj, do desno spodaj

## Sudoku
  - *'Polnost' je v naslednji nalogi opredeljena kot: element dolžine N vsebuje vse vrednosti od 1..N. Začetna vrednost pri tabelah z elementi tipa char je 'a' oz 'A'. Metode so definirane zgolj za celoštevilske tipa in char.*
  - `boolean vrsticaPolna(int[][] a, int indV);` Ali je stolpec indS poln?
  - `boolean stolpecPoln(int[][] a, int indS);` Ali je leva diagonala tabele polna?
  - `boolean diagLevaPolna(int[][] a);` Ali je desna diagonala polna?
  - `boolean diagDesnaPolna(int[][] a);` Ali je kvadrat z izhodiščem v (indX,indY) razsežnosti nXn poln ?
  - `boolean kvadratNxNpoln(int[][] a, int indX, int indY, int n);` Ali vrstica s številko indV polna?

