package cn.zyh.common;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    /*
    * 在调用此方法之后可以调用一下代码以确保进城被杀死
    * android.os.Process.killProcess(android.os.Process.myPid());
    * 其中，killProcess()方法用于杀掉一个进程，它接收一个进程id，可以通过myPid()方法获取当前程序的进程id
    * */
    public static void finishAll(){
        for(Activity activity:activities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
