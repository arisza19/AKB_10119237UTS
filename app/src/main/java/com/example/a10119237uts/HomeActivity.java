package com.example.a10119237uts;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.a10119237uts.databinding.ActivityHomeBinding;

/*
Developed by AriszaZufarFathurrahman
10119237
IF6
on Tuesday, May 25 2022 at 07.32
*/

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.nav_home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.nav_activity:
                    replaceFragment(new DailyActivityFragment());
                    break;
                case R.id.nav_gallery:
                    replaceFragment(new GalleryFragment());
                    break;
                case R.id.nav_musicvid:
                    replaceFragment(new MusicVideoFragment());
                    break;
                case R.id.nav_profile:
                    replaceFragment(new ProfileFragment());
                    break;

            }

            return true;
        });

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.home_frame_layout,fragment);
        fragmentTransaction.commit();

    }



}