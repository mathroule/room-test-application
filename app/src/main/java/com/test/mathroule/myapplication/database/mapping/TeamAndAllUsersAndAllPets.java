package com.test.mathroule.myapplication.database.mapping;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class TeamAndAllUsersAndAllPets {

    @Embedded
    public TeamUser teamUser;

    @Relation(parentColumn = "user_id", entityColumn = "id", entity = User.class)
    public List<UserAndAllPets> userAndAllPets;
}
