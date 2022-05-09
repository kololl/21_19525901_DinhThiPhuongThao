package com.example.a21_19525901_dinhthiphuongthao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.a21_19525901_dinhthiphuongthao.ViewHolder.ProductViewHolder;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Product extends AppCompatActivity {



    private FirebaseDatabase database;
    private DatabaseReference food;


    private RecyclerView recycler_menu,recycler_food;
    private RecyclerView.LayoutManager gridLayoutManager;

    FirebaseRecyclerAdapter<Product, ProductViewHolder> adapter_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        //Init Firebase
        database=FirebaseDatabase.getInstance();

        food=database.getReference("Product");






        //Load food
        recycler_food=findViewById(R.id.recycler1);
        recycler_food.setHasFixedSize(true);
        gridLayoutManager = new GridLayoutManager(getApplicationContext(),1,LinearLayoutManager.HORIZONTAL,false);
        recycler_food.setHorizontalScrollBarEnabled(false);
        recycler_food.setLayoutManager(gridLayoutManager);

        loadFood();
    }

    private void loadFood() {
//        adapter_food=new FirebaseRecyclerAdapter<Product, ProductViewHolder>(Product.class,R.layout.activity_product_item,ProductViewHolder.class,food) {
//            @Override
//            protected void populateViewHolder(ProductViewHolder foodViewHolder, Product food, int i) {
//                foodViewHolder.txtName.setText(food.getText());
//
//                Picasso.with(getBaseContext()).load(food.getImage())
//                        .into(foodViewHolder.imageFoodView);
//                final Food clickItem = food;
//
//                foodViewHolder.setItemClickListen(new ItemClickListen() {
//                    @Override
//                    public void OnClick(View view, int position, boolean isLongClick) {
//                        Toast.makeText(HomeActivity.this, "" + clickItem.getName(), Toast.LENGTH_LONG).show();
//                        Intent foodList=new Intent(HomeActivity.this,FoodDetailActivity.class);
//                        foodList.putExtra("FoodId",adapter_food.getRef(position).getKey());
//                        startActivity(foodList);
//                    }
//                });
//            }
//        };
//        recycler_food.setAdapter(adapter_food);
    }



}