package com.example.uapv1602471.tp2;

public class Livres {

    private Livre[] livres;

    public Livres() {
        Livre livre1 = new Livre("Guerre et paix", "L.Tolstoï");
        Livre livre2 = new Livre("Fondation", "I.Asimov");
        Livre livre3 = new Livre("Histoire de Babar, le petit éléphant", "J. de Brunhoff");
        Livre livre4 = new Livre("Le Grand Pouvoir de Chinke!", "J.Van Hamme et G.Rosinski");
        Livre livre5 = new Livre("Monster", "N.Ursawa");
        Livre livre6 = new Livre("V pour Vendetta", "A.Moore et D.Lloyd ");
        Livre livre7 = new Livre("Le comte de Monte-Cristo", "A.Durres");
        Livre livre8 = new Livre("Astérix chez les Bretons", "R.Goscinny et A.Uderzo");
        Livre livre9 = new Livre("Du côté de chez Swan", "M.Proust");

        Livre[] livres;
        livres = new Livre[9];

        livres[0] = livre1;
        livres[1] = livre2;
        livres[2] = livre3;
        livres[3] = livre4;
        livres[4] = livre5;
        livres[5] = livre6;
        livres[6] = livre7;
        livres[7] = livre8;
        livres[8] = livre9;
    }

    public Livres(Livre[] livres) {
        this.livres = livres;
    }

    public Livre[] getLivres() {
        return livres;
    }

    public void ajoutLivre(Livre a) {
        Livre[] livres;
        //livres = new livre[this.livres.length + 1];

        for (int i = 0; i < this.livres.length; i++) {
            //livres[i] = this.livres[i];
        }
        //livres[livres.length] = a;
        //this.livres = livres;
    }

    public void supprimerLivre(Livre a) {
        Livre[] livres;
        //livres = new livre[this.livres.length - 1];
        for (int i = 0; i < this.livres.length; i++) {
            if (this.livres[i] != a) {
                //livres[i] = this.livres[i];
            }
        }
        //this.livres = livres;
    }
}
