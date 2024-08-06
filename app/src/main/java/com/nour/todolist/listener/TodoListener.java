package com.nour.todolist.listener;


import com.nour.todolist.entities.Todo;

public interface TodoListener {
    void onTodoClicked(Todo todo, int position);
}