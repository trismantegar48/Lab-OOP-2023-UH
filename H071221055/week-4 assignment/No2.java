class Film {
    String title;
    int duration;
    String director, genre, synopsis;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Film() {

    }

    public Film(String title, int duration, String director, String genre, String synopsis) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public void displayInfo() {
        System.out.println("Judul Film\t\t: " + this.getTitle());
        System.out.println("Total Durasi Film\t: " + this.getDuration() + " menit");
        System.out.println("Director Film by \t: " + this.getDirector());
        System.out.println("Genre Film\t\t: " + this.getGenre());
        System.out.println("Synopsis Film\t\t: " + this.getSynopsis());
    }
}

class Main {
    public static void main(String[] args) {
        Film movie1 = new Film();
        System.out.println("---------------------------------------------------");
        movie1.setTitle("Turning Red");
        movie1.setDuration(100);
        movie1.setDirector("Domee Shi");
        movie1.setGenre("Children/Komedi");
        movie1.setSynopsis(
                "Film Turning Red bercerita tentang seorang gadis berusia 13 tahun yang bernama Mei.");

        movie1.displayInfo();
        System.out.println("---------------------------------------------------");
        Film movie2 = new Film("Encanto", 119, "Bryan Howard", "Musikal",
                "Encanto menceritakan kisah keluarga Madrigals yang luar biasa dan tinggal di Encanto.");
        System.out.println("Judul Film\t\t: " + movie2.getTitle());
        System.out.println("Total Durasi Film\t: " + movie2.getDuration() + " menit");
        System.out.println("Director Film by \t: " + movie2.getDirector());
        System.out.println("Genre Film\t\t: " + movie2.getGenre());
        System.out.println("Synopsis Film\t\t: " + movie2.getSynopsis());

        SelfUtils.displaySelfData();
    }
}

class SelfUtils {
    public static void displaySelfData() {
        System.out.println("---------------------------------------------------");
        System.out.println("\t\tArni Raihanah Rahman\t\t");
        System.out.println("\t\tH071221055\t\t");
        System.out.println("---------------------------------------------------");
    }
}