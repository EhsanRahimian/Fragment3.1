package com.nicootech.fragment31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ExampleFragment fragment = new ExampleFragment();
//        Bundle args = new Bundle();
//        args.putString("argsText", "fragment ");
//        args.putInt("argsNumber", 123);
//        fragment.setArguments(args);

        ExampleFragment fragment = ExampleFragment.newInstance("fragment ", 123);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();

    }
}
