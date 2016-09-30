
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static List<Album>albums = new ArrayList<Album>();
    public static void main(String[] args) {
            System.out.println("*************");
     Album album = new Album("George Strait 50 Greatest Hits", "George Strait");
  album.addSong("Lead On",5.4);
   album.addSong("Blue Clear Sky",5.6);
   album.addSong("Carried Away",5.3);
   album.addSong("One Night At a Time",5.6);
   album.addSong("Round About Way",2.3);
   album.addSong("The Man in Love With You",5.9);
  album.addSong("Heartland",5.9);
  album.addSong("Easy Come, Easy Go",5.9);
  album.addSong("Check Yes or No",5.9);
 
   albums.add(album);
   album = new Album("Dan Hill Greatest Hits", "Dan Hill");
   album.addSong("All I See Is Your Face",4.4);
   album.addSong("Once Upon A Time",4.6);
   album.addSong("Can't We Try",4.3);
   album.addSong("Love of My Life",4.6);
   album.addSong("My Love For You",2.3);
   album.addSong("Unborn Heart",4.9);
   album.addSong("Sometime When We Touch",3.9);
   album.addSong("The Healing Power of Love",2.9);
   album.addSong("Wistful Thinking",4.9);
  
   albums.add(album);
   List<Song> playList = new ArrayList<Song>();
   // add songs from album 1
   albums.get(0).addToPlayList("Heartland", playList);
   albums.get(0).addToPlayList("The Man in Love With You", playList);
   albums.get(0).addToPlayList(9, playList);
   
   //add songs from album 2 
   albums.get(1).addToPlayList(8, playList);
   albums.get(1).addToPlayList(3, playList);
   albums.get(1).addToPlayList(2, playList);
   albums.get(1).addToPlayList(24, playList);
   play(playList);
    }
    private static void play(List<Song>playList){
     Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        
        ListIterator<Song>listIterator = playList.listIterator();
    if(playList.size()==0){
        System.out.println("No song in playList");  
        return;
    }else{
         System.out.println("Now playing: "+ listIterator.next().toString());
         listIterator.next().toString();
           printMenu();
    }
    

      
   while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
            case 0:
                System.out.println("PlayList Complete"); 
                quit =true;
                break;
            case 1:
                if(!forward){
                    if (listIterator.hasNext()){
                        listIterator.next();
                    }
                    forward =true;
                }
                if (listIterator.hasNext()){
                    System.out.println("Now Playing song " +listIterator.next());
                    listIterator.next().toString();
                }else{
                    System.out.println("Reached the end of the PlayList");
                    forward = false;    
                }
                    break;
            case 2:
                  if(forward){
                    if (listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                        forward =false;
                  }
                if(listIterator.hasPrevious()){
                    System.out.println("Now Playing song: " 
                       +listIterator.previous().toString());
                }else{
                    System.out.println("We are at the start of the PlayList");
                    forward =true;    
                }
                    break;
                        
            case 3:
                if(forward){
                 if (listIterator.hasPrevious()){
                      System.out.println("Now Replaying song: " +
                        listIterator.previous().toString());
                      forward = false;
                    }else{
                  System.out.println("We are at the Start of the list ");
                 }
                }else{
                  if (listIterator.hasNext()){
                      System.out.println("Now Replaying song: " +
                        listIterator.next().toString());
                      forward=true;
                  }else{
                       System.out.println("We reached the end of the list ");
                             }
                }
                break;
            case 4:
                printList(playList);
                break;
            case 5:
                 
                printMenu();
                break;
            case 6:
                if(playList.size()>0){
                    listIterator.remove();
                    if(listIterator.hasNext()){
                      System.out.println("Now playing song: " +
                        listIterator.next());
                    }else
                        if(listIterator.hasPrevious()){
                      System.out.println("Now playing song: " +
                        listIterator.previous());
                            
                        }
                    } break;
                }

            
            }   
            
   }

   
   // TODO code application logic here
    
     private static void printList(List<Song> playList){
        Iterator<Song> iterator=playList.iterator();
        System.out.println("===== PlayList Songs ===========");
        while(iterator.hasNext()){
            //i.hasNext() ask if there is a next entry
            // i.next() actually move to next entry of LinkedList
            // same as for loop: i++ in the ArrayList display
            System.out.println("Song: "+ iterator.next());
        }
        System.out.println("================");
          printMenu();
     }
 private static void printMenu(){
             System.out.println("Available actions:\n press");
             System.out.println("0- To quit\n"+
                     "1 - go to next song\n"+
                     "2 - go to previous song\n"+
                     "3 - replay current song\n"+
                     "4 - list Songs on the Playlist\n"+
                     "5 - print menu options\n"+
                     "6 - delete current song from Playlist");
                    

    
}

}
