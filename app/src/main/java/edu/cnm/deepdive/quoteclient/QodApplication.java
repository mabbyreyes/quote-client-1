package edu.cnm.deepdive.quoteclient;

import android.app.Application;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import edu.cnm.deepdive.quoteclient.service.GoogleSignInService;

public class QodApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    GoogleSignInService.setContext(this);
  }



}
