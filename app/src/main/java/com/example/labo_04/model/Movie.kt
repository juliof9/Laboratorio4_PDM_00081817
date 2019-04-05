package com.example.labo_04.model

import android.os.Parcel
import android.os.Parcelable

class Movie (
    val Title:String = "N/A",
    val Year:String = "N/A",
    val Released:String = "N/A",
    val Runtime:String = "N/A",
    val Genre:String = "N/A",
    val Director:String = "N/A",
    val Actors:String = "N/A",
    val Plot:String = "N/A",
    val Languaje:String = "N/A",
    val indbRating:String = "N/A",
    val Poster:String = "N/A"
) : Parcelable{
    constructor(parcel: Parcel) : this(
        Title = parcel.readString(),
        Year = parcel.readString(),
        Released= parcel.readString(),
        Runtime = parcel.readString(),
        Genre = parcel.readString(),
        Director = parcel.readString(),
        Actors = parcel.readString(),
        Plot = parcel.readString(),
        Languaje = parcel.readString(),
        indbRating = parcel.readString(),
        Poster = parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Title)
        parcel.writeString(Year)
        parcel.writeString(Released)
        parcel.writeString(Runtime)
        parcel.writeString(Genre)
        parcel.writeString(Director)
        parcel.writeString(Actors)
        parcel.writeString(Plot)
        parcel.writeString(Languaje)
        parcel.writeString(indbRating)
        parcel.writeString(Poster)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}