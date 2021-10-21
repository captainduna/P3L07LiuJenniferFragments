package com.liujennifer.p3l07liujenniferfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FirstFragment fragmentA = new FirstFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //begin transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //add contents to container
        ft.add(R.id.fragment_container, fragmentA, "FirstFragment");
        //replace contents
        ft.replace(R.id.fragment_container, fragmentA, "FirstFragment");
        //complete
        ft.hide(fragmentA);
        ft.commit();

    }

    public void update_greeting (View view){
        FirstFragment fragmentB = (FirstFragment)getSupportFragmentManager().findFragmentByTag("FirstFragment");
        ((TextView)fragmentB.view.findViewById(R.id.textview1)).setText("Testing");

    }

    public void update_fragment(View view){
        
    }

}