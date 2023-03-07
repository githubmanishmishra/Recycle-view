package com.laxmi.recyclepractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class Adapterrecycleemp extends RecyclerView.Adapter<Adapterrecycleemp.viewHolder> {
    Context context;
    ArrayList<Employee>arrayEmp;
    public Adapterrecycleemp(Context context, ArrayList<Employee>arrayEmp)
    {
        this.context = context;
        this.arrayEmp = arrayEmp;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.emplayout_row,parent,false);
       viewHolder viewHolder = new viewHolder(v);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
holder.img.setImageResource(arrayEmp.get(position).empImg);
holder.txt_id.setText(arrayEmp.get(position).empId);
holder.txt_name.setText(arrayEmp.get(position).empName);

    }
//kumar
    @Override
    public int getItemCount() {
        return arrayEmp.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder
    {
     ImageView img;
     TextView txt_id,txt_name;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            txt_id = itemView.findViewById(R.id.text_id);
            txt_name = itemView.findViewById((R.id.txt_name));

        }
    }
}
