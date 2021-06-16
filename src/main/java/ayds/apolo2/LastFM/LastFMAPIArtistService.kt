package ayds.apolo2.LastFM


interface LastFMAPIArtistService {
    fun getArtist(name: String): InfoCard?
}

