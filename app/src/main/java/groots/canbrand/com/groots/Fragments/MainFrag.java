package groots.canbrand.com.groots.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import groots.canbrand.com.groots.Adapter.Detail_Adapter;
import groots.canbrand.com.groots.Adapter.Landing_Adapter;
import groots.canbrand.com.groots.Model.LandingInfo;
import groots.canbrand.com.groots.R;


public class MainFrag extends Fragment {

    public MainFrag() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view =inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<LandingInfo> dummyValue=new ArrayList<>();

        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));

        RecyclerView mRecyclerView = (RecyclerView)view.findViewById(R.id.my_recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        Landing_Adapter mAdapter = new Landing_Adapter(dummyValue,getActivity());
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }



}
