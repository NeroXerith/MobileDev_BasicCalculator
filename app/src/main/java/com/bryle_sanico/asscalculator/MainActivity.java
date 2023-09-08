package com.bryle_sanico.asscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Fnum, Snum;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv;
    TextView showAns;
    double n1, n2;
    double ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    Fnum = (EditText) findViewById(R.id.txtFnum);
    Snum = (EditText) findViewById(R.id.txtSnum);
    BtnAdd = (Button) findViewById(R.id.btnAdd);
    BtnSub = (Button) findViewById(R.id.btnSubtract);
    BtnMul = (Button) findViewById(R.id.btnMultiply);
    BtnDiv = (Button) findViewById(R.id.btnDivide);
    showAns = (TextView) findViewById(R.id.tvResult);

    BtnAdd.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(), "Addition", Toast.LENGTH_LONG).show();
            if(Fnum.getText().toString().equals("")){
                Fnum.setError("Empty Field!");
                Fnum.requestFocus();
                return;
            }
            if(Snum.getText().toString().equals("")){
                Snum.setError("Empty Field!");
                Snum.requestFocus();
                return;
            }
            n1 =  Double.valueOf(Fnum.getText().toString());
            n2 =  Double.valueOf(Snum.getText().toString());
            ans = n1+n2;
            showAns.setText(String.valueOf(ans));
        }
    });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Subtraction", Toast.LENGTH_LONG).show();
                if(Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty Field!");
                    Fnum.requestFocus();
                    return;
                }
                if(Snum.getText().toString().equals("")){
                    Snum.setError("Empty Field!");
                    Snum.requestFocus();
                    return;
                }
                n1 =  Double.valueOf(Fnum.getText().toString());
                n2 =  Double.valueOf(Snum.getText().toString());
                ans = n1-n2;
                showAns.setText(String.valueOf(ans));
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Multiplication", Toast.LENGTH_LONG).show();
                if(Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty Field!");
                    Fnum.requestFocus();
                    return;
                }
                if(Snum.getText().toString().equals("")){
                    Snum.setError("Empty Field!");
                    Snum.requestFocus();
                    return;
                }
                n1 =  Double.valueOf(Fnum.getText().toString());
                n2 =  Double.valueOf(Snum.getText().toString());
                ans = n1*n2;
                showAns.setText(String.valueOf(ans));
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Division", Toast.LENGTH_LONG).show();
                if(Fnum.getText().toString().equals("")){
                    Fnum.setError("Empty Field!");
                    Fnum.requestFocus();
                    return;
                }
                if(Snum.getText().toString().equals("")){
                    Snum.setError("Empty Field!");
                    Snum.requestFocus();
                    return;
                }

                double n1 = Double.parseDouble(Fnum.getText().toString());
                double n2 = Double.parseDouble(Snum.getText().toString());

                if (n1 == 0) {
                    Fnum.setError("Error: Division by zero!");
                    Fnum.requestFocus();
                    return;
                }

                if (n2 == 0) {
                    Snum.setError("Error: Division by zero!");
                    Snum.requestFocus();
                    return;
                }

                ans = n1 / n2;
                String answer = String.valueOf(ans);
                showAns.setText(answer);
            }
        });
    }
}