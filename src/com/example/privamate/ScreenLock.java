package com.example.privamate;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.*;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by prasad on 9/26/14.
 */
public class ScreenLock extends Activity {

    TextView t1;
    String pass1 = "4321",entered="";
    int cnt=0,attempt_cnt=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TableLayout tb= (TableLayout)findViewById(R.id.table1);
        final WallpaperManager wm = WallpaperManager.getInstance(this);
        final Drawable wd = wm.getDrawable();
        tb.setBackground(wd);
     /*   try {
            startService(new Intent(this, BackProcess.class));
        }
        catch(Exception e){}*/


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
    }



    @Override
    public void onBackPressed() {

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode==event.KEYCODE_HOME)
            return false;
        if(keyCode==event.KEYCODE_MENU)
            return false;
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void clickIt1(View view) {
        entered = entered + "1";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt2(View view) {
        entered = entered + "2";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt3(View view) {
        entered = entered + "3";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt4(View view) {
        entered = entered + "4";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt5(View view) {
        entered = entered + "5";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt6(View view) {
        entered = entered + "6";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt7(View view) {
        entered = entered + "7";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt8(View view) {
        entered = entered + "8";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt9(View view) {
        entered = entered + "9";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickIt0(View view) {
        entered = entered + "9";
        cnt++;
        if(cnt==4)
            clickItOk(view);
    }
    public void clickItOk(View view) {

        if(entered.equals(pass1))
        {
            attempt_cnt=0;
            Toast.makeText(this,"Unlocked",Toast.LENGTH_SHORT).show();
            finish();

        }
        else
        {
            attempt_cnt++;
            Toast.makeText(this,"Password is incorrect"+(5-attempt_cnt),Toast.LENGTH_SHORT).show();
            if(attempt_cnt>4)
            {
                attempt_cnt=0;
                Toast.makeText(this,"Redirect to email authentication",Toast.LENGTH_SHORT).show();
            }
        }
        entered="";cnt=0;
    }
    public void clickItx(View view) {
        if(cnt>0)
        {
            cnt--;
            String temp=entered.substring(0,cnt);
            entered=temp;
        }
    }
    public void clickItDel(View view) {
        entered="";
        cnt=0;
    }
}



