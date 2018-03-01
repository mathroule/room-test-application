package com.test.mathroule.myapplication.database.mapping;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "users")
public class User {

    @PrimaryKey
    @NonNull
    public String id;

    public String name;

    // FIXME @ColumnInfo(name = "group_name")
    public String group;

    public User(@NonNull String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }
}
