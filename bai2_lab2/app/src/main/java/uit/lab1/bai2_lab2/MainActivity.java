package uit.lab1.bai2_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    TextView colorTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        colorTextView = findViewById(R.id.coloredTV);
        switch (radioGroup.getCheckedRadioButtonId())
        {
            case R.id.redBtn:
                colorTextView.setBackgroundColor(Color.parseColor("#ff0000"));
                break;
            case R.id.greenBtn:
                colorTextView.setBackgroundColor(Color.parseColor("#008000"));
                break;
            case R.id.grayBtn:
                colorTextView.setBackgroundColor(Color.parseColor("#808080"));
                break;
            case R.id.blueBtn:
                colorTextView.setBackgroundColor(Color.parseColor("#0000ff"));
                break;
        }
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup.getCheckedRadioButtonId())
                {
                    case R.id.redBtn:
                        colorTextView.setBackgroundColor(Color.parseColor("#ff0000"));
                        break;
                    case R.id.greenBtn:
                        colorTextView.setBackgroundColor(Color.parseColor("#008000"));
                        break;
                    case R.id.grayBtn:
                        colorTextView.setBackgroundColor(Color.parseColor("#808080"));
                        break;
                    case R.id.blueBtn:
                        colorTextView.setBackgroundColor(Color.parseColor("#0000ff"));
                        break;
                }
            }
        });

    }
}