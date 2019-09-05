package com.tje.yeojunglogin;

        import android.content.Context;

public class SharedPreferenceManager {
    public static void putId(Context context, String id) {
        SharedPreferenceUtil.putSharedPreference(
                context, "ID", id);
    }

    public static String getId(Context context) {
        return SharedPreferenceUtil.getSharedPreference(
                context, "ID");
    }
}
