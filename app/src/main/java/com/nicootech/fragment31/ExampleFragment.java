package com.nicootech.fragment31;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ExampleFragment extends Fragment {
    //3.1
    private String text;
    private int number;

    //4
    public static ExampleFragment newInstance(String text, int number){
        ExampleFragment fragment = new ExampleFragment();
        Bundle args = new Bundle();
        args.putString("argsText", "fragment ");
        args.putInt("argsNumber", 12345);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //1.1
        View v = inflater.inflate(R.layout.examole_fragment, container,false);
        //2
        TextView textView = v.findViewById(R.id.text_view);
        //3.2
        if (getArguments() != null){

            text = getArguments().getString("argsText");
            number = getArguments().getInt("argsNumber");
            textView.setText (text + number);

        }
        //1.2
        return v;

    }
}
