package com.example.alb77.contactlisttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alb77 on 3/16/2018.
 */

public class Fragmentcall extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;

    public Fragmentcall() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.call_fragment,container,false);
        myrecyclerview = v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Alexandria Mitchell","(816)565-1724 \nmitchellally@ally.com",R.drawable.alexandrianicole));
        lstContact.add(new Contact("James Mitchell","(816)565-1234\nmitchelljames@james.com",R.drawable.jamesmitchell));
        lstContact.add(new Contact("Amy Borgstadt","(816) 5652345\nborgstadtamy@amy.com",R.drawable.amyborgstadt));
        lstContact.add(new Contact("Aria Renee","(816) 5655678\nreneeariana@ariana.com",R.drawable.arianarenee));
        lstContact.add(new Contact("Lilly Mitchell","(816) 5651725\npickleslilly@lilly.com",R.drawable.lillypickles));
        lstContact.add(new Contact("Mariah Mitchell","(816) 2938476\nmitchellmarian@mariah.com",R.drawable.miamitchell));
        lstContact.add(new Contact("Nakayla","(816) 5659876\nnakayla@nakayla.com",R.drawable.nakayla));
        lstContact.add(new Contact("Rolley N","(816) 5654356\nrolley@rolley.com",R.drawable.rolley));
        lstContact.add(new Contact("Rolley Joseph","(816) 5657865\njosephrolley@rolley.com",R.drawable.rolleyjoseph));
        lstContact.add(new Contact("Ryan Overstreet","(816) 5657896\noverstreetryan@ryan.com",R.drawable.ryan));
        lstContact.add(new Contact("Sharon Marie","(816) 5658920\nmariesharon@sharon.com",R.drawable.sharonmarie));
        lstContact.add(new Contact("Sherry Bradley","(816) 5652906\nbradleysherry@sherry.com",R.drawable.sherrybradley));
    }
}