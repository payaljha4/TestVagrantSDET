package test.vagrant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
    @Test(description = "It verifies recently played songs")
    public void verifyGetRecentlyPlayedSong(){
        UserRecords user1 = new UserRecords(3);
        user1.playSong("S1");
        user1.playSong("S2");
        Assert.assertEquals(user1.getRecentlyPlayedSong(),"S2","Incorrect Recently Played Song");
    }
    @Test(description = "It verifies recently played s when capacity exceeded")
    public void verifyGetRecentlyPlayedSongWhenCapacityExceeded(){
        UserRecords user1 = new UserRecords(3);
        user1.playSong("S1");
        user1.playSong("S2");
        user1.playSong("S3");
        user1.playSong("S4");
        Assert.assertEquals(user1.getRecentlyPlayedSong(),"S4","Incorrect Recently Played Song");
    }
    @Test(description = "It verifies recently played song when playlist is empty")
    public void verifyGetRecentlyPlayedSongWhenPlaylistIsEmpty(){
        UserRecords user1 = new UserRecords(3);
        Assert.assertEquals(user1.getRecentlyPlayedSong(),"Playlist is Empty","Invalid Response");
    }
    @Test(description = "It verifies number of song in playlist")
    public void verifyNumberOfSongInPlaylist(){
        UserRecords user1 = new UserRecords(3);
        user1.playSong("S1");
        user1.playSong("S2");
        Assert.assertEquals(user1.getNumberOfSongInPlaylist(),2,"Incorrect Number Of Song In Playlist");
    }
    @Test(description = "It verifies number of song in playlist when capacity exceeded")
    public void verifyNumberOfSongInPlaylistWhenCapacityExceeded(){
        UserRecords user1 = new UserRecords(3);
        user1.playSong("S1");
        user1.playSong("S2");
        user1.playSong("S3");
        user1.playSong("S4");
        Assert.assertEquals(user1.getNumberOfSongInPlaylist(),3,"Incorrect Number Of Song In Playlist");
    }
    @Test(description = "It verifies number of song in playlist when playlist is empty")
    public void verifyNumberOfSongInPlaylistWhenPlaylistIsEmpty(){
        UserRecords user1 = new UserRecords(3);
        Assert.assertEquals(user1.getNumberOfSongInPlaylist(),0,"Incorrect Number Of Song In Playlist");
    }
}
