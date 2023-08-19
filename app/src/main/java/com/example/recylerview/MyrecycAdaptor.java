package com.example.recylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyrecycAdaptor extends RecyclerView.Adapter<MyrecycAdaptor.Myholder> {
    private ArrayList<Car> cars;
    //Adaptor 3 tane method oluşturdu.Bu 3 methodun içi dolu olması gerekiyor.
    //Adaptor recyclında override methodların dolu olması istenir .

    public MyrecycAdaptor(ArrayList<Car> cars) {
        this.cars = cars;
    }


    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //Bir pencere çagıracak yani görüntü oluşturacak.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item,parent,false);
        return new Myholder(view);
        //Oluşturulan bu pencereyi ve görüntüyü holderda tutmamız gerekiyor.
        // O yüzden returna null değil viewdan gönderir

    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        //Sayfanı içeriğini onBindViewHolderla göndermemiz gerekiyor.Oluşturulan görüntüler buraya atılır.
        holder.txtmodel.setText(cars.get(position).getModel());
        holder.txtmarka.setText(cars.get(position).getMarka());
        holder.imglogo.setImageResource(cars.get(position).getLogo());

    }

    @Override
    public int getItemCount() {
        return cars.size();
        //Araçlardan oluşturduğumuz sınıfın burda görülmesini istedik
    }

    public class Myholder extends RecyclerView.ViewHolder{
        TextView txtmodel ,txtmarka;
        ImageView imglogo;
        //car_item ile ilgili viewleri buraya çektik.


        public Myholder(@NonNull View itemView) {
            super(itemView);
            imglogo=itemView.findViewById(R.id.img_logo);
            txtmarka=itemView.findViewById(R.id.txt_marka);
            txtmodel=itemView.findViewById(R.id.txt_model);
        }
    }

}
