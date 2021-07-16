package com.roberto1.navigationcomponentexample;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SegundoFragment extends Fragment {


    public SegundoFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_segundo, container, false);
    }
    @Override
    public void onViewCreated(@NonNull @org.jetbrains.annotations.NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btnAtras = view.findViewById(R.id.btn1);
        Button btnSiguiente = view.findViewById(R.id.btnSiguiente);

        final NavController navController = Navigation.findNavController(view); //para recortar y utilizar la vista en el metodo onclick

        btnAtras.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.primerFragment);
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                navController.navigate(R.id.blankFragment);
            }
        });
}}