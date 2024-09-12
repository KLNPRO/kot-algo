package _02_Les_classiques._1_Sujets

import _10_Demos_et_tests.*

/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * La fonction prend un entier et une liste d'entiers.
 * Elle retourne l'indice de la valeur grâce à un algorithme
 * de recherche dichotomique.
 * Si la valeur est absente, la fonction retournera -1.
 * @param val Valeur (Int) recherchée.
 * @param list Liste d'entiers (Int)
 * @return L'indice de la valeur recherchée, vaut -1 en absence de la valeur.
 */
fun rechercheDichotomique(cible: Int, list: List<Int>): Int {
    for (i in list.indices)
        if(list [i]== cible)
            return i 


    // Absence de la valeur dans la liste :
    return -1
}
/*
déclarations
début, fin, val, mil, N : Entiers
t : Tableau [0..N] d'entiers classé
trouvé : Booléen

//initialisation
N = taille(t)-1
début ← 0
fin ← N
trouvé ← faux
Saisir val

//Boucle de recherche
// La condition début inférieur ou égal à fin permet d'éviter de faire
// une boucle infinie si 'val' n'existe pas dans le tableau.
Tant que trouvé != vrai et début <= fin:
mil ← partie entière((début + fin)/2)
si t[mil] == val:
        trouvé ← vrai
sinon:
si val > t[mil]:
début ← mil+1
sinon:
fin ← mil-1
//Affichage du résultat
Si trouvé == vrai:
Afficher "La valeur ", val , " est au rang ", mil
Sinon:
Afficher "La valeur ", val , " n'est pas dans le tableau"*/

/* -------------------
    Données de test
   --------------------*/

val dataTest01_02a = DataTestIntListInt(::rechercheDichotomique, 5, listOf(2, 3, 5, 7, 8, 11), 2)
val dataTest02_02a = DataTestIntListInt(::rechercheDichotomique, 3, listOf(3, 7, 8, 9, 13, 15), 0)
val dataTest03_02a = DataTestIntListInt(::rechercheDichotomique, 18, listOf(3, 7, 8, 9, 15, 18), 5)
val dataTest04_02a = DataTestIntListInt(::rechercheDichotomique, 10, listOf(3, 7, 8, 9, 15, 18), -1)
val listDataTests_02a = listOf(dataTest01_02a , dataTest02_02a, dataTest03_02a, dataTest04_02a)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_02a)
    demoEnLot(listDataTests_02a)
}