package controller;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.juanes.ejemplobd.R;

import model.DbHelper;
import model.ManagerDB;
import model.Persona;

public class MainActivity<resultado> extends AppCompatActivity {
    EditText edtNombre, edtApellido, edtEdad;
    Button btnEnviar;
    String nombre, apellido;
    int edad;

    //LLAMAR CONEXION

    DbHelper dbHelper;
    SQLiteDatabase bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtEdad = findViewById(R.id.edtEdad);
        btnEnviar = findViewById(R.id.btnEnviar);

        llamarconexion();

        dbHelper = new DbHelper(this);
        bd = dbHelper.getWritableDatabase();
        Toast.makeText(this, "Bd Creada", Toast.LENGTH_SHORT).show();
    }

    private void llamarconexion() {
    }

    private Persona;
    long resultado= ManagerDB.insertarDatos(Persona);
    if(resultado > 0){
        Toast.makeText(MainActivity.this,"Datos insertados correctamente",Toast.LENGTH_SHORT).show();
    }
    else{
        Toast.makeText(MainActivity.this,"Los datos no fueron insertados",Toast.LENGTH_SHORT).show();
    }

}

       /* btnEnviar.set {
            @Override
            public void onClick(View v) {
                nombre=edtNombre.getText().toString();
                apellido=edtApellido.getText().toString();
                edad=Integer.parseInt(edtEdad.getText().toString());

                //pasar la variable nombre,apellido,edad al pojo persona

                Persona estudiante =new Persona(nombre,apellido,edad);
                Toast.makeText(MainActivity.this, "El nombre es: " +estudiante.getNombre(), Toast.LENGTH_SHORT).show();
                estudiante.getNombre();

                Toast.makeText(MainActivity.this, "El apellido es: " +estudiante.getApellido(), Toast.LENGTH_SHORT).show();
                estudiante.getNombre();

                Toast.makeText(MainActivity.this, "La edad es: " +estudiante.getEdad(), Toast.LENGTH_SHORT).show();
                estudiante.getNombre();



            }
        });
    }*/

