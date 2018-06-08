package com.crossphd.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;

public class Movie implements Parcelable {

    private String mTitle;
    private String mPosterImage;
    private String mOverview;
    private String mUserRating;
    private String mReleaseDate;

    public Movie(String mTitle, String mPosterImage, String mOverview, String mUserRating, String mReleaseDate) {

        this.mTitle = mTitle;
        this.mPosterImage = mPosterImage;
        this.mOverview = mOverview;
        this.mUserRating = mUserRating;
        this.mReleaseDate = mReleaseDate;
    }


    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmPosterImage() {
        return mPosterImage;
    }

    public void setmPosterImage(String mPosterImage) {
        this.mPosterImage = mPosterImage;
    }

    public String getmOverview() {
        return mOverview;
    }

    public void setmOverview(String mOverview) {
        this.mOverview = mOverview;
    }

    public String getmUserRating() {
        return mUserRating;
    }

    public void setmUserRating(String mUserRating) {
        this.mUserRating = mUserRating;
    }

    public String getmReleaseDate() {
        return mReleaseDate;
    }

    public void setmReleaseDate(String mReleaseDate) {
        this.mReleaseDate = mReleaseDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mTitle);
        dest.writeString(this.mPosterImage);
        dest.writeString(this.mOverview);
        dest.writeString(this.mUserRating);
        dest.writeString(this.mReleaseDate);
    }

    protected Movie(Parcel in) {
        this.mTitle = in.readString();
        this.mPosterImage = in.readString();
        this.mOverview = in.readString();
        this.mUserRating = in.readString();
        this.mReleaseDate = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
