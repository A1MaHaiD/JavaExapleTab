package com.example.javaexampletab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myRecycleView;
    private List<Contact> listContact;

    public FragmentContact() {
    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment, container, false);
        myRecycleView = (RecyclerView) v.findViewById(R.id.contactRecycle);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),listContact);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listContact = new ArrayList<>();
        listContact.add(new Contact("Nick Rash", "(380)000000001", R.drawable.element_1));
        listContact.add(new Contact("Orbit Serg", "(380)000000002", R.drawable.element_2));
        listContact.add(new Contact("Kobec Taras", "(380)000000003", R.drawable.element_3));
        listContact.add(new Contact("Nick Rash", "(380)000000001", R.drawable.element_1));
        listContact.add(new Contact("Orbit Serg", "(380)000000002", R.drawable.element_2));
        listContact.add(new Contact("Kobec Taras", "(380)000000003", R.drawable.element_3));
        listContact.add(new Contact("Nick Rash", "(380)000000001", R.drawable.element_1));
        listContact.add(new Contact("Orbit Serg", "(380)000000002", R.drawable.element_2));
        listContact.add(new Contact("Kobec Taras", "(380)000000003", R.drawable.element_3));
        listContact.add(new Contact("Nick Rash", "(380)000000001", R.drawable.element_1));
        listContact.add(new Contact("Orbit Serg", "(380)000000002", R.drawable.element_2));
        listContact.add(new Contact("Kobec Taras", "(380)000000003", R.drawable.element_3));
        listContact.add(new Contact("Nick Rash", "(380)000000001", R.drawable.element_1));
        listContact.add(new Contact("Orbit Serg", "(380)000000002", R.drawable.element_2));
        listContact.add(new Contact("Kobec Taras", "(380)000000003", R.drawable.element_3));
        listContact.add(new Contact("Nick Rash", "(380)000000001", R.drawable.element_1));
        listContact.add(new Contact("Orbit Serg", "(380)000000002", R.drawable.element_2));
        listContact.add(new Contact("Kobec Taras", "(380)000000003", R.drawable.element_3));

    }
}