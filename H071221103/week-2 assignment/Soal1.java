class Drama{
    String judul;
    String genre;
    int jumlahepisode;

    //constructor
    public Drama(String judul, String genre,int jumlahepisode) {
        this.judul = judul;
        this.genre = genre;
        this.jumlahepisode = jumlahepisode;

    }
    //behaviour
    public void tampilakanData() {
        System.out.println("Judul: " + judul);
        System.out.println("Genre: " + genre);
        System.out.println("Jumlah episode: " + jumlahepisode + "Episode");
    }

    public String getjudul() {
        return judul;
    }
    public void setjudul(String judul) {
        this.judul = judul;
    }
    public String getgenre() {
        return genre;
    }
    public void setgenre(String genre) {
        this.genre = genre;
    }
    public int getJumlahepisode() {
        return jumlahepisode;
    }
    public void setJumlahepisode(int Jumlahepisode) {
        this.jumlahepisode = Jumlahepisode;
    }
}

class Main{
    public static void main(String[] args) {
        Drama Whoareyou = new Drama ("Who are you" , "Drama,School" ,  16);
        Whoareyou.tampilakanData();
        Whoareyou.judul = "Drama";

    }
}