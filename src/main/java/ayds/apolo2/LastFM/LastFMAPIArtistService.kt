package ayds.apolo2.LastFM.entities

import ayds.apolo2.LastFM.entities.InfoArtist

interface LastFMAPIArtistService {
    fun getArtist(name: String): InfoArtist?
}

