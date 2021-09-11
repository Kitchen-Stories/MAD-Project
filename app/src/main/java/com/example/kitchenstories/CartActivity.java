package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class CartActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , cmenu2,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        home = findViewById(R.id.homeC5);
        add = findViewById(R.id.addC5);
        cart = findViewById(R.id.cartC5);
        expert = findViewById(R.id.expertC5);
        community = findViewById(R.id.communityC5);
        //profile = findViewById(R.id.profilesC3);
        cmenu2 = findViewById(R.id.cmenu2);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        /*profile.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , CreateProfile.class);
            startActivity(intent);
        });*/
        cmenu2.setOnClickListener(v -> {
            Intent intent = new Intent(CartActivity.this , DeliveryActivity.class);
            startActivity(intent);
        });
    }
}