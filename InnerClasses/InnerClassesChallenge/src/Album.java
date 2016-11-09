
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
    //   private ArrayList<Song> songList = new ArrayList<Song>();
    //   private ArrayList<SongList>songs = new ArrayList<SongList>();
    private SongList songs;

    public Album(String albumName, String albumArtist) {
        this.albumName = albumName;
        this.albumArtist = albumArtist;
        //  this.songList = new ArrayList<Song>();
        this.songs = new SongList();

    }

    public boolean addSong(String songTitle, double songDuration) {
        return this.songs.add(new Song(songTitle, songDuration));
    }

    public boolean addToPlayList(int trackNumber,
            LinkedList<Song> playList) {
        //  int index = trackNumber -1;
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle,
            LinkedList<Song> playList) {

        Song checkedSong = songs.findSong(songTitle);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("The song: "
                + songTitle + " : is not in this album");
        return false;
    }

    private class SongList {

        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String songTitle) {
            for (Song checkedSong : this.songs) {
                // same as doing for loop using i and going thru with i++
                if (checkedSong.getSongTitle().equals(songTitle)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
