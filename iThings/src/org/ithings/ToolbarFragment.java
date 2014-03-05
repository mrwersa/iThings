/**
 * 
 */
package org.ithings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Saeed Aghaee
 *
 */
public class ToolbarFragment extends Fragment {

    public ToolbarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_toolbar, container, false);
        return rootView;
    }
}