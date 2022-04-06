package com.example.vacationapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

//public class ParseApplication {
//}
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Ro9gVC1wd5uATvUgmt2vP5u5iO5GCl4bSnSrmH05")
                .clientKey("TGj7tXsvuy6ac8jBcwK9MxVgQRVW5svTPPE4I8Fs")
                .server("https://parseapi.back4app.com")
                .build()


        );
    }
}
