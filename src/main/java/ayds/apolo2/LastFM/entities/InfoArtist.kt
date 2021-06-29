package ayds.apolo2.LastFM.entities

data class InfoArtist(
    val description: String,
    val infoUrl: String,
    val source: Int,
    val sourceLogoUrl: String = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Lastfm_logo.svg/320px-Lastfm_logo.svg.png",
)
