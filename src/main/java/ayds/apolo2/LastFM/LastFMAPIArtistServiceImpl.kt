package ayds.apolo2.LastFM

import retrofit2.Response

internal class LastFMAPIArtistServiceImpl(
        private val lastFMAPI: LastFMAPI,
        private val lastFMToArtistResolver: LastFMToArtistResolver
) : LastFMAPIArtistService {
    override fun getArtist(name: String): InfoCard? {
        val callResponse = getInfoArtistFromService(name)
        return lastFMToArtistResolver.getCardFromExternalData(callResponse.body())
    }

    private fun getInfoArtistFromService(artistName: String): Response<String> =
        lastFMAPI.getArtistInfo(artistName).execute()
}