package ng.com.sprinthub.democonstraintlayout;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;

public class MainActivity extends AppCompatActivity {

    private Placeholder mPlaceholder;
    private ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlaceholder = findViewById(R.id.placeholder);
        mConstraintLayout = findViewById(R.id.constraintlayout);
    }

    public void swapView(View view) {

        TransitionManager.beginDelayedTransition(mConstraintLayout);
        mPlaceholder.setContentId(view.getId());
    }
}
