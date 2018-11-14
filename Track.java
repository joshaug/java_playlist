public class Track {
    private String song;
    private String artist;
    private int year;
    private int secs;

    public Track(String song)     {
        this.song = song;
    }
    
    public Track(String song, String artist)     {
        this.song = song;
        this.artist = artist;
    }

    
    public Track(String song, String artist, int year,int secs) {
        this.song= song;
        this.artist = artist;
        this.year = year;
        this.secs = secs;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = new String(song);
    }
    
        public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = new String(artist);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
        public int getSecs() {
        return secs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }
    
    public String toString() {
        return this.song+" "+this.artist+" "+ this.year+" "+this.secs;
    }
}