package org.upesacm.diversionapp.questions;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.upesacm.diversionapp.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class Question82 extends SupportBlurDialogFragment {
    Question82Callback question82Callback;
    TextView question, hint;
    EditText answer;
    ImageView ques_image1;
    private final String CORRECT_ANSWER = "";
    private final String HINT1 = "";
    private boolean hint_1_used;
    private boolean hint_2_used;
    private final String HINT2 = "";
    private int score;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image_type, container, false);
        setCancelable(false);
        question = view.findViewById(R.id.question);
        ques_image1 = view.findViewById(R.id.ques_image1);
        answer = view.findViewById(R.id.answer);
        hint = view.findViewById(R.id.hint);
        view.findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer.getText().toString().equalsIgnoreCase(CORRECT_ANSWER)) {
                    if (hint_2_used) {
                        score = 10;
                        question82Callback.question82(score);
                        dismiss();
                    } else if (hint_1_used) {
                        score = 20;
                        question82Callback.question82(score);
                        dismiss();
                    } else {
                        score = 30;
                        question82Callback.question82(score);
                        dismiss();
                    }
                } else {
                    if (!hint_1_used) {
                        hint.setText(HINT1);
                        hint_1_used = true;
                    } else {
                        hint.setText(HINT2);
                        hint_2_used = true;
                    }
                }
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        question82Callback=(Question82Callback)context;
    }
    public interface Question82Callback{
        public void question82(int score);
    }
}
