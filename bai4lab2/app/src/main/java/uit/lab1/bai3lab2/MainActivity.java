package uit.lab1.bai3lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button viewContactbtn;
    EditText nameEditText,emailEditText,projectEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText= findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        projectEditText = findViewById(R.id.projectEditText);
        viewContactbtn = findViewById(R.id.viewContactBtn);
        viewContactbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ViewContactInfoActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("nameKey",nameEditText.getText().toString());
                bundle.putString("emailKey",emailEditText.getText().toString());
                bundle.putString("projectKey",projectEditText.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}