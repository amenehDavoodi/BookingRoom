package com.example.bookingmeetingroom.di


import com.example.bookingmeetingroom.common.Constants
import com.example.bookingmeetingroom.data.remote.ApiMeeting
import com.example.bookingmeetingroom.data.repository.MeetingRepositoryImpl
import com.example.bookingmeetingroom.domain.repository.MeetingRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMeetingApi(): ApiMeeting {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiMeeting::class.java)
    }

    @Provides
    @Singleton
    fun provideMeetingRepository(api: ApiMeeting): MeetingRepository {
        return MeetingRepositoryImpl(api)
    }
}