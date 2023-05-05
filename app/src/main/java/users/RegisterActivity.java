package users;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.prayerkids.R;

public class RegisterActivity extends AppCompatActivity {

    EditText etusername2, etname, etemail, ettlp, etpassword2;
    Button btndaftar2, btnlogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}