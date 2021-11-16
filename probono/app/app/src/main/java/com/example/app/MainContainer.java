package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainContainer extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.container_main, container, false);

        Button program1 = view.findViewById(R.id.program_1);
        Button program2 = view.findViewById(R.id.program_2);
        Button program3 = view.findViewById(R.id.program_3);

        program1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), program1.class);
                startActivity(intent1);
            }
        });

        /*

        program2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), program2.class);
                startActivity(intent1);
            }
        });

        program3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(), program3.class);
                startActivity(intent1);
            }
        });

         */

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
