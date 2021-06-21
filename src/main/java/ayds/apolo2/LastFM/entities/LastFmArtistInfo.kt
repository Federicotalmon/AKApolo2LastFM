package ayds.apolo2.LastFM.entities

interface LastFmArtistInfo {
    val description: String
    val infoUrl: String
    val source: Int
    val sourceLogoUrl: String
}

data class InfoArtist(
    override val description: String,
    override val infoUrl: String,
    override val source: Int,
    override val sourceLogoUrl: String,
): LastFmArtistInfo
