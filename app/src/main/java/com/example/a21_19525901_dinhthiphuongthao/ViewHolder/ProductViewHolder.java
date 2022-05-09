package com.example.a21_19525901_dinhthiphuongthao.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a21_19525901_dinhthiphuongthao.Interface.ItemClickListen;
import com.example.a21_19525901_dinhthiphuongthao.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txtName,txtPrice;

    private ItemClickListen itemClickListen;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        txtName=itemView.findViewById(R.id.productName);
        txtPrice=itemView.findViewById(R.id.price);


        itemView.setOnClickListener(this);
    }

    public void setItemClickListen(ItemClickListen itemClickListen) {
        this.itemClickListen = itemClickListen;
    }

    @Override
    public void onClick(View view) {
        itemClickListen.OnClick(view,getAdapterPosition(),false);

    }
}
