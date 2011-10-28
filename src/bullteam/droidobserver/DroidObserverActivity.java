package bullteam.droidobserver;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DroidObserverActivity extends Activity {
    /** Called when the activity is first created. */
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	       /* TextView tv = new TextView(this);
	        tv.setText("Lubie placki z serem");
	        setContentView(tv);*/
	        LocationManager locMgr= (LocationManager)this.getSystemService(Context.LOCATION_SERVICE);
			LocationListener locListener = new LocationListener()
			{
				
				public void onLocationChanged(Location location)
				{
					if(location!=null)
					{
						Toast.makeText(getBaseContext(), "Nowa lokalizacja: szerokœæ [" + location.getLatitude()
								+"] d³ugoœæ [" +location.getLongitude()+"]",Toast.LENGTH_SHORT).show();
					}
				}
				
				public void onProviderDisabled(String provider){
					
				}
				public void onProviderEnabled(String provider){
					
				}
				public void onStatusChanged(String provider,int status, Bundle extras){
					
				}
			};
	        locMgr.requestLocationUpdates(LocationManager.GPS_PROVIDER,0,0,locListener);
	        setContentView(R.layout.main);       
	    }
		
		public void getGPSLocation(View target) {
		Uri uri = Uri.parse("gps://location");
		//startActivityForResult(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS),REQ_CODE);
		startActivity(new Intent(this,GetLocationActivity.class));
	}
	
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		if (requestCode == REQ_CODE && resultCode == RESULT_OK) {
//			Toast.makeText(getBaseContext(), "pobrano dane", Toast.LENGTH_LONG).show();
//        }
//	}
}
