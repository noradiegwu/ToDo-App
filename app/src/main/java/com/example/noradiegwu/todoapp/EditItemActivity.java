package com.example.noradiegwu.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText etEditedTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String itemToEdit = getIntent().getStringExtra("itemToEdit");
        etEditedTask =  (EditText) findViewById(R.id.etEditTask);
        etEditedTask.setText(itemToEdit);
    }


    public void onEditItem(View view) {
        String newEdit = etEditedTask.getText().toString();
        int position = getIntent().getIntExtra("position", 0);
        Intent data = new Intent();
        data.putExtra("itemToEdit", newEdit);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }

}
