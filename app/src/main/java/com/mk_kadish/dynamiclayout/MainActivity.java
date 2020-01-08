package com.mk_kadish.dynamiclayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
public int btnid=1;
    LinearLayout container;

    List<Button> btnList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = (LinearLayout)findViewById(R.id.container);


    }

    public void addBtn(View v){
        Button btn1 =new Button(this);

        String btnString=btnid+"";
        btn1.setText(btnString);
        btnid=btnid+1;
        btnList.add(btn1);
        container.addView(btnList.get(btnList.size() - 1 ));
    }
    }

