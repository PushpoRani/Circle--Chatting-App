package pushpo.circle;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.startup);

		init();

        /*MediaPlayer player = MediaPlayer.create(this, R.raw.music);
        player.setLooping(true);
        player.start();*/


	}
	public Button btn;
	public void init() {
		btn = (Button)findViewById(R.id.play);
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent nextPage = new Intent(MainActivity.this, ChatActivity.class);
				startActivity(nextPage);
			}
		});
	}


}
