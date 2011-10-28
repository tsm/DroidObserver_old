package bullteam.droidobserver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DroidObserverActivity extends Activity {
    /** Called when the activity is first created. */
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	       /* TextView tv = new TextView(this);
	        tv.setText("Lubie placki z serem");
	        setContentView(tv);*/
	        setContentView(R.layout.main);       
	    }
		
		public void getGPSLocation(View target){
			TextView tv = new TextView(this);
	        tv.setText("Lubie placki z serem i miodem");
	        setContentView(tv);
			//LocationManager locMgr= (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
			//Location loc = locMgr.getLastKnownLocation(LocationManager.GPS_PROVIDER);
			//List<String> providerList = locMgr.getAllProviders();
		}
}