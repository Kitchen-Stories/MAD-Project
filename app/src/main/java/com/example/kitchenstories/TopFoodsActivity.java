package com.example.kitchenstories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class TopFoodsActivity extends AppCompatActivity {
    /*public static final String EXTRA_MESSAGE = "nameC";
    public static final String EXTRA_MESSAGE1 = "priceC";*/

    private Button button;
    ImageView home , add , cart , expert , community , menub, profile,foodView1,gotocart,friedR1;

    Button view1c;
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
 
        menub = findViewById(R.id.cart1);
        gotocart=findViewById(R.id.MenuCha1);
         //button =(Button) findViewById(R.id.button15TFV);
        foodView1 = findViewById(R.id.ThandooriC);
        //view1c=findViewById(R.id.button15TFV);
       // friedR1=findViewById(R.id.friedR1);
 
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
       /* button.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });*/
      foodView1.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });
        gotocart.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , CartActivity.class);
            startActivity(intent);
        });
        /*view1c.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , FavouriteActivity.class);
            startActivity(intent);
        });*/
       /* friedR1.setOnClickListener(v -> {
            Intent intent = new Intent(TopFoodsActivity.this , FavouriteActivity.class);
            intent.putExtra("image", R.drawable.rice);
            TextView textView = findViewById(R.id.foodName1);
            String message = textView.getText().toString();
            intent.putExtra(EXTRA_MESSAGE , message);
            TextView textView1 = findViewById(R.id.TFprice1);
            String message1 = textView1.getText().toString();
            intent.putExtra(EXTRA_MESSAGE1 , message1);
            startActivity(intent);
        });*/
    }
}