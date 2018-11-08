package com.example.admin.lab5;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content_fragment, new FirstFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main,menu);
    return super.onCreateOptionsMenu(menu);
}

@Override
public boolean onOptionsItemSelected(MenuItem item){
    switch (item.getItemId()){

            case R.id.menu_second:{
                replaceFtagment(new SecondFragment());
                return true;
            }
            case R.id.menu_third:{
                replaceFtagment(new ThirdFragment());
                return true; }
                default:{
                    return super.onOptionsItemSelected(item);
                }
    }
}
private void
replaceFtagment(Fragment fragment) {
    getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.content_fragment,fragment)
            .commit();
}
}

