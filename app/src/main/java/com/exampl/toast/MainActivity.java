package com.exampl.toast;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn,btn2,btn3;
TextView msg,result;
EditText first,second;
    String sign;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.click);
        msg=findViewById(R.id.message);
        btn2=findViewById(R.id.calculate);
        result=findViewById(R.id.result);
        first=findViewById(R.id.editTextNumber);
        second=findViewById(R.id.editTextNumber2);
        btn3=findViewById(R.id.button2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign="+";
                a=Integer.parseInt(first.getText().toString());
                first.setText("");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  int a=Integer.parseInt(first.getText().toString());
                int b=Integer.parseInt(second.getText().toString());
                int sum=a+b;
                result.setText(sum+"");
                first.setText("");
                second.setText("");
*/

                 b=Integer.parseInt(first.getText().toString());

              if(sign.equals("+"))
              {
                  first.setText((a+b)+"");
              }



            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome in Android Development",Toast.LENGTH_LONG).show();
                msg.setText("Welcome Mr Arjun");
            }
        });

    }
}