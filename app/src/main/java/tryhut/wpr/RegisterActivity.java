package tryhut.wpr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText nameText = (EditText) findViewById(R.id.nameText);
        final EditText lastNameText = (EditText) findViewById(R.id.lastNameText);
        final EditText userName = (EditText) findViewById(R.id.userName);
        final EditText emailText = (EditText) findViewById(R.id.emailText);
        final EditText passwordRegisterText = (EditText) findViewById(R.id.passwordRegisterText);
        final EditText confirmPassword = (EditText) findViewById(R.id.confirmPassword);

        Button registerButton = (Button) findViewById(R.id.registerButton);


        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = nameText.getText().toString();
                String s2 = lastNameText.getText().toString();
                String s3 = userName.getText().toString();
                String s4 = emailText.getText().toString();
                String s5 = passwordRegisterText.getText().toString();
                String s6 = confirmPassword.getText().toString();

                if(!s5.equals(s6)){
                    Toast pass = Toast.makeText(RegisterActivity.this, "Hasła nie są identyczne!", Toast.LENGTH_SHORT);
                    pass.show();
                }else {
                    //insert
                    Contact u = new Contact ();
                    u.setName(s1);
                    u.setLastName(s2);
                    u.setUserName(s3);
                    u.setEmail(s4);
                    u.setPassword(s5);

                    helper.insertContact(u);
                }

                 }
        });
    }


}