package jp.mstssk.mtr.mobiletw_redirection;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;


public class Redirection extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String url = getIntent().getData().toString();
        String newUrl = url.replaceFirst("mobile.", "");
        Toast.makeText(getApplicationContext(), newUrl, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(newUrl));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);

        finish();
    }
}
