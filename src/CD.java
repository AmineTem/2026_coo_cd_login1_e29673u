public class CD {

    private String titre;
    private String artiste;

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public int comparerTitre(CD autreCD) {

        return this.getTitre().compareToIgnoreCase(
                autreCD.getTitre()
        );
    }

    public int comparerArtiste(CD autreCD) {

        return this.getArtiste().compareToIgnoreCase(
                autreCD.getArtiste()
        );
    }
}