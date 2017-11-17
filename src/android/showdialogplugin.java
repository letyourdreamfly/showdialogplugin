package cordova.showdialog.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * This class echoes a string called from JavaScript.
 * 该插件只是显示一个弹出框
 */
public class showdialogplugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("showdialog")) {
            this.showDialog();
            callbackContext.success("success");
            return true;
        }
        callbackContext.error("error");
        return false;
    }

    /**
    * 显示弹窗，让用户知道应用程序已完成更新
    */
    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.cordova.getActivity());
        builder.setTitle("APP更新");
        builder.setMessage("应用程序已完成更新，感谢您的使用。");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
