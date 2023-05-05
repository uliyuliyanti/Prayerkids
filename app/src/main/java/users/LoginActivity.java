package users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.prayerkids.MainActivity;
import com.example.prayerkids.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etusername = findViewById(R.id.etusername), etpassword = findViewById(R.id.etpassword);
    private Button btnlogin, btndaftar;

    private String username = "admin";
    private String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btndaftar   =(Button) findViewById(R.id.btndaftar);
        btnlogin    =(Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etusername.getText().toString().equalsIgnoreCase(username) && etpassword.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(login);

                    Toast.makeText(LoginActivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                }
                if (etusername.isEnabled()){
                    Toast.makeText(LoginActivity.this, "Username Harus diisi", Toast.LENGTH_SHORT).show();
                }
                if (etpassword.isEnabled()){
                    Toast.makeText(LoginActivity.this, "Password Harus diisi", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Username atau Password yang anda masukkan salah !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}