package com.example.a21_19525901_dinhthiphuongthao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login02 extends AppCompatActivity {
    private EditText edtEmail, edtPass;
    private ImageButton btnLogin;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login02);

        edtEmail = findViewById(R.id.edtEmail_login2);
        edtPass = findViewById(R.id.edtpass_login2);

        btnLogin = findViewById(R.id.btnlogin2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();


            }

        });


    }
    private void login() {
        String email= edtEmail.getText().toString();
        String pass= edtPass.getText().toString();

        mAuth=FirebaseAuth.getInstance();
        mAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Login02.this, "Dang nhap thanh cong", Toast.LENGTH_SHORT).show();
                    edtEmail.setText("");
                    edtPass.setText("");
                    Intent intent= new Intent(Login02.this, Product.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login02.this, "Dang nhap khong thanh cong", Toast.LENGTH_SHORT).show();

                }
            }

        });

    }


}