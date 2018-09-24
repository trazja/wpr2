package tryhut.wpr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import tryhut.wpr.MainMenuActivities.MapsActivity;

/**
 * Created by tryhu on 2018-08-19.
 */

public class ServicesAdapter extends RecyclerView.Adapter<ServicesAdapter.ViewHolder> {

    private Service[] services;
    private Context mcontext;

    public ServicesAdapter(Service[] services1,Context mcontext) {
        this.services = services1;
        this.mcontext = mcontext;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView serviceName;
        private TextView servicePhoneNumbers;
        private TextView serviceOpeningHours;
        private TextView serviceAddresses;
        private CardView cardView;
        private Button servicebutton;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
            serviceName = (TextView) cardView.findViewById(R.id.service_name);
            servicePhoneNumbers = (TextView) cardView.findViewById(R.id.service_phonenumber);
            serviceOpeningHours = (TextView) cardView.findViewById(R.id.service_openinghours);
            serviceAddresses = (TextView) cardView.findViewById(R.id.service_addressess);
            servicebutton = (Button) cardView.findViewById(R.id.show_on_map_button_service);
        }
    }

    @Override
    public ServicesAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_services, parent, false);
        return new ServicesAdapter.ViewHolder(cv);

    }

    @Override
    public void onBindViewHolder(ServicesAdapter.ViewHolder holder, final int position) {
        Service service = services[position];
        CardView cardView = holder.cardView;
        Button servicebutton = holder.servicebutton;
        holder.serviceName.setText(service.getName());
        holder.servicePhoneNumbers.setText(service.getPhoneNumber());
        holder.serviceAddresses.setText(service.getAddress());
        holder.serviceOpeningHours.setText(service.getOpeningHours());


        holder.servicebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               v.getContext().startActivity(new Intent(mcontext,MapsActivity.class));
            }
        });
    }



    @Override
    public int getItemCount() {
        return services.length;
    }


}
