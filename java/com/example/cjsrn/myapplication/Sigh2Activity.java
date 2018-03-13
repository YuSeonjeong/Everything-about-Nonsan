package com.example.cjsrn.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
import android.view.View.OnClickListener;

public class Sigh2Activity extends AppCompatActivity implements OnClickListener {
    Button left1, left2, left3, right1, right2, right3;
    ViewFlipper view1, view2, view3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigh2);

        left1 = (Button) findViewById(R.id.button1);
        right1 = (Button) findViewById(R.id.button2);
        view1 = (ViewFlipper) findViewById(R.id.viewFlipper1);

        left2 = (Button) findViewById(R.id.button3);
        right2 = (Button) findViewById(R.id.button4);
        view2 = (ViewFlipper) findViewById(R.id.viewFlipper2);

        left3 = (Button) findViewById(R.id.button5);
        right3 = (Button) findViewById(R.id.button6);
        view3 = (ViewFlipper) findViewById(R.id.viewFlipper3);

        left1.setOnClickListener(this);
        right1.setOnClickListener(this);
        left2.setOnClickListener(this);
        right2.setOnClickListener(this);
        left3.setOnClickListener(this);
        right3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        if (v == right1) {

            view1.showNext();

        } else if (v == left1) {

            view1.showPrevious();
        }
        if (v == right2) {

            view2.showNext();

        } else if (v == left2) {

            view2.showPrevious();
        }
        if (v == right3) {

            view3.showNext();

        } else if (v == left3) {

            view3.showPrevious();
        }

    }
}

