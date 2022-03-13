package com.example.lkpactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_massa, edt_acc;
    private Button btn_calculate;
    private TextView tv_result, tv_gaya;
    private static final String STATE_HASIL = "state_hasil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_massa = (EditText) findViewById(R.id.edt_massa);
        edt_acc = (EditText) findViewById(R.id.edt_acc);
        btn_calculate = (Button) findViewById(R.id.btn_calculate);
        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_gaya = (TextView) findViewById(R.id.tv_gaya);

        btn_calculate.setOnClickListener(this);

        if (savedInstanceState != null){
            String hasil = savedInstanceState.getString(STATE_HASIL);
            tv_result.setText(hasil);
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_calculate){
            String massa = edt_massa.getText().toString().trim();
            String percepatan = edt_acc.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(massa)){
                isEmptyFields = true;
                edt_massa.setError("Fields ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(percepatan)){
                isEmptyFields = true;
                edt_massa.setError("Fields ini tidak boleh kosong");
            }
            if (!isEmptyFields) {
                double m = Double.parseDouble(massa);
                double a = Double.parseDouble(percepatan);
                double gaya = m * a;
                tv_result.setText(String.valueOf(gaya));
            }
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        outState.putString(STATE_HASIL, tv_result.getText().toString());
        super.onSaveInstanceState(outState);
    }

}