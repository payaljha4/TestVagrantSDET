# TestVagrantSDET #

### What is this repository for? ###
This repository contains a mavn project which manages the song playlist of the users. It uses Linkedlist Data Structure for maintaing the Playlist.


It contains four java classes -
* PlayedSong.java -> It is used to create the structure of the node for the Linkedlist
* UserRecords.java -> It contains all the basic utilities like PlaySong, GetRecentlyPlayedSong
* UnitTest.java -> It contains the testNG testcases for verifying util methods of the UserRecords.java
* Test.java -> This is a general class which contains main method, where we can run any method

It also contains a XML file named UnitTest.xml under test.vagrant.testNg Package, which runs UnitTest.java class.


### Steps To Setup Project ###
* Prerequisites 
    + Java8 or above
    + Maven
    + Any IDE
   
* Clone the project using ```git clone https://github.com/payaljha4/TestVagrantSDET.git```
* Build Maven project using - ```mvn clean install```

### For running Project ###
* For running TestCases directly run XML file - UnitTest.xml
* Use main method of the Test.java class for running any utilities

Please reach out to me at payaljha.24200@gmail.com for any issue/doubt/suggestions
