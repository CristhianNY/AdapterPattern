package com.cristhian.com.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OldLocation oldLocation = new CustomerLocation();
        oldLocation.setBuilding("Bancolombia");
        oldLocation.setFloor(5);
        oldLocation.setDesk(30);
    }
}
