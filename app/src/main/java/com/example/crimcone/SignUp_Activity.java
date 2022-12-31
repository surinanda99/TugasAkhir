package com.example.crimcone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp_Activity extends AppCompatActivity {

    EditText editUser, editNo, editEmail, editPass, editConfirm;
    Button btnRegister;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        editUser = findViewById(R.id.editTextTextPersonName2);
        editNo = findViewById(R.id.editTextPhone2);
        editEmail = findViewById(R.id.edtEmailRegister);
        editPass = findViewById(R.id.edtPasswordRegister);
        btnRegister = findViewById(R.id.Registrasi);
        editConfirm = findViewById(R.id.editTextConfirm);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register();
            }
        });
        mAuth = FirebaseAuth.getInstance();
    }
            public void register() {
                String username = editUser.getText().toString();
                String no = editNo.getText().toString();
                String Email = editEmail.getText().toString();
                String Password = editPass.getText().toString();
                String PasswordConf = editConfirm.getText().toString();

                if (Password.equals(PasswordConf)){
                    mAuth.createUserWithEmailAndPassword(Email, Password)
                                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if (task.isSuccessful()){
                                                FirebaseUser user = mAuth.getCurrentUser();
                                                Toast.makeText(SignUp_Activity.this, "Berhasil Register", Toast.LENGTH_SHORT).show();
                                                startActivity(new Intent(getApplicationContext(), MainActivity.class)
                                                        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                                            }else{
                                                Log.w("auth_error", "error registrasi" + task.getException());
                                            }
                                        }
                                    });

                }else {
                    Toast.makeText(this, "Password dan Konfirmasi tidak sama", Toast.LENGTH_LONG).show();
                }
            }

            public void toLogin(View view) { startActivity(new Intent(this, listmenu.class));}

}