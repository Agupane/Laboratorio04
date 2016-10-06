package dam.isi.frsf.utn.edu.ar.laboratorio04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import dam.isi.frsf.utn.edu.ar.laboratorio04.modelo.Departamento;
import dam.isi.frsf.utn.edu.ar.laboratorio04.modelo.Reserva;

public class ListarReservasActivity extends AppCompatActivity {
    public static ArrayList<Reserva> listaReservas = new ArrayList<>();
    private ListView lvReservas;
    private ReservaAdapter reservaAdapter;
    private Intent intentListaDepartamentos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_reservas);

        reservaAdapter = new ReservaAdapter(ListarReservasActivity.this,listaReservas);
        lvReservas= (ListView ) findViewById(R.id.lvListaReservas);
        lvReservas.setAdapter(reservaAdapter);
    }

    //TODO implementar el onStart()

    @Override
    public void onBackPressed()
    {
        setResult(RESULT_CANCELED);
        super.onBackPressed();
        System.out.println("Tamaño: "+listaReservas.size());
    }
}
