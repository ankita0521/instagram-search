package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

public class ShareIntent extends BottomSheetDialogFragment {
    RecyclerView recyclerView;
    List<ModelClass> list;
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_share_intent,container,false);
        recyclerView=view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
    getItem();
        RecyclerAdapter adapter = new RecyclerAdapter(list, getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }
    private void getItem(){
        list=new ArrayList<>();
        list.clear();
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));
        list.add(new ModelClass("Ankita Sharma", " _ankita.21_"));

}
}

