package com.example.cy.hello;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditTextActivity extends /*AppCompatActivity*/Activity {

    private EditText mEtuserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        mEtuserName=findViewById(R.id.et_1);
        mEtuserName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    //监听事件 在文字改变当中
                Log.d("监听edittext",s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
    public void showToast(View view){
        Toast.makeText(this,"登录成功！",Toast.LENGTH_SHORT).show();
    }

}
