package cn.zyh.firstlinecodeandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.LinkedList;

import cn.zyh.common.CActivity;
import cn.zyh.firstlinecodeandroid.demo.activity.Activity01;

public class MainActivity extends CActivity {

    private static final String[] strList = {"活动生命周期",
            "2",
            "3",
            "4",
            "5",
            "6"};
    private static final int total = strList.length - 1;
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);

        LinkedList<String> mListItems = new LinkedList<String>();
        mListItems.addAll(Arrays.asList(strList));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mListItems);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, Activity01.class);
                    startActivity(intent);
                }else if(position == 1){
                    Log.i("aaa","123456");
                }else{
                    Log.i("aaa","123456789");
                }
            }
        });
    }
}
