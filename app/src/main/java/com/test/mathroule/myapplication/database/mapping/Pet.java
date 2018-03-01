package com.test.mathroule.myapplication.database.mapping;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "pets",
        indices = {@Index(value = "user_id")},
        foreignKeys = @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "user_id", onDelete = CASCADE))
public class Pet {

    @PrimaryKey
    @NonNull
    public String id;

    @ColumnInfo(name = "user_id")
    @NonNull
    public String userId;

    public String quantity;

    public Pet(@NonNull String id, @NonNull String userId, String quantity) {
        this.id = id;
        this.userId = userId;
        this.quantity = quantity;
    }
}
