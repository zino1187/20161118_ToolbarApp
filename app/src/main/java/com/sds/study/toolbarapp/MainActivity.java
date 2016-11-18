package com.sds.study.toolbarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar my_toolbar = (Toolbar) this.findViewById(R.id.my_toolbar);
        setSupportActionBar(my_toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true); //홈버튼
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true); //뒤로가기 버튼
        //my_toolbar.setNavigationIcon(android.R.drawable.btn_star);
        my_toolbar.setLogo(android.R.drawable.btn_star);


        my_toolbar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "홈버튼", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_navi, menu);
        ;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = null;
        switch (item.getItemId()) {
            case R.id.m1:
                msg = "m1";
                break;
            case R.id.m2:
                msg = "m2";
                break;
            case R.id.m3:
                msg = "m3";
                break;
        }

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
