package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class EditRecipeActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_recipe);

        home = findViewById(R.id.homeMD);
        add = findViewById(R.id.addMD);
        cart = findViewById(R.id.cartMD);
        expert = findViewById(R.id.expertMD);
        community = findViewById(R.id.communityMD);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(EditRecipeActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(EditRecipeActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(EditRecipeActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(EditRecipeActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(EditRecipeActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

    }
}
