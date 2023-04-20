package test.vagrant;

public class PlayedSong {
    String songName;
    PlayedSong next;
    PlayedSong(String songName){
        this.songName=songName;
        this.next=null;
    }
}