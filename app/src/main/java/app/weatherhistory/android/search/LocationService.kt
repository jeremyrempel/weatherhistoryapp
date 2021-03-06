package app.weatherhistory.android.search

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationService {
    @GET("locations")
    fun find(): Flowable<List<Location>>

    @GET("locations")
    fun findByName(@Query("name") name: String): Flowable<List<Location>>
}