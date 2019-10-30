package com.msmi.tugasmopro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

public class ActivityMenu extends AppCompatActivity implements View.OnClickListener {
    Button btn_company_profile;
    Button btn_aplikasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btn_company_profile= (Button) findViewById(R.id.btn_company_profile);
        btn_company_profile.setOnClickListener(this);
        btn_aplikasi = (Button) findViewById(R.id.btn_aplikasi);
        btn_aplikasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_company_profile:
                Intent company_profile = new Intent(Intent.ACTION_VIEW, Uri.parse("https://if.uinsgd.ac.id"));
                if (company_profile.resolveActivity(getPackageManager()) != null) {
                    startActivity(company_profile);
                }
                break;
            case R.id.btn_aplikasi:
                Intent btn_aplikasi = new Intent(ActivityMenu.this, AplikasiActivity.class);
                if (btn_aplikasi.resolveActivity(getPackageManager()) != null) {
                    startActivity(btn_aplikasi);
                }
                break;
            default:
                break;
        }
    }
}
