package com.fametome.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {

    /* TABLE DU PROCESSUS D'INITIALISATION */
    private static final String INITIALISATION_ID = "INITIALISATION_ID";
    private static final String INITIALISATION_PROFIL = "INITIALISATION_PROFIL";
    private static final String INITIALISATION_ADD_FACE = "INITIALISATION_ADD_FACE";
    private static final String INITIALISATION_INBOX = "INITIALISATION_INBOX";
    private static final String INITIALISATION_OUTBOX = "INITIALISATION_OUTBOX";
    private static final String INITIALISATION_FRIENDS = "INITIALISATION_FRIENDS";
    private static final String INITIALISATION_FRIEND_SEARCH = "INITIALISATION_FRIEND_SEARCH";
    private static final String TABLE_INITIALISATION = "TABLE_INITIALISATION";
    private static final String CREATE_INITIALISATION =
            "CREATE TABLE " + TABLE_INITIALISATION + " (" +
                    INITIALISATION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    INITIALISATION_PROFIL + " INTEGER, " +
                    INITIALISATION_ADD_FACE + " INTEGER, " +
                    INITIALISATION_INBOX + " INTEGER, " +
                    INITIALISATION_OUTBOX + " INTEGER, " +
                    INITIALISATION_FRIENDS + " INTEGER, " +
                    INITIALISATION_FRIEND_SEARCH + " INTEGER);";

    private static final String DATABASE_NAME = "DATABASE_FAMETOME";
    private static final int DATABASE_VERSION = 1;

    public Database(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_INITIALISATION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CREATE_INITIALISATION);
    }

    public static String getInitialisation() {
        return TABLE_INITIALISATION;
    }

    public static String getInitialisationId() {
        return INITIALISATION_ID;
    }

    public static String getInitialisationProfil() {
        return INITIALISATION_PROFIL;
    }

    public static String getInitialisationAddFace() {
        return INITIALISATION_ADD_FACE;
    }

    public static String getInitialisationInbox() {
        return INITIALISATION_INBOX;
    }

    public static String getInitialisationOutbox() {
        return INITIALISATION_OUTBOX;
    }

    public static String getInitialisationFriends() {
        return INITIALISATION_FRIENDS;
    }

    public static String getInitialisationFriendSearch() {
        return INITIALISATION_FRIEND_SEARCH;
    }
}