package com.example.crimcone;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class holder extends RecyclerView.ViewHolder{
    ImageView image;
    TextView txtname, txtdesc, txtprice;

    public holder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.imageEskrim);
        txtname = itemView.findViewById(R.id.txtname);
        txtdesc = itemView.findViewById(R.id.txtdesc);
        txtprice = itemView.findViewById(R.id.txtprice);
    }
}

public class adapter extends RecyclerView.Adapter <holder> {
    Context context;
    ArrayList<eskrim> ListEskrim;

    public adapter(Context context, ArrayList<eskrim> listEskrim) {
        this.context = context;
        ListEskrim = listEskrim;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        eskrim Eskrim = ListEskrim.get(position);
        holder.image.setImageResource(Eskrim.getImage());
        holder.txtname.setText(Eskrim.getnamaEskrim());
        holder.txtdesc.setText(Eskrim.getDeskripsiEskrim());
        holder.txtprice.setText(""+Eskrim.getHarga());

    }

    @Override
    public int getItemCount() { return ListEskrim.size(); }
}
