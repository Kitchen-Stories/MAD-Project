package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class DeliveryActivity extends AppCompatActivity {
    ImageView home , add , cart , expert , community , menua, profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        home = findViewById(R.id.homeC5);
        add = findViewById(R.id.addC5);
        cart = findViewById(R.id.cartC5);
        expert = findViewById(R.id.expertC5);
        community = findViewById(R.id.communityC5);
        //profile = findViewById(R.id.profilesC4);
        menua = findViewById(R.id.menuaC8);

        home.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , KitchenStoriesActivity.class);
            startActivity(intent);
        });

        add.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , AddRecipeActivity.class);
            startActivity(intent);
        });

        cart.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });

        expert.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , DisplayExpertActivity.class);
            startActivity(intent);
        });

        community.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , RatingReviewActivity.class);
            startActivity(intent);
        });

        /*profile.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , CreateProfile.class);
            startActivity(intent);
        });*/
       menua.setOnClickListener(v -> {
            Intent intent = new Intent(DeliveryActivity.this , Pay_hereActivity.class);
            startActivity(intent);
        });
    }
}