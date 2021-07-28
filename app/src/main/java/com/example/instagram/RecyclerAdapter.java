package com.example.instagram;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.ItemviewHolder>{


    List<ModelClass> model;
    Context mcontext;

    public RecyclerAdapter(List<ModelClass> model, Context mcontext) {
        this.model = model;
        this.mcontext = mcontext;
    }

    @NonNull

    @Override
    public ItemviewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        return new ItemviewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.shareitem,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ItemviewHolder holder, int position) {
    ModelClass modelclass = model.get(position);
    holder.fullName.setText(modelclass.getName());
    holder.instaId.setText(modelclass.getInstaid());

    }

    @Override
    public int getItemCount() {
        return model.size();
    }


    public class ItemviewHolder extends RecyclerView.ViewHolder{
        ImageView profileimage;
        TextView fullName,instaId;
        public ItemviewHolder( View itemView) {

            super(itemView);
            profileimage=itemView.findViewById(R.id.profileimage);
            fullName=itemView.findViewById(R.id.profilename);
                    instaId=itemView.findViewById(R.id.profileid);




        }
    }
}
