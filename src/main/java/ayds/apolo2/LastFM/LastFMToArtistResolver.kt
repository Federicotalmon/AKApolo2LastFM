package ayds.apolo2.LastFM

import com.google.gson.Gson
import com.google.gson.JsonObject

private const val CONTENT = "content"
private const val URL = "url"
private const val BIO = "bio"
private const val ARTIST = "artist"

interface LastFMToArtistResolver {
    fun getCardFromExternalData(dataResponse: String?): InfoCard?
}

internal class JsonToArtistResolver: LastFMToArtistResolver {
    override fun getCardFromExternalData(dataResponse: String?): InfoCard? =
        try {
            dataResponse?.getFirstItem()?.let { item ->
                InfoCard(item.getCardDescription(), item.getCardURL(), 1, "")
            }
        } catch (e: Exception) {
            null
        }

    private fun String?.getFirstItem(): JsonObject {
        val jsonObject = Gson().fromJson(this, JsonObject::class.java)
        return jsonObject[ARTIST].asJsonObject
    }

    private fun JsonObject.getCardDescription(): String {
        val bio = this[ayds.apolo2.LastFM.BIO]?.asJsonObject
        val content = bio?.get(ayds.apolo2.LastFM.CONTENT)?.asString
        return content ?: ""
    }

    private fun JsonObject.getCardURL(): String = this[ayds.apolo2.LastFM.URL]?.asString ?: ""
}