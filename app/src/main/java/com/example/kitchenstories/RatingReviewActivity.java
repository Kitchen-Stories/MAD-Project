package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class RatingReviewActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community, profile , appSupport , writeReview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_review);

        home = findViewById(R.id.homeT8);
        add = findViewById(R.id.addT8);
        cart = findViewById(R.id.cartT8);
        expert = findViewById(R.id.expertT8);
        community = findViewById(R.id.communityT8);
        profile = findViewById(R.id.profileT8);
        appSupport = findViewById(R.id.appSup);
        writeReview = findViewById(R.id.write);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , MeetExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        profile.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , AllReviewActivity.class);
            startActivity(intent);
        });

        appSupport.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , AppSupportActivity.class);
            startActivity(intent);
        });

        writeReview.setOnClickListener(v -> {
            Intent intent = new Intent(RatingReviewActivity.this , WriteReviewActivity.class);
            startActivity(intent);
        });


    }
}