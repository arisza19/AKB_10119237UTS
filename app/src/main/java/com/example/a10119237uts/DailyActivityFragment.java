package com.example.a10119237uts;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

/*
Developed by AriszaZufarFathurrahman
10119237
IF6
on Tuesday, May 24 2022
*/

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyActivityFragment extends Fragment {

    private ArrayList<String> fotoDaily = new ArrayList<>();
    private ArrayList<String> contentDaily = new ArrayList<>();
    private ArrayList<String> fotoFriends = new ArrayList<>();
    private ArrayList<String> namaFriends = new ArrayList<>();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    ArrayList<DailyModel> dataHolder;
    ArrayList<FriendsModel> dataHolder2;

    public DailyActivityFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DailyActivityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DailyActivityFragment newInstance(String param1, String param2) {
        DailyActivityFragment fragment = new DailyActivityFragment();
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
        View view = inflater.inflate(R.layout.fragment_daily_activity, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.daily_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataHolder = new ArrayList<>();

        DailyModel ob1 = new DailyModel(R.drawable.dail1,
                "Ibadah adalah hal wajib yang tidak boleh ditinggalkan. Walaupun memiliki banyak " +
                        "kesibukan yang melanda seperti saat mengerjakan tugas ini, tetapi ibadah tetap " +
                        "harus berjalan.");
        dataHolder.add(ob1);
        DailyModel ob2 = new DailyModel(R.drawable.dail2,
                "Bermain game sebenarnya bukan merupakan suatu keharusan.Tetapi tidak tau mengapa " +
                        "rasanya ingin terus main game, walaupun lama-lama bosan juga.");
        dataHolder.add(ob2);
        DailyModel ob3 = new DailyModel(R.drawable.dail3,
                "Seorang mahasiswa tentunya harus kuliah. Walaupun membosankan dan ingin " +
                        "cepat-cepat selesai kelas, tetapi mengikuti perkuliahan sangat penting " +
                        "agar bisa menjadi sarjana.");
        dataHolder.add(ob3);
        DailyModel ob4 = new DailyModel(R.drawable.dail4,
                "Olahraga sangat penting untuk kesehatan tubuh. Selain membuat tubuh menjadi lebih sehat, " +
                        "olahraga juga dapat membentuk otot tubuh agar terlihat semakin tampan.");
        dataHolder.add(ob4);

        recyclerView.setAdapter(new DailyRvAdapter(dataHolder));

        RecyclerView recyclerView2 = view.findViewById(R.id.daily_rv2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        dataHolder2 = new ArrayList<>();

        FriendsModel fob1 = new FriendsModel(R.drawable.jkt_muthe,
                "Mutiara Azzahra");
        dataHolder2.add(fob1);
        FriendsModel fob2 = new FriendsModel(R.drawable.jkt_jinan,
                "Jinan Safa");
        dataHolder2.add(fob2);
        FriendsModel fob3 = new FriendsModel(R.drawable.jkt_shani,
                "Shani Indira");
        dataHolder2.add(fob3);
        FriendsModel fob4 = new FriendsModel(R.drawable.jkt_gracia,
                "Shania Gracia");
        dataHolder2.add(fob4);
        FriendsModel fob5 = new FriendsModel(R.drawable.jkt_feni,
                "Feni Fitriyanti");
        dataHolder2.add(fob5);
        FriendsModel fob6 = new FriendsModel(R.drawable.jkt_marsha,
                "Marsha Lenathea");
        dataHolder2.add(fob6);
        FriendsModel fob7 = new FriendsModel(R.drawable.jkt_lulu,
                "Lulu Salsabila");
        dataHolder2.add(fob7);
        FriendsModel fob8 = new FriendsModel(R.drawable.jkt_fiony,
                "Fiony Alveria");
        dataHolder2.add(fob8);
        FriendsModel fob9 = new FriendsModel(R.drawable.jkt_gita,
                "Gita Sekar");
        dataHolder2.add(fob9);

        recyclerView2.setAdapter(new FriendsRvAdapter(dataHolder2));

        return view;
    }



}