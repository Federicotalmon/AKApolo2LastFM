package ayds.apolo2.LastFM

import ayds.apolo.songinfo.moredetails.model.entities.InfoCard

interface LastFMAPIArtistService {
    fun getArtist(name: String): InfoCard?
}

