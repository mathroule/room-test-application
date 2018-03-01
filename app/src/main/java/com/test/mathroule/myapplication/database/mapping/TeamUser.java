package com.test.mathroule.myapplication.database.mapping;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.support.annotation.NonNull;

@Entity(tableName = "team_users",
        indices = {
                @Index(value = "team_id"),
                @Index(value = "user_id")
        },
        primaryKeys = {"team_id", "user_id", "order"},
        foreignKeys = {
                @ForeignKey(entity = Team.class, parentColumns = "id", childColumns = "team_id"),
                @ForeignKey(entity = User.class, parentColumns = "id", childColumns = "user_id")})
public class TeamUser {

    @ColumnInfo(name = "team_id")
    @NonNull
    public String teamId;

    @ColumnInfo(name = "user_id")
    @NonNull
    public String userId;

    public int order;

    public TeamUser(@NonNull String teamId, @NonNull String userId, int order) {
        this.teamId = teamId;
        this.userId = userId;
        this.order = order;
    }
}
