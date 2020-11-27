package com.example.clickablerecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MahasiswaHolder extends RecyclerView.ViewHolder {

    public TextView tvNim;
    public TextView tvNama;
    public ConstraintLayout itemMahasiswa;

    public MahasiswaHolder(@NonNull View itemView) {
        super(itemView);
        tvNim = itemView.findViewById(R.id.tv_nim);
        tvNama = itemView.findViewById(R.id.tv_nama);
        itemMahasiswa = itemView.findViewById(R.id.constraint_layout_mahasiswa);
    }
}
