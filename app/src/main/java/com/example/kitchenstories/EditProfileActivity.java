package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class EditProfileActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        home = findViewById(R.id.homeS6);
        add = findViewById(R.id.addS6);
        cart = findViewById(R.id.cartS6);
        expert = findViewById(R.id.expertS6);
        community = findViewById(R.id.communityS6);
        profile = findViewById(R.id.profileS6);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(EditProfileActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(EditProfileActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(EditProfileActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(EditProfileActivity.this , MeetExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(EditProfileActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        profile.setOnClickListener(v -> {
            Intent intent = new Intent(EditProfileActivity.this , CreateProfile.class);
            startActivity(intent);
        });
    }
}