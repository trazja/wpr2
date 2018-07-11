package tryhut.wpr;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.Manifest.permission.READ_CONTACTS;


public class LoginActivity extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText userName = (EditText) findViewById(R.id.login);
        final EditText userPassword = (EditText) findViewById(R.id.loginPassword);
        final TextView registerLink = (TextView) findViewById(R.id.registerLink);

        Button loginButton = (Button) findViewById(R.id.loginButton);


        //dodanie napisu "Zarejestruj się" jako aktywnego linku, który przekierwouje do okna logowania

        registerLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);

            }

        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String login = userName.getText().toString();
                final String password = userPassword.getText().toString();

                String pass = helper.searchPass(login);
                if (password.equals(pass)) {

                    Intent mainIntent = new Intent(LoginActivity.this, SelectNavigationOrGuideActivity.class);
                    mainIntent.putExtra("Użytkownik", login);
                    LoginActivity.this.startActivity(mainIntent);
                }
                else
                {
                    Toast temp = Toast.makeText(LoginActivity.this, "Username and password don't match!", Toast.LENGTH_SHORT );
                    temp.show();
                }
            }
        });
    }
}

