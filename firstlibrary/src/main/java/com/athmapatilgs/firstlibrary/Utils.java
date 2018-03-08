package com.athmapatilgs.firstlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by athmapatilgs on 3/9/18.
 */

public class Utils {

    public static void shortToast(Context ctx, String str){
        Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
    }
}
