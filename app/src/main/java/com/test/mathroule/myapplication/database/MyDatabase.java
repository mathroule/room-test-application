package com.test.mathroule.myapplication.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.test.mathroule.myapplication.database.mapping.Pet;
import com.test.mathroule.myapplication.database.mapping.Team;
import com.test.mathroule.myapplication.database.mapping.TeamUser;
import com.test.mathroule.myapplication.database.mapping.User;

@Database(entities = {User.class, Pet.class, Team.class, TeamUser.class}, exportSchema = false, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    private static volatile MyDatabase INSTANCE;

    public abstract MyDao dao();

    public static MyDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (MyDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, "my_database.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }

        return INSTANCE;
    }
}
