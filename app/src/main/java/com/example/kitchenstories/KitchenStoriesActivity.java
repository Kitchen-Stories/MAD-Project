package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class KitchenStoriesActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , profile,pasta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_stories);

        home = findViewById(R.id.homeM0);
        add = findViewById(R.id.addM0);
        cart = findViewById(R.id.homeS6);
        expert = findViewById(R.id.addS6);
        community = findViewById(R.id.communityM0);

        profile = findViewById(R.id.profileM0);
        pasta = findViewById(R.id.profile3);

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
            Intent intent = new Intent(KitchenStoriesActivity.this , MeetExpertActivity.class);
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

        pasta.setOnClickListener(v -> {
            Intent intent = new Intent(KitchenStoriesActivity.this , CategoryActivity.class);
            startActivity(intent);
        });

    }

}