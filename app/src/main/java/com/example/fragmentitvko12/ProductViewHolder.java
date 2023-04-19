package com.example.fragmentitvko12;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    TextView product, memory;

    ImageView removeImage, editImage;

    EditText editName;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        product = itemView.findViewById(R.id.txtOstos);
        memory = itemView.findViewById(R.id.txtMuisti);



    }
}