package com.example.student7.joanna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_my)
public class MyActivity extends ActionBarActivity {

    @Click(R.id.lista)
        void startClicked(){

        startActivity(new Intent(this, lista_.class));
    }
@Click(R.id.zaloguj)
    void loginClicked(){

    startActivity(new Intent(this, zaloguj.class));
}

}