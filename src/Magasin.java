import java.util.ArrayList;

public class Magasin {

    private ArrayList<CD> cds;

    public ArrayList<CD> triParTitre() {

        ArrayList<CD> copie = new ArrayList<>(this.cds);

        ArrayList<CD> resultat = new ArrayList<>();

        while (!copie.isEmpty()) {

            int indiceMin = indiceMinimumTitre(copie);

            resultat.add(copie.get(indiceMin));

            copie.remove(indiceMin);
        }

        return resultat;
    }

    private int indiceMinimumTitre(ArrayList<CD> liste) {

        int indiceMin = 0;

        for (int i = 1; i < liste.size(); i++) {

            if (liste.get(i).comparerTitre(
                    liste.get(indiceMin)) < 0) {

                indiceMin = i;
            }
        }

        return indiceMin;
    }

    public ArrayList<CD> triParArtiste() {

        ArrayList<CD> copie = new ArrayList<>(this.cds);

        ArrayList<CD> resultat = new ArrayList<>();

        while (!copie.isEmpty()) {

            int indiceMin =
                    indiceMinimumArtiste(copie);

            resultat.add(copie.get(indiceMin));

            copie.remove(indiceMin);
        }

        return resultat;
    }

    private int indiceMinimumArtiste(
            ArrayList<CD> liste) {

        int indiceMin = 0;

        for (int i = 1; i < liste.size(); i++) {

            if (liste.get(i).comparerArtiste(
                    liste.get(indiceMin)) < 0) {

                indiceMin = i;
            }
        }

        return indiceMin;
    }
}