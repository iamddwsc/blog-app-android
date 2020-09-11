package com.doan3.greensocial.Activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.doan3.greensocial.Fragments.SignInFragment;
import com.doan3.greensocial.R;


public class AuthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameAuthContainer,new SignInFragment()).commit();
    }
}
