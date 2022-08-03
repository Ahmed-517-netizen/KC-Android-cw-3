package com.example.yem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtheader =findViewById(R.id.Txtheader);
        TextView txttot =findViewById(R.id.Txttotal);
        EditText edtno1 =findViewById(R.id.edtfirstno);
        EditText edtno2 =findViewById(R.id.edtscondno);
        Button buttsal =findViewById(R.id.btncalculate);

    }
}