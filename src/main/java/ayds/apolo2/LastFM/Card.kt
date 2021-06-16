package ayds.apolo2.LastFM

interface Card {
    val description: String
    val infoUrl: String
    val source: Int
    val sourceLogoUrl: String
    var isLocallyStoraged: Boolean
}

data class InfoCard(
    override val description: String,
    override val infoUrl: String,
    override val source: Int,
    override val sourceLogoUrl: String,
    override var isLocallyStoraged: Boolean = false
): Card

object EmptyCard: Card {
    override val description: String = ""
    override val infoUrl: String = ""
    override val source: Int = 0
    override val sourceLogoUrl: String = ""
    override var isLocallyStoraged: Boolean = false
}