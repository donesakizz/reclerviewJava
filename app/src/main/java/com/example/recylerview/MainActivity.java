package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView benimrecyc;
    //Aşagı kodda bir arraylist oluşturulur.
    private ArrayList<Car>cars;
    //Adaptör çağrılır,oluşturulur
    private MyrecycAdaptor myadaptor ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        benimrecyc =findViewById(R.id.myrecyc);
        cars = new ArrayList<>();//Arraylist oluşturuldu
        myadaptor = new MyrecycAdaptor(cars);
        benimrecyc.setAdapter(myadaptor);
        benimrecyc.setLayoutManager(new LinearLayoutManager(this));
        diziolustur();
        myadaptor.notifyDataSetChanged();

    }


    //Araçlarımızı ekleyebileceğimiz bir method oluşturduk.
    private void diziolustur() {//**37.dkda resimleri drawable içine copy_paste yaptı
        cars.add(new Car(R.drawable.audi,"Audi","A3"));
        cars.add(new Car(R.drawable.audi,"Audi","A4"));
        cars.add(new Car(R.drawable.audi,"Audi","A5"));
        cars.add(new Car(R.drawable.bmv,"BMV","3.18"));
        cars.add(new Car(R.drawable.bmv,"BMV","5.18"));
        cars.add(new Car(R.drawable.mercedes,"Mercedes","CLK"));
        cars.add(new Car(R.drawable.mercedes,"Mercedes","AMG"));
        cars.add(new Car(R.drawable.bmv,"BMV","7.18"));
    }


}