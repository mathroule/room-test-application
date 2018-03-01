package com.test.mathroule.myapplication.database.mapping;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import java.util.List;

public class UserAndAllPets {

    @Embedded
    public User user;

    @Relation(parentColumn = "id", entityColumn = "user_id", entity = Pet.class)
    public List<Pet> pets;
}
