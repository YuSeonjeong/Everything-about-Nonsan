package com.example.cjsrn.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.util.Calendar;
import android.icu.util.GregorianCalendar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Conf1_2Activity extends AppCompatActivity {

    Button btn;
    EditText name, phone;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conf1_2);

        final Spinner spinner = (Spinner)findViewById(R.id.spinner1);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText phone = (EditText) findViewById(R.id.phone);
        final DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker);


        datePicker.init(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(),new DatePicker.OnDateChangedListener(){

            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int day) {

                String msg = String.format("%d / %d/ %d", year, month+1, day);
                Toast.makeText(Conf1_2Activity.this,msg, Toast.LENGTH_SHORT).show();
            }});



        ArrayAdapter adapter = ArrayAdapter.createFromResource
                (this, R.array.room,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() { // ImageButton을 Click시 AlertDialog가 생성되도록 아래과 같이 설계
            @Override
            public void onClick(View v) {

                String result = String.format("%d년 %d월 %d일", datePicker.getYear(), datePicker.getMonth()+1, datePicker.getDayOfMonth());

                AlertDialog.Builder builder = new AlertDialog.Builder(Conf1_2Activity.this); // AlertDialog를 띄울 activity를 argument로 지정해야 한다.
                builder.setTitle("입력 정보 확인");



                builder.setMessage("날짜 : "+result+"\n"+"방 : "+spinner.getSelectedItem()+"\n"+"이름 : "+name.getText()+"\n"+"연락처 : "+phone.getText()+"\n\n"+"입력하신 정보가 맞습니까?");


                // AlertDialog.builder를 통해 Title text를 입력

                builder.setPositiveButton("네", new DialogInterface.OnClickListener() { // AlertDialog.Builder에 Positive Button을 생성
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(), "신청이 완료되었습니다. ",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                        //finish();  // App.의 종료. Activity 생애 주기 참고

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
}
