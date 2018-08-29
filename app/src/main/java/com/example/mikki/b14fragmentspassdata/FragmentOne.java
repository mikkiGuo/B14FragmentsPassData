package com.example.mikki.b14fragmentspassdata;


import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentOne extends Fragment {

    LoginInterface loginInterface;
    Button submit_btn;
    EditText username_txt;
    EditText pw_txt;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        loginInterface = (LoginInterface)getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        submit_btn = view.findViewById(R.id.submit_button);
        username_txt = view.findViewById(R.id.username_txt);
        pw_txt = view.findViewById(R.id.pw_txt);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] arr = {username_txt.getText().toString(), pw_txt.getText().toString()};
                loginInterface.getData(arr);

            }
        });


        return view;
    }


}
