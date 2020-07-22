package com.example.thongtindangky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView txtten;
    EditText plten;
    TextView txtsdt;
    EditText plsdt;
    TextView txtct;
    TextView plct;
    TextView txtra;
    Spinner spinner;
    RadioButton rdinu;
    RadioButton rdinam;
    TextView txtgt;
    private long id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            txtten = (TextView) findViewById(R.id.txtten);
            plten = (EditText) findViewById(R.id.plten);
            txtsdt = (TextView) findViewById(R.id.txtsdt);
            plsdt = (EditText) findViewById(R.id.plsdt);
            txtct = (TextView) findViewById(R.id.txtct);
            plct = (EditText) findViewById(R.id.plct);
            spinner = (Spinner) findViewById(R.id.spinner);
            txtra = (TextView) findViewById(R.id.txtra);
            txtgt = (TextView) findViewById(R.id.txtgt);
            rdinu = (RadioButton) findViewById(R.id.rdinu);
            rdinam = (RadioButton) findViewById(R.id.rdinam);
            RadioGroup rdogr = (RadioGroup) findViewById(R.id.rdogr);


            List<String> lan_array = new ArrayList<String>();

            lan_array.add("VietNamese");

            lan_array.add("English");

            lan_array.add("French");

            lan_array.add("Chinese");
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                    this, android.R.layout.simple_spinner_item, lan_array);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            Spinner spinLang = new Spinner(this);

            spinLang.setAdapter(adapter);
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "loi giao dien", Toast.LENGTH_SHORT).show();
        }


    }

    public void display(View v) {

        String a;

        if (rdinam.isChecked())
            txtra.setText(rdinam.getText().toString());
        else
            txtra.setText(rdinu.getText().toString());

        a ="Ten cua ban là    : "+  plten.getText().toString() + "\n SDT của bạn là : " + plsdt.getText().toString() + "chu thich     " + plct.getText().toString() + "quốc gia     " + spinner.getSelectedItem().toString() + "n"  + " \n gioi tinh" + txtra.getText().toString();
        //plten.setText("tên của bạn là ");
        //plsdt.setText("sdt của bạn là ");
        //plct.setText("chu y ");

        txtra.setText(a);
    }
}




         



