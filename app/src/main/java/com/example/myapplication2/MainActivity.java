package com.example.myapplication2;

import android.os.Bundle;
import android.widget.TableLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

  private TabLayout tabLayout;
  private ViewPager viewPager;

  @Override
    protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      tabLayout = findViewById(R.id.tabLayout);
      viewPager = findViewById(R.id.viewPager);

      tabLayout.setupWithViewPager(viewPager);
      Pager pager = new Pager(getSupportFragmentManager(),Pager.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
      pager.addFragment(new Fragment1(), "Регистрация");
      pager.addFragment(new Fragment2(), "Логин");
      viewPager.setAdapter(pager);
  }
}