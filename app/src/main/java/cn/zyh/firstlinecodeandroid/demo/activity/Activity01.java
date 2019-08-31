package cn.zyh.firstlinecodeandroid.demo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import cn.zyh.common.CActivity;
import cn.zyh.firstlinecodeandroid.R;

public class Activity01 extends CActivity {
    private static final String TAG = "Activity01";
    private Button startNormalActivity,startDialogActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01);
        Log.d(TAG,"onCreate");
        startNormalActivity=findViewById(R.id.btn1);
        startDialogActivity=findViewById(R.id.btn2);
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity01.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity01.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    //活动启动方法
    public static void startMe(Context context){
        Intent intent=new Intent(context,Activity01.class);
        context.startActivity(intent);
    }
}
