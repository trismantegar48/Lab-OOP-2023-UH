class Kdrama {
    // Atribut
    private String judul; 
    private String genre;
    private int episode;

    // Constructor
    public Kdrama(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
        this.episode = 26;
    }

    // Constructor
    public Kdrama(String judul, String genre, int episode) {
        this.judul = judul;
        this.genre = genre;
        this.episode = episode;
    }
    
    // Behavior
    public void detailInfo() {
        System.out.println("Judul " + this.judul);
    }

    // Behavior
    public void takeGenre() {
        System.out.println(" Genre " + this.genre);
    }

    // Behavior
    public void detailInfo(int episode) {
        System.out.println(" Episode " + this.episode);
        System.out.println("========================================\n");
    }


    public String getJudul() {
        return judul;
    }

    public String getGenre() {
        return genre;
    }

    public int getEpisode() {
        return episode;
    }

public static void main(String[] args) {
    Kdrama p1 = new Kdrama("School", "School", 26);
    Kdrama p2 = new Kdrama("Theking", "Fantasy", 24);

    System.out.println("Judul " + p1.getJudul() + " dengan " + "Genre" + p1.getGenre() + " dengan " + "Episode" + p1.getEpisode());
    System.out.println("Judul " + p2.getJudul() + " dengan " + "Genre" + p2.getGenre() + " dengan " + "Episode" + p2.getEpisode());
    System.out.println("========================================");

    System.out.println("Judul " + p1.getJudul() + " dengan " + "Genre" + p1.getGenre() + " dengan " + "Episode" + p1.getEpisode());
    System.out.println("Judul " + p2.getJudul() + " dengan " + "Genre" + p2.getGenre() + " dengan " + "Episode" + p2.getEpisode());
    
    }
}
