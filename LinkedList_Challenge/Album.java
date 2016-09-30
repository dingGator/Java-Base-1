
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ki
 */
public class Album {
    private String albumName;
    private String albumArtist;
    private ArrayList<Song> songList = new ArrayList<Song>();

    public Album(String albumName, String albumArtist) {
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        this.songList = new ArrayList<Song>();
    }
    
    public boolean addSong(String songTitle, double songDuration){
        if (findSong(songTitle)==null){
// so song cannot be added twice on the song list
            this.songList.add(new Song(songTitle, songDuration));
            return true;
        }
        return false;
    }

private Song findSong(String songTitle){
    for (Song checkedSong: this.songList){
        // same as doing for loop using i and going thru with i++
       if(checkedSong.getSongTitle().equals(songTitle)){
        return checkedSong;
}
}
return null;
}
public boolean addToPlayList(int trackNumber,
        List<Song>playList){
    int index = trackNumber -1;
    if((index>0)&&(index<= this.songList.size())){ //if song is on track
        playList.add(this.songList.get(index));
        return true;
    }
    System.out.println("This album does not have a track "+ trackNumber);
    return false;
}      
public boolean addToPlayList(String songTitle,
        List<Song>playList){
    Song checkedSong = findSong(songTitle);
    if (checkedSong != null){
        playList.add(checkedSong);
        return true;
    }
    System.out.println("The song: "+ 
            songTitle+ " : is not in this album");
    return false;
}
     

   
}
