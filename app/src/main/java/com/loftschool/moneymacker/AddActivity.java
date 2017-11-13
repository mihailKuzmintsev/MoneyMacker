package com.loftschool.moneymacker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Objects;


public class AddActivity extends AppCompatActivity {

    public static final String EXTRA_TYPE = "type";
    public static final String RESULT_ITEM = "item";
    public static final int RC_ADD_ITEM = 99;
    private String type;
    private ImageButton addButton;
    private EditText titleEdit;
    private EditText priceEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        titleEdit = findViewById(R.id.name);
        priceEdit = findViewById(R.id.number);
        addButton = findViewById(R.id.add);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        type = getIntent().getStringExtra(EXTRA_TYPE);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent result = new Intent();
                String name = titleEdit.getText().toString();
                int price = (Objects.equals(priceEdit.getText().toString(), "")) ? 0 : Integer.valueOf(priceEdit.getText().toString());
                result.putExtra(RESULT_ITEM, new Item(name, price, type ));
                setResult(RESULT_OK, result);
                finish();
            }
        });

        titleEdit.addTextChangedListener(textWatcher);
        priceEdit.addTextChangedListener(textWatcher);
        addButton.setEnabled(false);
    }

    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            addButton.setEnabled(!TextUtils.isEmpty(titleEdit.getText()) && !TextUtils.isEmpty(priceEdit.getText()));
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
