package com.example.zjikojackz.mysqlapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        final TodoList editTodoList = (TodoList) getIntent().getSerializableExtra("editTodoList");
        final EditText editText = (EditText) findViewById(R.id.btnEditTask);
        editText.setText(editTodoList.getTaskname());

        final Button editBtn = (Button) findViewById(R.id.editText);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TodoList eTodoList = new TodoList();
                eTodoList.setTaskid(editTodoList.getTaskid());
                eTodoList.setTaskname(String.valueOf(editText.getText()));

                TodoListDAO todoListDAO = new TodoListDAO((getApplicationContext()));
                todoListDAO.open();
                todoListDAO.update(eTodoList);
                todoListDAO.close();
                finish();
            }
        });
    }
}



