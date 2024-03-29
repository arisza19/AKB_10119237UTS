package com.example.a10119237uts;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/*
Developed by AriszaZufarFathurrahman
10119237
IF6
on Tuesday, May 25 2022 at 07.32
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GalleryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GalleryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView3;
    ArrayList<GalleryModel> dataHolder3;

    public GalleryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GalleryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance(String param1, String param2) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);

        RecyclerView recyclerView3 = view.findViewById(R.id.gallery_rv);
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView3.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        );
        dataHolder3 = new ArrayList<>();

        GalleryModel gob1 = new GalleryModel(R.drawable.g1);
        dataHolder3.add(gob1);

        GalleryModel gob2 = new GalleryModel(R.drawable.g2);
        dataHolder3.add(gob2);

        GalleryModel gob3 = new GalleryModel(R.drawable.g3);
        dataHolder3.add(gob3);

        GalleryModel gob4 = new GalleryModel(R.drawable.g4);
        dataHolder3.add(gob4);

        GalleryModel gob5 = new GalleryModel(R.drawable.g5);
        dataHolder3.add(gob5);

        GalleryModel gob6 = new GalleryModel(R.drawable.g6);
        dataHolder3.add(gob6);

        GalleryModel gob7 = new GalleryModel(R.drawable.g7);
        dataHolder3.add(gob7);

        GalleryModel gob8 = new GalleryModel(R.drawable.g8);
        dataHolder3.add(gob8);

        GalleryModel gob9 = new GalleryModel(R.drawable.g9);
        dataHolder3.add(gob9);

        GalleryModel gob10 = new GalleryModel(R.drawable.g10);
        dataHolder3.add(gob10);

        GalleryModel gob11 = new GalleryModel(R.drawable.g11);
        dataHolder3.add(gob11);

        GalleryModel gob12 = new GalleryModel(R.drawable.g12);
        dataHolder3.add(gob12);

        GalleryModel gob13 = new GalleryModel(R.drawable.g13);
        dataHolder3.add(gob13);

        GalleryModel gob14 = new GalleryModel(R.drawable.g14);
        dataHolder3.add(gob14);

        recyclerView3.setAdapter(new GalleryRvAdapter(dataHolder3));

        return view;
    }
}