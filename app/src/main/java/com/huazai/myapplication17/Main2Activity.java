package com.huazai.myapplication17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Intent it=new Intent();
        it.putExtra("bbbb","没什么看的，都叫你不要看！");
        setResult(RESULT_OK,it);
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final TextView tv1=(TextView)findViewById(R.id.textView1);
        Intent intent=getIntent();
        String aaaa=intent.getStringExtra("aaaa");
        tv1.setText(aaaa);
        final Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("bbbb", "没什么看的，都叫你不要看");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}

