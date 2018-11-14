public class PlayList {
    private static Track[] rooms;
    static int[] r = new int[100];
    private static String playlist;
    int q=0;
    int p=0;

    public PlayList(String playlist) {
        this.playlist =playlist;
        this.rooms = new Track[100];
         for(p=0;p<r.length;p++){
                r[p]=q;
                q++;
            }

    }
    
    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        playlist = new String(playlist);
    }
    
    public String toString() {
        return playlist;
    }
    
    public void add(Track r) {
       String t = r.toString();
       int check =0;
        for(int w=0;w<100;w++){
               
                if(rooms[w]==null){
                    rooms[w] = r; //add to first space in array
                    check=w; //checks array for duplicates after a track is removed and leaves a gap
                       for(int k= check+1;k<100;k++){
                            if(t.contains("0 0")){
                                System.out.println("Wrong format, Please enter again."); //want the format song, artist, year, time.
                                rooms[w] = null;
                                break;
                            }
                           
                           else if(rooms[k]==r){
                                rooms[w] = null;
                                
                                System.out.println("Track: "+r+": already exists in playlist");
                                break;
                            }
                            else{
                                System.out.println("Track: "+r+": has been added to the playlist");
                                break;
                                }
                           
                        }
                       
                       break; 
                    }
               else  {
                String y = rooms[w].toString(); //convert array ref to string
                String j =  (rooms[w].getSong()+ " " + rooms[w].getArtist()).toString();
                    if(j.equals(t)|| y.equals(t)){
                        System.out.println("Track: "+r+": already exists in the playlist");
                        break;                   
                }   
            }
            
                
            }

    }

    public void remove(Track r) {
           String t = r.toString();
           
          for(int w=0;w<100;w++){
                    if(rooms[w]!=null){
                    String j =  (rooms[w].getSong()+ " " + rooms[w].getArtist());
                    if(t.contains(j)){
                        rooms[w] = null;
                        System.out.println("Track "+t+": has been removed from the playlist.");
                        break;
                        }
                    else{
                        System.out.println("Track "+t+": Does not exist in the playlist.");
                        break;
                        }
            
            }
        }
    }

       
        
    
    
    public  void playAll(boolean random){
        System.out.print("\n");
        System.out.print("PLAYALL: ");
        if (random == false){
                
            System.out.println("In Sequence.");    
                    for(int x=0;x<rooms.length;x++){
                        if(rooms[x]!=null){
                    String t = rooms[x].toString();
                    System.out.println(t);
                }
            }
            }
    
        if(random==true){
            
            System.out.println("Randomly.");
            for (int i = 0; i < r.length; i++){
                int p = i + (int) (Math.random() * ((r.length-1)-i));
                int tmp = r[i];    // swap values in array
                r[i] = r[p];
                r[p] = tmp;
            }
                
                for (int i =0;i<r.length;i++){ 
                    if(rooms[r[i]]!=null){
                    String t = rooms[r[i]].toString();
                    System.out.println(t);
            }
            }
            }
         System.out.print("\n");    
    }
    
    public  void playTrack(String artist, boolean random){
         if (random == false){
                System.out.print("\n");
                System.out.println("Tracks from: "+artist+", played in order.");
                for(int i = 0 ; i < 100 ; i++) {
                    if(rooms[i]!=null){
                        if(rooms[i].getArtist()==artist){
                            String t= rooms[i].toString();
                            System.out.println(t);
                        }
                        
                }
            }
        }
        
          if(random==true){
                System.out.print("\n");
                System.out.println("Tracks from: "+artist+", played randomly.");
                for (int i = 0; i < r.length; i++){
                    int p = i + (int) (Math.random() * ((r.length-1)-i));
                    int tmp = r[i];    // swap values in array
                    r[i] = r[p];
                    r[p] = tmp;
                }
                    
                    
                    for (int i =0;i<r.length;i++){ 
                                    if(rooms[r[i]]!=null){
                                        if(rooms[r[i]].getArtist()==artist){
                                    String t = rooms[r[i]].toString();       
                                    System.out.println(t);
                            }
                        }
                }
            
        
        }
   }

    public  void playTrack(int year, boolean random){
            if (random==false){
                System.out.print("\n");
                System.out.println("Tracks from: "+year);
                for(int i = 0 ; i < 100 ; i++) {
                    if(rooms[i]!=null){
                        if(rooms[i].getYear()==year){
                            String t= rooms[i].toString();
                            System.out.println(t);
                        }
                        
                }
            }
        }
            if(random==true){
                System.out.print("\n");
                System.out.println("Tracks from: "+year+", played randomly.");
                for (int i = 0; i < r.length; i++){
                    int p = i + (int) (Math.random() * ((r.length-1)-i));
                    int tmp = r[i];    // swap values in array
                    r[i] = r[p];
                    r[p] = tmp;
                }
                    
                    for (int i =0;i<r.length;i++){ 
                                if(rooms[r[i]]!=null){
                                    if(rooms[r[i]].getYear()==year){
                                String t = rooms[r[i]].toString();
                                System.out.println(t);
                        }
                    }
                }
        
        }
    }
    

    
    public void showList() {            
            System.out.print("\n");
            System.out.println("PlayList Name: "+playlist);
            for(int i = 0 ; i < 100 ; i++){
                int a=i+1;
                    if(rooms[i]!=null){
                    String j =  ("Track "+ a + ": "+rooms[i].getSong()+ " " + rooms[i].getArtist()+" "+rooms[i].getYear()+ " " + rooms[i].getSecs());
                    System.out.println(j);
            }
        }
    }
    
    public void print() {  //used for testing
        for(int i = 0 ; i < 100 ; i++) {
            if(rooms[i]!=null){
            
            String j =  (rooms[i].getSong()+ " " + rooms[i].getArtist());
            
            System.out.println(j);
        }
        }
    }
}