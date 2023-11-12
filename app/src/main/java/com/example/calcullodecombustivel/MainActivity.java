package com.example.calcullodecombustivel;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtAlcool;
    EditText edtGadolina;
    TextView txtResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlcool = (EditText) findViewById(R.id.edtValorAlcool);
        edtGadolina = (EditText) findViewById(R.id.edtValorGasolina);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double alcool = Double.parseDouble(edtAlcool.getText().toString());
                double gasolina = Double.parseDouble(edtGadolina.getText().toString());

                double calculo = alcool / gasolina;
                txtResultado.setText("");

                if (calculo < 0.7){
                    txtResultado.setText("O Álcool é a melhor opção!\n" + "Diferença de preço é de:\n"
                                            + String.format("R$ %.2f",gasolina - alcool));
                }else {
                    txtResultado.setText("A Gasolina é a melhor opção!\n" + "Diferença de preço é de:\n"
                            + String.format("R$ %.2f",gasolina - alcool));
                }

            }
        });


    }
}