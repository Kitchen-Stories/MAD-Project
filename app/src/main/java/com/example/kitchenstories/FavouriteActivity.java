package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FavouriteActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community ,menuu, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        home = findViewById(R.id.homeC5);
        add = findViewById(R.id.addC5);
        cart = findViewById(R.id.cartC5);
        expert = findViewById(R.id.expertC5);
        community = findViewById(R.id.communityC5);
        //profile = findViewById(R.id.profilesC0);


        home.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(FavouriteActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        /*profile.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , CreateProfile.class);
            startActivity(intent);
        });*/

    }
}