package com.example.mymemolist20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class MemoSettings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo_settings);

        initListButton();
        initNewMemoButton();
    }

    //Method that initializes the List Image Button
    private void initListButton() {
        ImageButton ibList = findViewById(R.id.imageButtonList);
        ibList.setOnClickListener(v -> {
            Intent intent = new Intent(MemoSettings.this, MemoListActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }

    //Method that initializes the New Memo Image Button
    private void initNewMemoButton() {
        ImageButton ibNewMemo = findViewById(R.id.imageButtonNew);
        ibNewMemo.setOnClickListener(v -> {
            Intent intent = new Intent(MemoSettings.this, MemoActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }

}
