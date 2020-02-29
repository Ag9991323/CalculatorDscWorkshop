package com.example.dsc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getApplicationContext()," I m in OnCreate activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onCreate Activity 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext()," I m in OnRestart activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onRestart Activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext()," I m in OnStop activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onStop activity 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext()," I m in OnResume activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onResume activity 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext()," I m in OnStart activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onStart activity 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext()," I m in OnDestroy activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onDestroy activity 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext()," I m in OnPause activity 2",Toast.LENGTH_SHORT).show();
        Log.d("error","onPause activity 2");
    }
}
