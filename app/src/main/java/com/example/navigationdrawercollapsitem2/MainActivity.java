package com.example.navigationdrawercollapsitem2;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    GeneralTools tools;
    LinearLayout linear_shopping,linear_support,linear_submenu,linear_faq,linear_report_issue,linear_videos;
    boolean isSupportLayoutClicked = false;
    ImageView image_drawer;

    DrawerLayout drawer_layout_home;
    NavigationView nav_view_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        tools = GeneralTools.getInstance();


//        linear_shopping.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "shopping", Toast.LENGTH_SHORT).show();
//            }
//        });

//        image_drawer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                drawer_layout_home.openDrawer(Gravity.END);
//            }
//        });
//
//        linear_support.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!isSupportLayoutClicked) {
//
//                    tools.expand(linear_submenu);
//                } else
//                    tools.collapse(linear_submenu);
//
//                isSupportLayoutClicked = !isSupportLayoutClicked;
//            }
//        });


    }

    private void init() {

        image_drawer = findViewById(R.id.image_drawer);
        drawer_layout_home = findViewById(R.id.drawer_layout_home);
        nav_view_home=findViewById(R.id.nav_view_home);
        linear_shopping=findViewById(R.id.linear_shopping);
        linear_support  = findViewById(R.id.linear_support);
        linear_submenu = findViewById(R.id.linear_submenu);
        linear_faq=findViewById(R.id.linear_faq);
        linear_report_issue=findViewById(R.id.linear_report_issue);
        linear_videos=findViewById(R.id.linear_videos);


        image_drawer.setOnClickListener(this);
        linear_shopping.setOnClickListener(this);
        linear_faq.setOnClickListener(this);
        linear_videos.setOnClickListener(this);
        linear_support.setOnClickListener(this);
        linear_report_issue.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.image_drawer:
                drawer_layout_home.openDrawer(Gravity.END);
                break;
            case R.id.linear_shopping:
                Toast.makeText(this, "shopping", Toast.LENGTH_SHORT).show();
                break;
            case R.id.linear_support:

                if (!isSupportLayoutClicked) {

                    tools.expand(linear_submenu);
                } else
                    tools.collapse(linear_submenu);

                isSupportLayoutClicked = !isSupportLayoutClicked;
                break;

            case R.id.linear_faq:
                Toast.makeText(this, "linear_faq", Toast.LENGTH_SHORT).show();
                break;

            case R.id.linear_report_issue:
                Toast.makeText(this, "linear_report_issue", Toast.LENGTH_SHORT).show();
                break;

            case R.id.linear_videos:
                Toast.makeText(this, "linear_videos", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
