package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DisplayExpertActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , profile , edit , addExpert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_expert);

        home = findViewById(R.id.homeS3);
        add = findViewById(R.id.addS3);
        cart = findViewById(R.id.cartS6);
        expert = findViewById(R.id.expertS6);
        community = findViewById(R.id.communityS6);
        profile = findViewById(R.id.profileS3);
        addExpert = findViewById(R.id.addExpert1);
        edit = findViewById(R.id.edit);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , MeetExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        profile.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , CreateProfile.class);
            startActivity(intent);
        });

        addExpert.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , AddExpertActivity.class);
            startActivity(intent);
        });

        edit.setOnClickListener(v -> {
            Intent intent = new Intent(DisplayExpertActivity.this , EditExpertActivity.class);
            startActivity(intent);
        });

    }
}