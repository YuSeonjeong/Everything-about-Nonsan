package com.example.cjsrn.myapplication;

import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Ser12Activity extends AppCompatActivity {
    EditText    mDateDisplay;
    EditText    mDateDisplay2;
    ImageButton      b1;
    ImageButton      b2;
    int         mYear;
    int         mMonth;
    int         mDay;
    int         mYear2;
    int         mMonth2;
    int         mDay2;
    Button btn;
    EditText name, phone, people;
    final int DATE_DIALOG_ID = 1;
    final int DATE_DIALOG_ID2 = 2;
    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ser12);

        mDateDisplay = (EditText)findViewById(R.id.fdate);
        mDateDisplay2 = (EditText)findViewById(R.id.edate);
        b1 = (ImageButton) findViewById(R.id.btn1);
        b2 = (ImageButton) findViewById(R.id.btn2);

        mDateDisplay.setCursorVisible(false);
        mDateDisplay2.setCursorVisible(false);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText phone = (EditText) findViewById(R.id.phone);
        final EditText people = (EditText) findViewById(R.id.people);
        Button btn = (Button) findViewById(R.id.btn);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID); // 날짜 설정 다이얼로그 띄우기
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID2);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() { // ImageButton을 Click시 AlertDialog가 생성되도록 아래과 같이 설계
            @Override
            public void onClick(View v) {


                AlertDialog.Builder builder = new AlertDialog.Builder(Ser12Activity.this); // AlertDialog를 띄울 activity를 argument로 지정해야 한다.
                builder.setTitle("입력 정보 확인");

                builder.setMessage("이름 : "+name.getText()+"\n"+"연락처 : "+phone.getText()+"\n"+"인원수 : "+people.getText()+"\n\n"+"입력하신 정보가 맞습니까?");


                // AlertDialog.builder를 통해 Title text를 입력

                builder.setPositiveButton("네", new DialogInterface.OnClickListener() { // AlertDialog.Builder에 Positive Button을 생성
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "신청이 완료되었습니다. ",Toast.LENGTH_SHORT).show();
                        finish();  // App.의 종료. Activity 생애 주기 참고

                    }
                });
                builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() { // AlertDialog.Builder에 Negative Button을 생성
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss(); // "아니오" button이 받은 DialogInterface를 dismiss 하여 MainView로 돌아감
                    }
                });
                AlertDialog dialog = builder.create(); // 위의 builder를 생성할 AlertDialog 객체 생성
                dialog.show(); // dialog를 화면에 뿌려 줌
            }
        });
    }

    @Override
    @Deprecated
    protected Dialog onCreateDialog(int id) {
        switch(id){
            case DATE_DIALOG_ID :
                DatePickerDialog dpd = new DatePickerDialog
                        (Ser12Activity.this, // 현재화면의 제어권자
                                new DatePickerDialog.OnDateSetListener() {
                                    public void onDateSet(DatePicker view,
                                                          int year, int monthOfYear,int dayOfMonth) {

                                        mDateDisplay.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);
                                    }
                                }
                                , // 사용자가 날짜설정 후 다이얼로그 빠져나올때
                                //    호출할 리스너 등록
                                2016, 11, 14); // 기본값 연월일
                return dpd;
            case  DATE_DIALOG_ID2 :
                DatePickerDialog dpd2 = new DatePickerDialog
                        (Ser12Activity.this, // 현재화면의 제어권자
                                new DatePickerDialog.OnDateSetListener() {
                                    public void onDateSet(DatePicker view,
                                                          int year2, int monthOfYear2,int dayOfMonth2) {
                                        mDateDisplay2.setText(year2+"-"+(monthOfYear2+1)+"-"+dayOfMonth2);
                                    }
                                }
                                , // 사용자가 날짜설정 후 다이얼로그 빠져나올때
                                //    호출할 리스너 등록
                                2016, 11, 15); // 기본값 연월일
                return dpd2;
        }


        return super.onCreateDialog(id);
    }
} // end of class





