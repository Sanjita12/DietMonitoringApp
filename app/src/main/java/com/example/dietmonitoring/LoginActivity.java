package com.example.dietmonitoring;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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

public class LoginActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button loginBtn;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mAuth = FirebaseAuth.getInstance();

        email = (EditText)findViewById(R.id.Login_activity_email);
        password = (EditText)findViewById(R.id.Login_activity_password);
        loginBtn = (Button)findViewById(R.id.Login_activity_button);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString())
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d("TAG", "signInWithEmail:success");
//                                    FirebaseUser user = mAuth.getCurrentUser();
//                                    if (user != null) {
//                                        // Name, email address, and profile photo Url
//                                        String name = user.getDisplayName();
//                                        String email = user.getEmail();
//                                        Uri photoUrl = user.getPhotoUrl();
//
//                                        // Check if user's email is verified
//                                        boolean emailVerified = user.isEmailVerified();
//
//                                        // The user's ID, unique to the Firebase project. Do NOT use this value to
//                                        // authenticate with your backend server, if you have one. Use
//                                        // FirebaseUser.getIdToken() instead.
//                                        String uid = user.getUid();
//                                        Toast.makeText(LoginActivity.this, "welcome " + email,
//                                                Toast.LENGTH_SHORT).show();
//                                    }

                                    startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                                    finish();
//                                    updateUI(user);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w("TAG", "signInWithEmail:failure", task.getException());
                                    Toast.makeText(LoginActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
//                                    updateUI(null);
                                }

                                // ...
                            }
                        });
            }
        });

    }
}
