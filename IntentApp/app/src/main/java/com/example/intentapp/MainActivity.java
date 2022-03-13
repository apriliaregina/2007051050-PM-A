package com.example.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText bila,bilb;
    private ImageButton tambah, kali, bagi, kurang;
    private TextView hasil;
    private Button search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bila = (EditText) findViewById(R.id.bilangana);
        bilb = (EditText) findViewById(R.id.bilanganb);
        tambah = (ImageButton) findViewById(R.id.plus);
        kurang = (ImageButton) findViewById(R.id.minus);
        kali = (ImageButton) findViewById(R.id.multiply);
        bagi = (ImageButton) findViewById(R.id.devided);
        hasil = (TextView) findViewById(R.id.hasil);
        search = (Button) findViewById(R.id.search);

        bila.setOnClickListener(this);
        bilb.setOnClickListener(this);
        tambah.setOnClickListener(this);
        kurang.setOnClickListener(this);
        kali.setOnClickListener(this);
        bagi.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        Intent i;
        if (view.getId() == R.id.plus){
            String bilangana = bila.getText().toString().trim();
            String bilanganb = bilb.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilangana)){
                isEmptyFields = true;
                bila.setError("Fields ini harus diisi");
            }
            if (TextUtils.isEmpty(bilanganb)){
                isEmptyFields = true;
                bilb.setError("Fields ini harus diisi");
            }
            if (!isEmptyFields){
                Integer a = Integer.parseInt(bilangana);
                Integer b = Integer.parseInt(bilanganb);
                Integer c = a + b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveForresultActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "HASIL PENJUMBLAHAN");
                startActivity(i);
            }
        }
        else if (view.getId() == R.id.minus){
            String bilangana = bila.getText().toString().trim();
            String bilanganb = bilb.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilangana)){
                isEmptyFields = true;
                bila.setError("Fields ini harus diisi");
            }
            if (TextUtils.isEmpty(bilanganb)){
                isEmptyFields = true;
                bilb.setError("Fields ini harus diisi");
            }
            if (!isEmptyFields){
                Integer a = Integer.parseInt(bilangana);
                Integer b = Integer.parseInt(bilanganb);
                Integer c = a - b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveForresultActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "HASIL PENGURANGAN");
                startActivity(i);
            }
        }
        else if (view.getId() == R.id.multiply){
            String bilangana = bila.getText().toString().trim();
            String bilanganb = bilb.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilangana)){
                isEmptyFields = true;
                bila.setError("Fields ini harus diisi");
            }
            if (TextUtils.isEmpty(bilanganb)){
                isEmptyFields = true;
                bilb.setError("Fields ini harus diisi");
            }
            if (!isEmptyFields){
                Integer a = Integer.parseInt(bilangana);
                Integer b = Integer.parseInt(bilanganb);
                Integer c = a * b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveForresultActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "HASIL PERKALIAN");
                startActivity(i);
            }
        }
       else if (view.getId() == R.id.devided){
            String bilangana = bila.getText().toString().trim();
            String bilanganb = bilb.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(bilangana)){
                isEmptyFields = true;
                bila.setError("Fields ini harus diisi");
            }
            if (TextUtils.isEmpty(bilanganb)){
                isEmptyFields = true;
                bilb.setError("Fields ini harus diisi");
            }
            if (!isEmptyFields){
                Double a = Double.parseDouble(bilangana);
                Double b = Double.parseDouble(bilanganb);
                Double c = a / b;
                hasil.setText(String.valueOf(c));
                i = new Intent(this, MoveForresultActivity.class);
                i.putExtra("hasil", hasil.getText().toString());
                i.putExtra("ket", "HASIL PEMBAGIAN");
                startActivity(i);
            }
        }
       else {
           i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
           startActivity(i);
        }
    }
}