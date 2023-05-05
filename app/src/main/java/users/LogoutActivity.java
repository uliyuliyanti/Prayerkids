package users;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prayerkids.MainActivity;
import com.example.prayerkids.R;

public class LogoutActivity extends AppCompatActivity {

    ActionBar actionBar;

    private Button btnlogout = (Button) findViewById(R.id.btnlogout);

    @Override
    public boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogoutActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    public void pindah(View view) {
            Intent intent = new Intent(LogoutActivity.this, LoginActivity.class);
            startActivity(intent);
        }
    }