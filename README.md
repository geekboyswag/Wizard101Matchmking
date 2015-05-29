# Wizard101Matchmking
Wizard101 Matchmaking Proof Of Concept

Version 1.0 Alpha
Right now you can enter your stats, and generate a select number of opponents with completely random stats into the queue system. It will then tell you how many of the opponents are in your queue.

How it works (downloadable build): There are 13 queues coded into the main queue. The 13 are based on level. So when you input your level it will put you into the corresponding level queue. Then when opponents are randomly generated with completely random level, critical, and rank, they are put into the correct queue. At the moment all the program can do is tell you how many of the opponents are in your queue, resulting in the most fair level difference possible at 9 levels (i.e you are 40 and opponent is 49).

How it will work (Not yet coded): After you and opponents have been placed in a queue, the computer will randomly select an opponent from your queue and compare the other stats (critical, and rank)  If they are within a reasonable difference and present no unfair advantage, you will be matched and you will experience a fair match. If it decides one stat is unfair, it will trash the match and never compare you to that opponent again (unless you rejoin the queue, then it will refresh and start over) After it trashes a match, it will then keep comparing, and try to match you. If it can't you will be moved out of the level queue and into the rank queue. It will sort ranks based on a certain increment. It will repeat the same process as level, and if it can't find a match, it will put you in the critical queue. It will do the exact same thing, but since more people have critical this is a much broader search and where the most unfair matches will occur. You will definintely be matched here.

In order to make matchmaking faster it will only compare so many opponents, or run out of time before moving you on. That will guarantee the smoothest experience possible.


How to use:

First things first. If you don't have Java you will need to download and install it at: https://java.com/en/

Download this: http://www.mediafire.com/download/daov2hd07hbp164/Matchmaking.jar
All that is, is the compiled version of the code you can see above, it just let's you run it on your computer

Once you have downloaded it, make a new folder on your desktop, and place the Matchmaking.jar you just downloaded into that folder.

Now we are going to create the script to run it

If you are using Windows doanload this batch file - http://www.mediafire.com/download/fwc9mjkgi3vnt70/Start.bat

When it's done place it in the same folder on your desktop with Matchmaking.jar in it. After you do that, you are done. Simply double click Start.bat and follow the instructions to use the program.

If you are using Mac it's a little more complicated since I'm not the best with Mac. Open Terminal (Launchpad > others > terminal) now type in "cd " (note the space after cd) DO NOT PRESS ENTER! Drag the folder on your desktop into the terminal. It should now look like this

Last login: Sun May 17 18:47:56 on ttys001
name-2:~ name$ cd /Users/name/Desktop/untitled\ folder\ 3 

Now press enter. After you do that type in the following: "java -jar Matchmaking.jar" and press enter.
Then follow the instructions to correctly use the program.

Please report any problems here - https://github.com/justin393/Wizard101Matchmking/issues

This will help me organize issues and get through them efficiently
