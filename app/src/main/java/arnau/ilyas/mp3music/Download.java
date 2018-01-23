package arnau.ilyas.mp3music;

import android.util.Log;

/**
 * Created by elidr on 23/01/2018.
 */

class Download {
    private String url;

    public Download(String link) {
        url = link;
        Log.d("Download: ", url);
    }

    public boolean checkURL(){
        return false;
    }
}
