package com.example.cap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LogoActivity extends Activity {

    class LogoSplash implements Runnable{
        @Override
        public void run() {

            //이곳에서 이동
            startActivity(new Intent(LogoActivity.this, MainActivity.class));
            LogoActivity.this.finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        Handler handle = new Handler();
        handle.postDelayed(new LogoSplash(), 3000);
    }
}
