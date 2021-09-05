package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class KitchenStoriesActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_stories);

        home = findViewById(R.id.homeM0);
        add = findViewById(R.id.addM0);
        cart = findViewById(R.id.cartM0);
        expert = findViewById(R.id.expertM0);
        community = findViewById(R.id.communityM0);
        profile = findViewById(R.id.profilesM0);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        profile.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , CreateProfile.class);
            startActivity(intent);
        });

    }

}