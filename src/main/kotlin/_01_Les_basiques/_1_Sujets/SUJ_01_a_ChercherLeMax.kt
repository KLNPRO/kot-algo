package _01_Les_basiques._1_Sujets

import _10_Demos_et_tests.DataTestChercherLeMax
import _10_Demos_et_tests.demoEnLot
import _10_Demos_et_tests.testerEnLot


/* -----------------------
    Fonction à développer
  ------------------------*/

/**
 * Retourne la valeur et l'indice de la 1ʳᵉ occurrence de la valeur maximale de
 * la liste d'entiers donnée en argument.
 * @param list Liste non mutable contenant des entiers et/ou réels.
 * @return Une liste contenant la valeur maxi suivi de son indice.
 */
fun firstMax(list: List<Int>): List<Int> {
    var iMax = 0
    for ((index, value) in list.withIndex()) {
        println("the element at $index is $value")
        //Si la valeur que on est entrain de parcourir est plus grande que la valeur presente a imax dans la liste
    if(value>list[iMax]){
        //alors imax prend la valeur de l'indice
        iMax=index
    }
    }
    return  listOf(list[iMax], iMax)

}

/* -------------------
    Données de test
   --------------------*/

val dataTest01_01a = DataTestChercherLeMax(::firstMax, listOf<Int>(5, -10, 7, -20, 3, 2, 5, 7, 2, 7), listOf(7, 2))
val dataTest02_01a = DataTestChercherLeMax(::firstMax, listOf<Int>(-5, -10, -2, -100, -2, -3), listOf(-2, 2))
val listDataTests_01a = listOf(dataTest01_01a, dataTest02_01a)


/* -------------------------------
     Exécution des tests & démos
   --------------------------------*/

fun main() {
    testerEnLot(listDataTests_01a)
    demoEnLot(listDataTests_01a)
}



