package com.example.fragmentitvko12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private Context context;
    private ArrayList<Product> products = new ArrayList<>();

    public ProductListAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(context).inflate(R.layout.product_view, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.product.setText(products.get(position).getOstos());
        holder.memory.setText(products.get(position).getMuistiinpanot());







    }

    public void removeProduct2(Product product){
        int position = products.indexOf(product);
        if (position != -1){
            products.remove(position);
            notifyItemRemoved(position);
        }
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public void setProducts(ArrayList<Product> products) {
    }

}