package test.vagrant;

public class UserRecords {
    PlayedSong head;
    int maxCapacity;
    int numberOfSongInPlaylist;
    UserRecords(int maxCapacity){
        head=null;
        this.maxCapacity=maxCapacity;
        numberOfSongInPlaylist=0;
    }
    //This Method adds song in the Playlist and if capacity exceeded it removes the least played song
    public void playSong(String SongName){
        PlayedSong ps = new PlayedSong(SongName);
        ps.next=head;
        head=ps;
        numberOfSongInPlaylist++;
        if(numberOfSongInPlaylist>maxCapacity){
            PlayedSong temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            numberOfSongInPlaylist--;
        }
    }
    //It prints all songs of the playlist from recently played to the least played order
    public void showPlayList(){
        PlayedSong temp=head;
        while(temp!=null){
            System.out.print(temp.songName+" ");
            temp=temp.next;
        }
        System.out.println("\n-------------End of the Playlist---------------");
    }
    //It returns the name of recently played songs
    public String getRecentlyPlayedSong(){
        if(head==null){
            return "Playlist is Empty";
        }
        return head.songName;
    }
    //It returns the number of song in playlist
    public int getNumberOfSongInPlaylist(){

        return numberOfSongInPlaylist;
    }
}