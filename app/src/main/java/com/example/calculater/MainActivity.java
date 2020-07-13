package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
     TextView t1,t2;
     int si;
     Double fn;
     boolean ip=false;
     private char cp;
     String process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b10=(Button) findViewById(R.id.btn10);
        b11=(Button) findViewById(R.id.btn11);
        b12=(Button) findViewById(R.id.btn12);
        b13=(Button) findViewById(R.id.btn13);
        b14=(Button) findViewById(R.id.btn14);
        b15=(Button) findViewById(R.id.btn15);
        b16=(Button) findViewById(R.id.btn16);
        b17=(Button) findViewById(R.id.btn17);
        b18=(Button) findViewById(R.id.btn18);
        b19=(Button) findViewById(R.id.btn19);
        b20=(Button) findViewById(R.id.btn20);
        t1=(TextView) findViewById(R.id.tvinput);
        t2=(TextView) findViewById(R.id.tvoutput);
        final View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id){
                    case R.id.btn17:
                        t1.append("0");
                        break;
                    case R.id.btn13:
                        t1.append("1");
                        break;
                    case R.id.btn14:
                        t1.append("2");
                        break;
                    case R.id.btn15:
                        t1.append("3");
                        break;
                    case R.id.btn9:
                        t1.append("4");
                        break;
                    case R.id.btn10:
                        t1.append("5");
                        break;
                    case R.id.btn11:
                        t1.append("6");
                        break;
                    case R.id.btn5:
                        t1.append("7");
                        break;
                    case R.id.btn6:
                        t1.append("8");
                        break;
                    case R.id.btn7:
                        t1.append("9");
                        break;
                    case R.id.btn3:
                        String sc=t1.getText().toString();
                        si=sc.length() + 1;
                        fn=Double.parseDouble(sc);
                        t1.append("%");
                        ip=true;
                        cp='%';
                        break;
                    case R.id.btn12:
                        sc=t1.getText().toString();
                        si=sc.length() + 1;
                        fn=Double.parseDouble(sc);
                        t1.append("-");
                        ip=true;
                        cp='-';
                        break;
                    case R.id.btn4:
                        sc=t1.getText().toString();
                        si=sc.length() + 1;
                        fn=Double.parseDouble(sc);
                        t1.append("÷");
                        ip=true;
                        cp='÷';
                        break;
                    case R.id.btn8:
                        sc=t1.getText().toString();
                        si=sc.length() + 1;
                        fn=Double.parseDouble(sc);
                        t1.append("*");
                        ip=true;
                        cp='*';
                        break;
                    case R.id.btn16:
                        sc=t1.getText().toString();
                        si=sc.length() + 1;
                        fn=Double.parseDouble(sc);
                        t1.append("+");
                        ip=true;
                        cp='+';
                        break;
                    case R.id.btn20:
                        if(ip)
                        {
                            if(cp=='+')
                            {
                                sc=t1.getText().toString();
                                String sns = sc.substring(si,sc.length());
                                Double sn = Double.parseDouble(sns);
                                sn+=fn;
                                t2.setText(String.valueOf(sn));
                            }
                            if(cp=='÷')
                            {
                                sc=t1.getText().toString();
                                String sns = sc.substring(si,sc.length());
                                Double sn = Double.parseDouble(sns);

                                 if(sn==0)
                                 {
                                     t2.setText("0");
                                 }
                                 else {
                                     Double x;
                                     x = fn / sn;
                                     t2.setText(String.valueOf(x));
                                 }

                            }
                            if(cp=='%')
                            {
                                sc=t1.getText().toString();
                                String sns = sc.substring(si,sc.length());
                                Double sn = Double.parseDouble(sns);

                                if(sn==0)
                                {
                                    t2.setText("0");
                                }
                                else {
                                    Double x;
                                    x = (fn / sn)*100;
                                    t2.setText(String.valueOf(x));
                                }
                            }
                            if(cp=='-')
                            {
                                sc=t1.getText().toString();
                                String sns = sc.substring(si,sc.length());
                                Double sn = Double.parseDouble(sns);

                                    fn-=sn;
                                    t2.setText(String.valueOf(fn));

                            }
                            if(cp=='*')
                            {
                                sc=t1.getText().toString();
                                String sns = sc.substring(si,sc.length());
                                Double sn = Double.parseDouble(sns);
                                sn*=fn;
                                t2.setText(String.valueOf(sn));

                            }
                        }
                        break;
                    case R.id.btn19:
                        t1.setText(".");
                        break;
                    case R.id.btn18:
                        t1.append("00");
                        break;
                     default:
                         t2.setText("");
                         break;
                }
            }
        };
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);
        b4.setOnClickListener(cl);
        b5.setOnClickListener(cl);
        b6.setOnClickListener(cl);
        b7.setOnClickListener(cl);
        b8.setOnClickListener(cl);
        b9.setOnClickListener(cl);
        b10.setOnClickListener(cl);
        b11.setOnClickListener(cl);
        b12.setOnClickListener(cl);
        b13.setOnClickListener(cl);
        b14.setOnClickListener(cl);
        b15.setOnClickListener(cl);
        b16.setOnClickListener(cl);
        b17.setOnClickListener(cl);
        b18.setOnClickListener(cl);
        b19.setOnClickListener(cl);
        b20.setOnClickListener(cl);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String de= t1.getText().toString();
                int ln= de.length();
                if(ln>0)
                {
                    de=de.substring(0,ln-1);
                    t1.setText(de);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                t2.setText("");
            }
        });
    }
}
