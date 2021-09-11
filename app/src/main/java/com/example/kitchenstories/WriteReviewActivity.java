package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class WriteReviewActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);

        home = findViewById(R.id.homeT8);
        add = findViewById(R.id.addT8);
        cart = findViewById(R.id.cartT8);
        expert = findViewById(R.id.expertT8);
        community = findViewById(R.id.communityT8);
        back = findViewById(R.id.pBack);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(WriteReviewActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(WriteReviewActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(WriteReviewActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(WriteReviewActivity.this , MeetExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(WriteReviewActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        back.setOnClickListener(v -> {
            Intent intent = new Intent(WriteReviewActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

    }
}