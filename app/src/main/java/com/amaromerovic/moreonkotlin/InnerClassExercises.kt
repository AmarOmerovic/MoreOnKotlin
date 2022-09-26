package com.amaromerovic.moreonkotlin

import java.util.*

fun main() {


    val myAlbums = ArrayList<MyAlbum>()

    var myAlbum = MyAlbum("Stormbringer", "Deep Purple")
    myAlbum.addSong("Stormbringer", 4.6)
    myAlbum.addSong("Love don't mean a thing", 4.22)
    myAlbum.addSong("Holy man", 4.3)
    myAlbum.addSong("Hold on", 5.6)
    myAlbum.addSong("Lady double dealer", 3.21)
    myAlbum.addSong("You can't do it right", 6.23)
    myAlbum.addSong("High ball shooter", 4.27)
    myAlbum.addSong("The gypsy", 4.2)
    myAlbum.addSong("Soldier of fortune", 3.13)
    myAlbums.add(myAlbum)

    myAlbum = MyAlbum("For those about to rock", "AC/DC")
    myAlbum.addSong("For those about to rock", 5.44)
    myAlbum.addSong("I put the finger on you", 3.25)
    myAlbum.addSong("Lets go", 3.45)
    myAlbum.addSong("Inject the venom", 3.33)
    myAlbum.addSong("Snowballed", 4.51)
    myAlbum.addSong("Evil walks", 3.45)
    myAlbum.addSong("C.O.D.", 5.25)
    myAlbum.addSong("Breaking the rules", 5.32)
    myAlbum.addSong("Night of the long knives", 5.12)
    myAlbums.add(myAlbum)

    val playList = LinkedList<MySong>()
    myAlbums[0].addToPlayList("You can't do it right", playList)
    myAlbums[0].addToPlayList("Holy man", playList)
    myAlbums[0].addToPlayList("Speed king", playList) // Does not exist

    myAlbums[0].addToPlayList(9, playList)
    myAlbums[1].addToPlayList(3, playList)
    myAlbums[1].addToPlayList(2, playList)
    myAlbums[1].addToPlayList(24, playList)

    println("==== PlayList ====")
    for (i in playList) {
        println("${i.title} ${i.duration}")
    }

    println("\n========================================================================================================\n")

    println("All albums with songs")
    for (alb in myAlbums) {
        println("\n== Album: ${alb.name} | Artist: ${alb.artist} ==")
        for (song in alb.songs.songList) {
            println("Song: ${song.title} | Duration: ${song.duration}")
        }
    }


}

class MySong(title: String, duration: Double) {
    val title: String
    val duration: Double

    init {
        this.title = title
        this.duration = duration
    }

    override fun toString(): String {
        return "Song(title='$title', duration=$duration)"
    }
}


class MyAlbum(name: String, artist: String) {
    val name: String
    val artist: String
    val songs: SongList


    init {
        this.name = name
        this.artist = artist
        songs = SongList()
    }

    fun addSong(songTitle: String, duration: Double): Boolean {
        if (songs.findSong(songTitle) == null) {
            return songs.add(MySong(songTitle, duration))
        }
        return false
    }

    fun addToPlayList(trackNumber: Int, playList: LinkedList<MySong>): Boolean {
        val index = trackNumber - 1
        if ((index >= 0) && (index < this.songs.songList.size)) {
            return playList.add(songs.songList[index])
        }
        return false
    }

    fun addToPlayList(songTitle: String, playList: LinkedList<MySong>): Boolean {
        val song = songs.findSong(songTitle)
        song?.let {
            return playList.add(it)
        }
        return false
    }

    inner class SongList {
        val songList: ArrayList<MySong> = ArrayList()

        fun add(song: MySong): Boolean {
            if (!songList.contains(song)) {
                return songList.add(song)
            }
            return false
        }

        fun findSong(title: String): MySong? {
            for (i in songList) {
                if (i.title == title) {
                    return i
                }
            }
            return null
        }

        fun findSong(trackNumber: Int): MySong? {
            val index = trackNumber - 1
            if (index >= 0 && trackNumber < songList.size) {
                return songList[index]
            }
            return null
        }

    }
}