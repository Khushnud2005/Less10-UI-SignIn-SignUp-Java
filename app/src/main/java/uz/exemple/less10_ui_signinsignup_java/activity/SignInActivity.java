package uz.exemple.less10_ui_signinsignup_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import uz.exemple.less10_ui_signinsignup_java.R;

public class SignInActivity extends AppCompatActivity {
    EditText et_email,et_password;
    TextView tv_signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initViews();
    }
    void initViews(){
        et_email = findViewById(R.id.et_emailSi);
        et_password = findViewById(R.id.et_passwordSi);
        tv_signUp = findViewById(R.id.tv_signup);
        Button btn_signIn = findViewById(R.id.btn_signIn);
        btn_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        tv_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUpActivity();
            }
        });

    }

    void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    void openSignUpActivity(){
        Intent intent = new Intent(this,SignUpActivity.class);
        startActivity(intent);
    }
}