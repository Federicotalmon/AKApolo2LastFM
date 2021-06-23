package ayds.apolo2.lastFM

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object LastFMAPIArtistModule {
    private const val URL_AUDIO_SCROBBLER = "https://ws.audioscrobbler.com/2.0/"

    private val lastFMAPIRetrofit = Retrofit.Builder()
        .baseUrl(URL_AUDIO_SCROBBLER)
        .addConverterFactory(ScalarsConverterFactory.create())
        .build()
    private val lastFMAPI = lastFMAPIRetrofit.create(LastFMAPI::class.java)
    private val lastFMToArtistResolver = JsonToArtistResolver()

    val lastFMAPIArtistService: LastFMAPIArtistService = LastFMAPIArtistServiceImpl(
        lastFMAPI,
        lastFMToArtistResolver
    )
}