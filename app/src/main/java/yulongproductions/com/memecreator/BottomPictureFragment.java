package yulongproductions.com.memecreator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {
    private TextView mTopText;
    private TextView mBottomText;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_image_fragment, container, false);

        mTopText = (TextView) view.findViewById(R.id.topText);
        mBottomText = (TextView) view.findViewById(R.id.bottomText);

        return view;
    }

    public void setMemeText(String top, String bottom) {
        mTopText.setText(top);
        mBottomText.setText(bottom);
    }
}
