package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MoveForresultActivity extends AppCompatActivity {

    private TextView txthasil,txtket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_forresult);
        txthasil = (TextView) findViewById(R.id.txt_hasil);
        txtket = (TextView) findViewById(R.id.txt_keterangan);
        Bundle b = getIntent().getExtras();
        txtket.setText(b.getString("ket"));
        txtket.setText(b.getString("hasil"));
    }
}