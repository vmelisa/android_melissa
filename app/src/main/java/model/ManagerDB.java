package model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ManagerDB {
    DbHelper dbHelper;
    SQLiteDatabase db;

    public ManagerDB(Context context){
        dbHelper= new DbHelper(context);
    }

    public void openDbWriteModel(){
        db = dbHelper.getWritableDatabase();
    }

    public void openBdReadModel(){
        db =dbHelper.getReadableDatabase();
    }

    public void closeDb(){
        if (db !=null){
            db.close();
        }
    }

    public static long insertarDatos(Persona persona){
        ContentValues valores = new ContentValues();
        valores.put("nombre",persona.getNombre());
        valores.put("apellido",persona.getApellido());
        valores.put("edad",persona.getEdad());
        long resultado = db.insert("Datos",null,valores);
        //closeDb();
        return resultado;
    }

    public ArrayList<Abogados> ListarDatos(){
        openDbWriteModel();
        ArrayList arrayList = new ArrayList<Abogado>();

    }








}
