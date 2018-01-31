package com.example.shahzaib.interfragmentcommunication;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity  implements Communicator{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String data) {
        // this mehtod will called through inheritance by some fragment
       Log.i("1234","data Received From FragmentA to activity:/t"+data);

       FragmentB fragB = (FragmentB) getSupportFragmentManager().findFragmentById(R.id.fragmentB);
       fragB.changeData(data);


    }
}


























