package com.example.maria.maria;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void salvar(View vi){
        TextView txt1 = (TextView)findViewById(R.id.InputNome);
        txt1.setText("Maria");
        String valor1 = txt1.getText().toString();
        TextView txt2 = (TextView)findViewById(R.id.InputTel);
        txt2.setText(valor1);

    }

}
