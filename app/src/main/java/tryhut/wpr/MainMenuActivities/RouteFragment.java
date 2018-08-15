package tryhut.wpr.MainMenuActivities;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import tryhut.wpr.R;
import tryhut.wpr.RouteDetailsActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class RouteFragment extends Fragment {


    public RouteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView routeRecycler = (RecyclerView) inflater.inflate(
                R.layout.fragment_route, container, false);

        String[] routeNames = new String[Route.routes.length];
        for (int i = 0; i < routeNames.length; i++) {
            routeNames[i] = Route.routes[i].getName();
        }

        String[] routeKms = new String[Route.routes.length];
        for (int i = 0; i < routeKms.length; i++) {
            routeKms[i] = Route.routes[i].getKm();
        }

        String[] routeLevel = new String[Route.routes.length];
        for (int i = 0; i < routeLevel.length; i++) {
            routeLevel[i] = Route.routes[i].getLevel();
        }

        int[] routeImgs = new int[Route.routes.length];
        for (int i = 0; i < routeImgs.length; i++) {
            routeImgs[i] = Route.routes[i].getImageResourceId();
        }

        CaptionedImagesAdapter adapter =
                new CaptionedImagesAdapter(Route.routes);
        routeRecycler.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        routeRecycler.setLayoutManager(layoutManager);

        adapter.setListener(new CaptionedImagesAdapter.RouteListener() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), RouteDetailsActivity.class);
                intent.putExtra(RouteDetailsActivity.EXTRA_ROUTENO,position);
                getActivity().startActivity(intent);
            }
        });
        return routeRecycler;
    }

}
