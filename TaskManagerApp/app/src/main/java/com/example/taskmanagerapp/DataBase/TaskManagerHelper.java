package com.example.taskmanagerapp.DataBase;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.taskmanagerapp.DataBase.TaskManagerSchema.TASK.taskColumns;
import com.example.taskmanagerapp.DataBase.TaskManagerSchema.User.userColumns;
import com.example.taskmanagerapp.Model.Task;

import androidx.annotation.Nullable;

public class TaskManagerHelper extends SQLiteOpenHelper {
    public TaskManagerHelper(@Nullable Context context) {
        super(context, TaskManagerSchema.NAME, null, TaskManagerSchema.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder queryTask=new StringBuilder();
        queryTask.append("CREATE TABLE "+TaskManagerSchema.TASK.NAME+" (");
        queryTask.append(taskColumns.ID+" TEXT NOT NULL ,");
        queryTask.append(taskColumns.TITLE+" TEXT, ");
        queryTask.append(taskColumns.USERID+" TEXT NOT NULL");
        queryTask.append(taskColumns.DESCRIPTION+" TEXT, ");
        queryTask.append(taskColumns.STATE+" TEXT, ");
        queryTask.append(taskColumns.DATE+" TEXT, ");
        queryTask.append(taskColumns.TIME+" TEXT, ");
        queryTask.append(" ); ");
        db.execSQL(queryTask.toString());


        StringBuilder queryUser=new StringBuilder();
        queryUser.append("CREATE TABLE "+TaskManagerSchema.User.NAME+" (");
        queryUser.append(TaskManagerSchema.User.userColumns.USERNAME+ " TEXT NOT NULL ,");
        queryUser.append(userColumns.PASSWORD+" TEXT NOT NULL ,");
        queryUser.append(userColumns.ID+" TEXT NOT NULL ,");
        queryUser.append(userColumns.UUID+" TEXT, ");
        queryUser.append(userColumns.ISADMINE+" INTEGER, ");
        queryUser.append(userColumns.MEMBERSHIP+" TEXT, ");
        queryUser.append(" ); ");
        db.execSQL(queryUser.toString());



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
