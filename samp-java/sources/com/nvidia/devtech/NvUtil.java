package com.nvidia.devtech;

import android.app.Activity;
import android.os.Environment;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class NvUtil {
    private static NvUtil instance = new NvUtil();
    private Activity activity = null;
    private HashMap<String, String> appLocalValues;

    private NvUtil() {
        HashMap<String, String> map = new HashMap<>();
        this.appLocalValues = map;
        map.put("STORAGE_ROOT", Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    public static NvUtil getInstance() {
        return instance;
    }

    public final String getAppLocalValue(String str) {
        return this.appLocalValues.get(str);
    }

    public final String getParameter(String str) {
        return this.activity.getIntent().getStringExtra(str);
    }

    public final boolean hasAppLocalValue(String str) {
        return this.appLocalValues.containsKey(str);
    }

    public final void setActivity(Activity activity) {
        this.activity = activity;
    }

    public final void setAppLocalValue(String str, String str2) {
        this.appLocalValues.put(str, str2);
    }
}
