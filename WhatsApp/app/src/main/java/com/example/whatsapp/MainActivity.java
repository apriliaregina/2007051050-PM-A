package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.grup){
            startActivity(new Intent(this, GrupActivity.class));
        }
        else if (item.getItemId()==R.id.siaran){
            startActivity(new Intent(this, SiaranActivity.class));
        }
        else if (item.getItemId()==R.id.perangkat){
            startActivity(new Intent(this, PerangkatActivity.class));
        }
        else if (item.getItemId()==R.id.pesan){
            startActivity(new Intent(this, PesanActivity.class));
        }
        else if (item.getItemId()==R.id.setelan){
            startActivity(new Intent(this, SetelanActivity.class));
        }
        return true;
    }
}