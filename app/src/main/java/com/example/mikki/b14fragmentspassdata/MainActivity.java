package com.example.mikki.b14fragmentspassdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements LoginInterface{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFragmentManager().beginTransaction().add(R.id.mylayout, new FragmentOne(), "mytag").commit();
    }

    /*@Override
    public void getData(String[] data) {
        FragmentTwo fragmentTwo = (FragmentTwo) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentTwo.grabData(data);
    }*/

    @Override
    public void getData(String[] data) {
        //FragmentTwo
        FragmentTwo fragmentTwo = new FragmentTwo();
        Bundle bundle = new Bundle();
        bundle.putStringArray("mykey", data);
        fragmentTwo.setArguments(bundle);
        getFragmentManager().beginTransaction().replace(R.id.mylayout, fragmentTwo).commit();

    }
}
