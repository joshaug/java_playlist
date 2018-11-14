//James O'Shaughnessy 15187497 CS5111 2015 Project

public class PlayListDriver {
   public static void main(String[] args) {
      Track one = new Track("One", "U2", 1991, 156 );
      Track two = new Track("One", "U2");
      Track three = new Track("bones", "Radiohead", 1994, 214);
      Track four = new Track("Living on a prayer", "Bon Jovi", 1987, 176);
      Track five = new Track("Living ");
      Track six = new Track("Acrobat", "U2", 1991, 196 );
      Track seven = new Track("Cruel", "U2", 1991, 213 );
      Track eight = new Track("planet telex", "Radiohead", 1994, 245);
      PlayList  Bob = new PlayList("Rock");
      
      
      Bob.add(one);
      Bob.add(two);
      Bob.add(six);
      Bob.add(four);
      Bob.add(five);
      Bob.add(three);
      Bob.add(seven);
      Bob.playall(true);
      
      Bob.remove(two);
      Bob.remove(two); 
      
      Bob.add(one);
      Bob.add(eight);
      Bob.playTrack("U2", false);
      Bob.playTrack("U2", true);
      Bob.playTrack(1991, true);
      
    
      
      
      Bob.showList();
      Bob.playall(true);
      Bob.playall(false);
      //Bob.print();

   }
} 