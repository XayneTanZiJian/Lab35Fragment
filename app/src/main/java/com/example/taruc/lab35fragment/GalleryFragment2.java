package com.example.taruc.lab35fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment2 extends Fragment {


    public GalleryFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        TextView textViewMessage;
        View view;
        view = inflater.inflate(R.layout.fragment_gallery_fragment2, container, false);
        textViewMessage = view.findViewById(R.id.textView3);
        Button buttonShowMessage;
        buttonShowMessage = view.findViewById(R.id.buttonShowMessage);
        buttonShowMessage = buttonShowMessage.setOnClickListener();

        public void onClick(View v){
            textViewMessage.setText("Hello Gallery");
        }

        return view;
    }

}
