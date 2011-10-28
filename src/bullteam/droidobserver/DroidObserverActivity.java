package bullteam.droidobserver;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.*;
import android.provider.Contacts.Intents;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DroidObserverActivity extends Activity {
	private final int REQ_CODE = 1;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void getGPSLocation(View target) {
		Uri uri = Uri.parse("gps://location");
		//startActivityForResult(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS),REQ_CODE);
		startActivity(new Intent(this,GetLocationActivity.class));
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == REQ_CODE && resultCode == RESULT_OK) {
			Toast.makeText(getBaseContext(), "pobrano dane", Toast.LENGTH_LONG).show();
        }
	}
}