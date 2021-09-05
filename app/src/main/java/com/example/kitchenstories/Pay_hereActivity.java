package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Pay_hereActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , menu3, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_here);

        home = findViewById(R.id.homeC5);
        add = findViewById(R.id.addC5);
        cart = findViewById(R.id.cartC5);
        expert = findViewById(R.id.expertC5);
        community = findViewById(R.id.communityC5);
        menu3 = findViewById(R.id.menuu1C2);
       // profile = findViewById(R.id.profilesC1);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        /*profile.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , CreateProfile.class);
            startActivity(intent);
        });*/
        menu3.setOnClickListener(v -> {
            Intent intent = new Intent(Pay_hereActivity.this , MessageActivity.class);
            startActivity(intent);
        });

    }
}