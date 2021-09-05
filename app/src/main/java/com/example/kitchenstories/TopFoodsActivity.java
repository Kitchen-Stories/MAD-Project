package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class TopFoodsActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , menub, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_foods);

        home = findViewById(R.id.homeC1);
        add = findViewById(R.id.addC5);
        cart = findViewById(R.id.cartC5);
        expert = findViewById(R.id.expertC1);
        community = findViewById(R.id.communityC5);
        //profile = findViewById(R.id.MenuC1);
        menub = findViewById(R.id.profileM0);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

       /*profile.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , CreateProfile.class);
            startActivity(intent);
        });*/

        menub.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , CartActivity.class);
            startActivity(intent);
        });
    }
}