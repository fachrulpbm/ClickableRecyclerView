package com.example.samplerecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<MahasiswaHolder> {

    private ArrayList<Mahasiswa> listMahasiswa;
    private Context context;

    public RecyclerViewAdapter(ArrayList<Mahasiswa> listMahasiswa, Context context) {
        this.listMahasiswa = listMahasiswa;
        this.context = context;
    }

    @NonNull
    @Override
    public MahasiswaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_mahasiswa, parent, false);
        MahasiswaHolder mh = new MahasiswaHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaHolder holder, int position) {
        final Mahasiswa mhs = listMahasiswa.get(position);
        holder.tvNim.setText(listMahasiswa.get(position).getNim());
        holder.tvNama.setText(listMahasiswa.get(position).getNama());

        holder.itemMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, TargetActivity.class);
                i.putExtra("nim", holder.tvNim.getText().toString());
                i.putExtra("nama", holder.tvNama.getText().toString());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMahasiswa.size();
    }
}
