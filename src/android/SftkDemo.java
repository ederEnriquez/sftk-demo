package cordova-plugin-sftkdemo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import java.util.Date;
/**
 * This class echoes a string called from JavaScript.
 */
public class SftkDemo extends CordovaPlugin {
    
    private static final String TAG = "SftkDemo";
    
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        Log.d(TAG, "Initializing...");
    }
    
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if(action.equals("sayHelloMethod")) {
            String phrase = args.getString(0);
            this.sayHelloMethod(phrase, callbackContext);
            return true;
        }
        return false;
    }


    private void sayHelloMethod(String message, CallbackContext callbackContext) {
        // Echo back the first argument      
        final PluginResult result = 
            (message != null && message.length() > 0) ? 
                new PluginResult(PluginResult.Status.OK, "Un saludo de Softtek para  " + message):
                new PluginResult(PluginResult.Status.ERROR, "Tienes que saludar a alguien"):
        callbackContext.sendPluginResult(result);
        //callbackContext.success(message);
        //callbackContext.error("Expected one non-empty string argument.");
    }

/*
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("sayHello")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }
        return false;
    }
    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
    */




}
