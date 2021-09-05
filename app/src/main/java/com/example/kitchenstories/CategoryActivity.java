package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class CategoryActivity extends AppCompatActivity {
    ImageView summery ;
    ImageView home , add , cart , expert , community ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        home = findViewById(R.id.homeMD);
        add = findViewById(R.id.addMD);
        cart = findViewById(R.id.cartMD);
        expert = findViewById(R.id.expertMD);
        community = findViewById(R.id.communityMD);
        summery = findViewById(R.id.summeryMD);

        summery.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this , SummaryOfRecipeActivity.class);
            startActivity(intent);
        });

        home.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });
    }
}