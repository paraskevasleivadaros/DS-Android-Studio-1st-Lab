package com.example.p3150090.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        final ImageView iv = findViewById(R.id.imageView);

        iv.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View view){
                androidClick();
            }
        });
    }

    private void androidClick(){
        final AlertDialog.Builder alert = new AlertDialog.Builder(context.this);
        final EditText input = new EditText(this);
        alert.setView(input);
        alert.setPositiveButton("Change text", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                dialog.cancel();
            }
        });
        alert.show();
    }

    private void changeText(String value){
        // change text in textView1 to value and send a toast to let the user know that it changed
        TextView tv = findViewById(R.id.textView);
        tv.setText(value);

        Toast.makeText(getApplicationContext(), "Text changed!", Toast.LENGTH_SHORT).show();
    }

}



