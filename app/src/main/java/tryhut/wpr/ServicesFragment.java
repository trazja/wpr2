package tryhut.wpr;


import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ServicesFragment extends Fragment {


    public ServicesFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView serviceRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_services, container, false);

        String[] serviceNames = new String[Service.services.length];
        for (int i = 0; i < serviceNames.length; i++) {
            serviceNames[i] = Service.services[i].getName();
        }

        String[] servicePhoneNumber = new String[Service.services.length];
        for (int i = 0; i < servicePhoneNumber.length; i++) {
            servicePhoneNumber[i] = Service.services[i].getPhoneNumber();
        }

        String[] serviceOpeningHours = new String[Service.services.length];
        for (int i = 0; i < serviceOpeningHours.length; i++) {
            serviceOpeningHours[i] = Service.services[i].getOpeningHours();
        }
        String[] serviceAddress = new String[Service.services.length];
        for (int i = 0; i < serviceAddress.length; i++) {
            serviceAddress[i] = Service.services[i].getAddress();
        }


        ServicesAdapter adapter =
                new ServicesAdapter(Service.services, getContext());
        serviceRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        serviceRecycler.setLayoutManager(layoutManager);
        return serviceRecycler;
    }



}
