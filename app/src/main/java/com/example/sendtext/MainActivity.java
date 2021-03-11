package com.example.sendtext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendClick(View view) {

        EditText txtuser = (EditText)findViewById(R.id.editTextTextPersonName);
        Uri uri = Uri.parse(txtuser.getText().toString());
        Intent Send = new Intent(android.content.Intent.ACTION_SEND);
        String shareBody =txtuser.getText().toString();
        Send.setType("text/plain");
        Send.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);

        startActivity(Intent.createChooser(Send,shareBody));
    }
}