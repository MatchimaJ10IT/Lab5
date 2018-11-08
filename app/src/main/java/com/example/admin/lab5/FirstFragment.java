package com.example.admin.lab5;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/** * A simple {@link Fragment} subclass. */
public class FirstFragment extends Fragment {

    public FirstFragment() { // Required empty public constructor//// }
    }
        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){ // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_first, container, false);
        }
        public void onViewCreated (@NonNull View view, @NonNull Bundle savedInstanceState){
            super.onViewCreated(view, savedInstanceState);
            Button buttonShowText = (Button) view.findViewById(R.id.btnShowText);
            buttonShowText.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "This is First Fragment", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
