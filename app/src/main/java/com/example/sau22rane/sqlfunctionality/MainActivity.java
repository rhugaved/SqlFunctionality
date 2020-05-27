    package com.example.sau22rane.sqlfunctionality;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

        EditText Username;
        Button Continue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (EditText) findViewById(R.id.username);
        Continue = (Button) findViewById(R.id.Continue);
        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Budget_activity.class);
                Bundle mBundle = new Bundle();
                mBundle.putString("username",Username.getText().toString());
                i.putExtras(mBundle);
                startActivity(i);
            }
        });
    }
}
