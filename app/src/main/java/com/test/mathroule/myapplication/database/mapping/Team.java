package com.test.mathroule.myapplication.database.mapping;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "teams")
public class Team {

    @PrimaryKey
    @NonNull
    public String id;

    public String title;

    public Team(@NonNull String id, String title) {
        this.id = id;
        this.title = title;
    }
}
