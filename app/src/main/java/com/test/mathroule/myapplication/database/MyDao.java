package com.test.mathroule.myapplication.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import com.test.mathroule.myapplication.database.mapping.TeamAndAllUsersAndAllPets;
import com.test.mathroule.myapplication.database.mapping.UserAndAllPets;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface MyDao {

    @Transaction
    @Query("SELECT * FROM users ORDER BY name ASC")
    Flowable<List<UserAndAllPets>> getUserAndAllPets();

    @Transaction
    @Query("SELECT * FROM team_users WHERE team_id = :teamId ORDER BY `order` DESC")
    Flowable<List<TeamAndAllUsersAndAllPets>> getTeamAndAllUsersAndAllPets(String teamId);
}
