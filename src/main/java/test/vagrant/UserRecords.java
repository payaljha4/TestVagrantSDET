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
    public void showPlayList(){
        PlayedSong temp=head;
        while(temp!=null){
            System.out.print(temp.songName+" ");
            temp=temp.next;
        }
        System.out.println("\n----------------------------");
    }
    public String getRecentlyPlayedSong(){
        return head.songName;
    }
    public int getNumberOfSongInPlaylist(){
        return numberOfSongInPlaylist;
    }
}