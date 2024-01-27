package com.example.workshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlinear);
        tv = findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mFile:
                Toast.makeText(this,"Text",Toast.LENGTH_LONG).show();
            case R.id.mExit:
                System.exit(0);
            case R.id.mEmail:
                Toast.makeText(this,"Email",Toast.LENGTH_LONG).show();
            case R.id.mPhone:
                Toast.makeText(this,"Phone",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.color_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nRed: tv.setTextColor(Color.RED);
                            break;

            case R.id.nBlue: tv.setTextColor(Color.BLUE);
                            break;
            case R.id.nGreen: tv.setTextColor(Color.GREEN);
                            break;
        }
        return super.onContextItemSelected(item);
    }
}