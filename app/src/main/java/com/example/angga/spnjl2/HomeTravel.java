package com.example.angga.spnjl2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeTravel extends Fragment {


    public HomeTravel() {
        // Required empty public constructor
    }

    RelativeLayout book;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_travel, container, false);

        book = (RelativeLayout)view.findViewById(R.id.relativeLayout);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlaneTicket b = new PlaneTicket();
                FragmentTransaction transac = getFragmentManager().beginTransaction();
                transac.replace(R.id.confill, b);
                transac.addToBackStack(null);
                transac.commit();
            }
        });

        return view;
    }

}
