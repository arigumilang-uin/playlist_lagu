package com.mycompany.playlistlagu;
public class Playlistlagu {
    public static void main(String[] args) {
        class Song {
    String title;
    Song next;    

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head; 
    private Song tail;

    public Playlist() {
        this.head = null;
        this.tail = null;
    }

    public void addSong(String title) {
        Song newSong = new Song(title); 
        if (head == null) { 
            head = newSong;
            tail = newSong;
        } else {
            tail.next = newSong; //
            tail = newSong;  
        }
    }

    public void displayPlaylist() {
        Song currentSong = head;
        if (currentSong == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        
        System.out.println("Playlist:");
        while (currentSong != null) { 
            System.out.println("- " + currentSong.title); 
            currentSong = currentSong.next; 
        }
    }

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.addSong("Song 3");
        playlist.displayPlaylist();
    }
}

    }
}
