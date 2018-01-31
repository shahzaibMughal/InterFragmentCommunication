package com.example.shahzaib.interfragmentcommunication;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentA extends Fragment {

    Button clickMeBtn;
    Communicator communicator;
    int count=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_a, container, false);
    }





    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        clickMeBtn = getActivity().findViewById(R.id.clickMeBtn);
        communicator = (Communicator) getActivity();


        clickMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("1234","Button is Clicked");
                count++;
                communicator.respond("Button is clicked "+count+" times");
            }
        });
    }

}











































