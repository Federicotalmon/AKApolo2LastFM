package ayds.apolo2.LastFM

enum class CardSource {
    LASTFM
}

interface Card {
    val description: String
    val infoUrl: String
    val source: CardSource
    val sourceLogoUrl: String
    var isLocallyStoraged: Boolean
}

data class InfoCard(
    override val description: String,
    override val infoUrl: String,
    override val source: CardSource,
    override val sourceLogoUrl: String,
    override var isLocallyStoraged: Boolean = false
): Card

object EmptyCard: Card {
    override val description: String = ""
    override val infoUrl: String = ""
    override val source: CardSource = CardSource.LASTFM
    override val sourceLogoUrl: String = ""
    override var isLocallyStoraged: Boolean = false
}