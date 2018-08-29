package com.example.mikki.b14fragmentspassdata;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwo extends Fragment{

    TextView display_tv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        display_tv = view.findViewById(R.id.display_tv);
        Bundle b = getArguments();
        String[] s = b.getStringArray("mykey");
        display_tv.setText(s[0] + '\n' + s[1]);


        return view;
    }
    /*public void grabData(String[] arr){
        display_tv.setText(arr[0] + '\n' + arr[1]);

    }*/
}
