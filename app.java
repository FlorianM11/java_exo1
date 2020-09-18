package exercice1;

import java.util.Arrays;

class app {
    
    public static void main(String[] args) {
        
        String[] dico = {"bonjour", "salut", "coucou", "bonjour", "enchanté", "bonjour"};
        String[] newDico = new String[dico.length];

        //On trie le tableau
        Arrays.sort(dico);

        //On supprime les doublons
        for(int i = 0; i < dico.length; i++){

            for(int j = 0; j < newDico.length; j++){
                if (dico[i] != newDico[j]){
                    newDico[i] = dico[i];
                } else {
                    break;
                }
            }
        }

        //On affiche le résultat
        System.out.println("Dico : " + Arrays.toString(newDico));
    }
}
