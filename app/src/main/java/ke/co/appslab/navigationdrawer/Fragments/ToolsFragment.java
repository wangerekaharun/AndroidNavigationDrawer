package ke.co.appslab.navigationdrawer.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ke.co.appslab.navigationdrawer.R;

/**
 * Created by harun on 1/10/18.
 */

public class ToolsFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tools_fragment, container, false);
        getActivity().setTitle("Tools");

        return view;
    }
}
