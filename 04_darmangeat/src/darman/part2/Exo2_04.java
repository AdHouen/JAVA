
// Ecrire un programme qui lit :
// -le prix HT d’un article, le nombre d’articles 
// -le taux de TVA
// -le prix total TTC correspondant
// -Faire en sorte que des libellés apparaissent clairement

// ==> Reponse :

// Variables nb, pht, ttva, pttc en Numérique
// Début
// Ecrire "Entrez le prix hors taxes :"
// Lire pht
// Ecrire "Entrez le nombre d’articles :"
// Lire nb
// Ecrire "Entrez le taux de TVA :"
// Lire ttva
// pttc ← nb * pht * (1 + ttva)
// Ecrire "Le prix toutes taxes est : ", pttc
// Fin
// Là aussi, on pourrait squeezer une variable et une ligne en écrivant directement. :
// Ecrire "Le prix toutes taxes est : ", nb * pht * (1 + ttva)
// C'est plus rapide, plus léger en mémoire, mais un peu plus difficile à relire (et à écrire !)