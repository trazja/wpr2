package tryhut.wpr;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




public class TouristicInformationFragment extends Fragment {
  public TouristicInformationFragment(){

  }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView tiRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_touristic_information, container, false);

        String[] tiNames = new String[TouristicInformation.touristicInformations.length];
        for (int i = 0; i < tiNames.length; i++) {
            tiNames[i] = TouristicInformation.touristicInformations[i].getName();
        }

        String[] tiphoneNumber = new String[TouristicInformation.touristicInformations.length];
        for (int i = 0; i < tiphoneNumber.length; i++) {
            tiphoneNumber[i] = TouristicInformation.touristicInformations[i].getPhoneNumber();
        }

        String[] tiOpeningHours = new String[TouristicInformation.touristicInformations.length];
        for (int i = 0; i < tiOpeningHours.length; i++) {
            tiOpeningHours[i] = TouristicInformation.touristicInformations[i].getOpeningHours();
        }
        String[] tiAddress = new String[TouristicInformation.touristicInformations.length];
        for (int i = 0; i < tiAddress.length; i++) {
            tiAddress[i] = TouristicInformation.touristicInformations[i].getAddress();
        }
        String[] tiEmail = new String[TouristicInformation.touristicInformations.length];
        for (int i = 0; i < tiEmail.length; i++) {
            tiEmail[i] = TouristicInformation.touristicInformations[i].getEmail();
        }

        TouristInformationAdapter adapter =
                new TouristInformationAdapter(TouristicInformation.touristicInformations);
        tiRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        tiRecycler.setLayoutManager(layoutManager);
        return tiRecycler;
    }
}
