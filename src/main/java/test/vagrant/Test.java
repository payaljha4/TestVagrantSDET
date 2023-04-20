package test.vagrant;

public class Test {
    public static void main(String args[]){
        UserRecords newUser = new UserRecords(3);
        newUser.playSong("S1");
        newUser.playSong("S2");
        newUser.showPlayList();
        System.out.println(newUser.getRecentlyPlayedSong());
        System.out.println(newUser.getNumberOfSongInPlaylist());
    }
}