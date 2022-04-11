package uit.lab1.bai3lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ViewContactInfoActivity extends AppCompatActivity {
    Button finishBtn;
    TextView nameTV,emailTV,projectTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contact_info);

        finishBtn = findViewById(R.id.finishBtn);
        nameTV = findViewById(R.id.nameTV);
        emailTV = findViewById(R.id.emailTV);
        projectTV = findViewById(R.id.projectTV);
        Bundle bundle = getIntent().getExtras();
        nameTV.setText(bundle.getString("nameKey"));
        emailTV.setText(bundle.getString("emailKey"));
        projectTV.setText(bundle.getString("projectKey"));
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewContactInfoActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}