package com.example.fragmentitvko12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmentitvko12.fragments.FragmentAdd;
import com.example.fragmentitvko12.fragments.FragmentList;
import com.example.fragmentitvko12.fragments.FragmentMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fragmentAdd = findViewById(R.id.btnNew);
        Button fragmentList = findViewById(R.id.btnList);
        Button fragmentInfo = findViewById(R.id.btnInfo);
        Button fragmentMain = findViewById(R.id.btnMain);

        fragmentMain.setOnClickListener(listener);
        fragmentAdd.setOnClickListener(listener);
        fragmentInfo.setOnClickListener(listener);
        fragmentList.setOnClickListener(listener);
    }



    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Fragment fragment = new Fragment();

            switch (view.getId()){
                case R.id.btnMain:
                    fragment = new FragmentMain();
                    break;
                case R.id.btnInfo:
                    Intent intent = new Intent(view.getContext(), TabActivity.class);
                    startActivity(intent);
                    return;
                case R.id.btnNew:
                    fragment = new FragmentAdd();
                    break;
                case R.id.btnList:
                    fragment = new FragmentList();
                    break;




            }

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame, fragment)
                    .commit();
        }
    };
}