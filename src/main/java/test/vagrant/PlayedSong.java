package test.vagrant;

public class PlayedSong {
    String songName;
    PlayedSong next;    //It will store the address of next node
    PlayedSong(String songName){
        this.songName=songName;
        this.next=null;
    }
}