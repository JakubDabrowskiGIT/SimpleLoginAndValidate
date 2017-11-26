package com.example.jakub.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        EditText loginET = findViewById(R.id.login);
        AlertDialog.Builder loginCheck = new AlertDialog.Builder(this);
        if (loginET.getText().length() < 7) {
            loginCheck.setMessage("Login must have more than 7 char");
            loginCheck.show();
        } else {
            int duration = Toast.LENGTH_SHORT;
            Context context = getApplicationContext();
            String text = "Login accepted";
            Toast toast = Toast.makeText(context, text, duration);
            if (goodPass(view)) {
                goodPass(view);
                return;
            } else {
                toast.show();
            }
        }
    }

    public void password(View view) {
        EditText passwordET = findViewById(R.id.password);
        AlertDialog.Builder loginCheck = new AlertDialog.Builder(this);
        if (passwordET.getText().length() < 4) {
            loginCheck.setMessage("Password must have more than 7 char");
            loginCheck.show();
        } else {
            int duration = Toast.LENGTH_SHORT;
            Context context = getApplicationContext();
            String text = "Password accepted";
            Toast toast = Toast.makeText(context, text, duration);
            if (goodPass(view)) {
                goodPass(view);
                return;
            } else {
                toast.show();
            }
        }
    }

    public boolean goodPass(View view) {
        EditText loginET = findViewById(R.id.login);
        EditText passwordET = findViewById(R.id.password);
        if (loginET.getText().length() > 7 && passwordET.getText().length() > 4) {
            AlertDialog.Builder goodPass = new AlertDialog.Builder(this);
            goodPass.setMessage("Hello \n" + "User " + loginET.getText());
            goodPass.show();
            return true;
        } else
            return false;
    }
}
