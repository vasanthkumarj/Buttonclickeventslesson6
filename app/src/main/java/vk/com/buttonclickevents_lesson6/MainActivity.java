package vk.com.buttonclickevents_lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.on1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(),"clicked "+ button1.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }

    public void clickOne(View view) {
        button2 = (Button) view;
        Toast.makeText(getBaseContext(),"clicked "+ button2.getText().toString(),Toast.LENGTH_LONG).show();
    }
}
