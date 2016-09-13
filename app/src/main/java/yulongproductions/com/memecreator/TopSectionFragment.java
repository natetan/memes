package yulongproductions.com.memecreator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {
	private EditText topTextInput;
	private EditText bottomTextInput;

	TopSectionListener activityCommander;

	public interface TopSectionListener {
		public void createMeme(String top, String bottom);
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		try {
			activityCommander = (TopSectionListener) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString());
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
							 @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.top_section_fragment, container, false);

		topTextInput = (EditText) view.findViewById(R.id.memeLine1);
		bottomTextInput = (EditText) view.findViewById(R.id.memeLine2);
		final Button memeButton = (Button) view.findViewById(R.id.memeButton);
		memeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				activityCommander.createMeme(topTextInput.getText().toString(),
						bottomTextInput.getText().toString());
			}
		});

		return view;
	}
}