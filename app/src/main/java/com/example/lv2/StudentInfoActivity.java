package com.example.lv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class StudentInfoActivity extends AppCompatActivity {

    private TextInputEditText oTextInputEditTextImeProfesor;
    private TextInputEditText oTextInputEditTextPredmet;
    private TextInputEditText oTextInputEditTextAkademskaGodina;
    private TextInputEditText oTextInputEditTextBrojSatiPredavanje;
    private TextInputEditText oTextInputEditTextBrojSatiVjezbe;
    private Button oBtnDalje2;
    private String sProfesor;
    private String sPredmet;
    private String sAkademskaGodina;
    private String sBrojSatiPredavanja;
    private String sBrojSatiVjezbe;
    private String sIme;
    private String sPrezime;
    private String sDatumRodenja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        oTextInputEditTextImeProfesor = (TextInputEditText) findViewById(R.id.tietProfesor);
        oTextInputEditTextPredmet = (TextInputEditText) findViewById(R.id.tietPredmet);
        oTextInputEditTextAkademskaGodina = (TextInputEditText) findViewById(R.id.tietAkademskaGodina);
        oTextInputEditTextBrojSatiPredavanje = (TextInputEditText) findViewById(R.id.tietBrojSatiPredavanja);
        oTextInputEditTextBrojSatiVjezbe = (TextInputEditText) findViewById(R.id.tietBrojSatiVjezbe);
        oBtnDalje2 = (Button) findViewById(R.id.btnDalje2);

        oBtnDalje2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Bundle oExtras = getIntent().getExtras();

                sIme = oExtras.getString("ime");
                sPrezime = oExtras.getString("prezime");
                sDatumRodenja = oExtras.getString("datum");
                sProfesor = oTextInputEditTextImeProfesor.getText().toString();
                sPredmet = oTextInputEditTextPredmet.getText().toString();
                sAkademskaGodina = oTextInputEditTextAkademskaGodina.getText().toString();
                sBrojSatiPredavanja = oTextInputEditTextBrojSatiPredavanje.getText().toString();
                sBrojSatiVjezbe = oTextInputEditTextBrojSatiVjezbe.getText().toString();

                Intent oSummaryActivityIntent = new Intent(getApplicationContext(), SummaryActivity.class);
                oSummaryActivityIntent.putExtra("ime", sIme);
                oSummaryActivityIntent.putExtra("prezime", sPrezime);
                oSummaryActivityIntent.putExtra("datum", sDatumRodenja);
                oSummaryActivityIntent.putExtra("profesor", sProfesor);
                oSummaryActivityIntent.putExtra("predmet", sPredmet);
                oSummaryActivityIntent.putExtra("akademskaGodina", sAkademskaGodina);
                oSummaryActivityIntent.putExtra("brojSatiPredavanja", sBrojSatiPredavanja);
                oSummaryActivityIntent.putExtra("brojSatiVjezbe", sBrojSatiVjezbe);
                startActivity(oSummaryActivityIntent);
            }
        });
    }
}
