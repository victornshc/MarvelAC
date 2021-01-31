package com.example.marvelac

import android.app.Application
import androidx.room.Room
import com.example.marvelac.model.database.MarvelDatabase
import com.facebook.stetho.Stetho

class MarvelApp: Application() {

    lateinit var db : MarvelDatabase
        private set


    override fun onCreate() {
        db = Room.databaseBuilder(
            this,
            MarvelDatabase::class.java,
            "marvel-db"
        ).build()
        Stetho.initializeWithDefaults(this);
        super.onCreate()
    }
}