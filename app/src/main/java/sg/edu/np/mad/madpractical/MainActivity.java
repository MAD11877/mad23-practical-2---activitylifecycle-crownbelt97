package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private boolean following = false;
    private Button followBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        followBtn = (Button) findViewById(R.id.followBtn);
        followBtn.setOnClickListener(view -> {
            if(!following){
                followBtn.setText("Unfollow");
            }
            else{
                followBtn.setText("follow");
            }
            following = !following;
        });
    }
}