package com.wardrumstudios.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import com.nvidia.devtech.NvUtil;
import defpackage.n92;
import java.io.File;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class WarMedia extends WarGamepad {
    private static final String PREFS_NAME = "samp_public_war_media";
    private ConnectivityManager.NetworkCallback networkCallback;
    protected boolean AllowLongPressForExit = false;
    protected String apkFileName = "";
    public String baseDirectory = "";
    public String baseDirectoryRoot = "";
    protected String expansionFileName = "";
    protected String patchFileName = "";
    public XAPKFile[] xAPKS = null;
    private int currentLocale = Locale.getDefault().getLanguage().hashCode();

    /* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
    public static class XAPKFile {
        public final long mFileSize;
        public final int mFileVersion;
        public final boolean mIsMain;

        public XAPKFile(boolean z, int i, long j) {
            this.mIsMain = z;
            this.mFileVersion = i;
            this.mFileSize = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void NativeNotifyNetworkChange(int i);

    private static String ensureTrailingSlash(String str) {
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            return str;
        }
        return str + str2;
    }

    private native void initTouchSense(Context context);

    private void registerNetworkCallback() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.wardrumstudios.utils.WarMedia.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                WarMedia.this.NativeNotifyNetworkChange(1);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                WarMedia.this.NativeNotifyNetworkChange(0);
            }
        };
        this.networkCallback = networkCallback;
        try {
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } catch (Exception unused) {
        }
    }

    private void unregisterNetworkCallback() {
        ConnectivityManager.NetworkCallback networkCallback;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        if (connectivityManager == null || (networkCallback = this.networkCallback) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(networkCallback);
        } catch (Exception unused) {
        }
        this.networkCallback = null;
    }

    public final boolean CheckIfNeedsBluetoothPermission(Activity activity) {
        if (Build.VERSION.SDK_INT < 31 || n92.h(activity, "android.permission.BLUETOOTH_CONNECT") == 0) {
            return false;
        }
        n92.B(activity, new String[]{"android.permission.BLUETOOTH_CONNECT"}, 8002);
        return true;
    }

    public final boolean CheckIfNeedsReadPermission(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30 || n92.h(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        n92.B(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 8001);
        return true;
    }

    public final boolean ConvertToBitmap(byte[] bArr, int i) {
        return (bArr == null || i <= 0 || BitmapFactory.decodeByteArray(bArr, 0, Math.min(bArr.length, i)) == null) ? false : true;
    }

    public final boolean CustomLoadFunction() {
        return false;
    }

    public final boolean DeleteFile(String str) {
        return str != null && new File(str).delete();
    }

    public final String FileGetArchiveName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : this.patchFileName : this.expansionFileName : this.apkFileName;
    }

    public final boolean FileRename(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return false;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (file2.exists() && i == 0) {
            return false;
        }
        return file.renameTo(file2);
    }

    public final String GetAndroidBuildinfo(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : Build.VERSION.RELEASE : Build.MODEL : Build.MANUFACTURER;
    }

    public final String GetAppId() {
        return getPackageName();
    }

    public final int GetAvailableMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.availMem / 1048576);
    }

    public final String GetConfigSetting(String str) {
        return getSharedPreferences(PREFS_NAME, 0).getString(str, "");
    }

    public final int GetDeviceInfo(int i) {
        if (i == 0) {
            return Build.VERSION.SDK_INT;
        }
        if (i != 1) {
            return 0;
        }
        return Runtime.getRuntime().availableProcessors();
    }

    public final int GetDeviceLocale() {
        return Locale.getDefault().toLanguageTag().hashCode();
    }

    public final int GetDeviceType() {
        return isTV() ? 2 : 1;
    }

    public final long GetFreeBytesOnExternalStorage() {
        return new StatFs(Environment.getExternalStorageDirectory().getPath()).getAvailableBytes();
    }

    public final String GetGameBaseDirectory() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = getFilesDir();
        }
        String absolutePath = externalFilesDir.getAbsolutePath();
        int iIndexOf = absolutePath.indexOf(File.separator + "Android");
        if (iIndexOf > 0) {
            this.baseDirectoryRoot = absolutePath.substring(0, iIndexOf);
        } else {
            this.baseDirectoryRoot = Environment.getExternalStorageDirectory().getAbsolutePath();
        }
        return ensureTrailingSlash(externalFilesDir.getAbsolutePath());
    }

    public final int GetLocale() {
        return this.currentLocale;
    }

    public final int GetLowThreshhold() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.threshold / 1048576);
    }

    public final int GetMemoryInfo(boolean z) {
        return GetAvailableMemory();
    }

    public final String GetPackageName(String str) {
        return getApplicationInfo().sourceDir;
    }

    public final void GetRealLocale() {
        this.currentLocale = GetDeviceLocale();
    }

    public final float GetScreenWidthInches() {
        return r1.widthPixels / getResources().getDisplayMetrics().xdpi;
    }

    public final int GetSpecialBuildType() {
        return 0;
    }

    public final int GetTotalMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        if (activityManager == null) {
            return 0;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return (int) (memoryInfo.totalMem / 1048576);
    }

    public final boolean IsAppInstalled(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public final boolean IsCloudAvailable() {
        return false;
    }

    public final boolean IsKeyboardShown() {
        return false;
    }

    public final int IsMoviePlaying() {
        return 0;
    }

    public final boolean IsPhone() {
        return !isTV();
    }

    public final boolean IsTV() {
        return isTV();
    }

    public final String LoadGameFromCloud(int i, byte[] bArr) {
        return "";
    }

    public final void NetworkChange() {
        NativeNotifyNetworkChange(isNetworkAvailable() ? 1 : 0);
    }

    public final boolean NewCloudSaveAvailable(int i) {
        return false;
    }

    public final String OBFU_GetDeviceID() {
        return Build.MANUFACTURER + "-" + Build.MODEL;
    }

    public final void OpenLink(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public final void RestoreCurrentLanguage() {
        this.currentLocale = GetDeviceLocale();
    }

    public final void ScreenSetWakeLock(boolean z) {
        if (z) {
            getWindow().addFlags(128);
        } else {
            getWindow().clearFlags(128);
        }
    }

    public boolean ServiceAppCommand(String str, String str2) {
        return false;
    }

    public final boolean ServiceAppCommandInt(String str, int i) {
        return false;
    }

    public int ServiceAppCommandValue(String str, String str2) {
        return 0;
    }

    public final void SetConfigSetting(String str, String str2) {
        SharedPreferences.Editor editorEdit = getSharedPreferences(PREFS_NAME, 0).edit();
        if (str2 == null) {
            str2 = "";
        }
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }

    public final void SetLocale(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        this.currentLocale = str.trim().hashCode();
        getSharedPreferences(PREFS_NAME, 0).edit().putString("locale", str.trim()).apply();
    }

    public final void ShowKeyboard(int i) {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || getWindow() == null || getWindow().getDecorView() == null) {
            return;
        }
        if (i != 0) {
            inputMethodManager.showSoftInput(getWindow().getDecorView(), 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public final void VibratePhone(int i) {
        Vibrator vibrator = (Vibrator) getSystemService("vibrator");
        if (vibrator == null || i <= 0) {
            return;
        }
        vibrator.vibrate(i);
    }

    public final void VibratePhoneEffect(int i) {
        VibratePhone(30);
    }

    public final boolean isNetworkAvailable() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3))) ? false : true;
    }

    public final boolean isTV() {
        UiModeManager uiModeManager = (UiModeManager) getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public final boolean isWiFiAvailable() {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        return (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || !networkCapabilities.hasTransport(1)) ? false : true;
    }

    @Override // defpackage.tr3, com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, defpackage.xz, defpackage.wz, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.baseDirectory = GetGameBaseDirectory();
        NvUtil.getInstance().setAppLocalValue("STORAGE_ROOT", this.baseDirectory);
        NvUtil.getInstance().setAppLocalValue("STORAGE_ROOT_BASE", this.baseDirectoryRoot);
        super.onCreate(bundle);
    }

    @Override // defpackage.tr3, com.nvidia.devtech.NvEventQueueActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.AllowLongPressForExit || i != 4 || keyEvent == null || !keyEvent.isLongPress()) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, android.app.Activity
    public void onPause() {
        unregisterNetworkCallback();
        super.onPause();
    }

    @Override // defpackage.lr0, defpackage.xz, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, defpackage.lr0, android.app.Activity
    public void onResume() {
        super.onResume();
        registerNetworkCallback();
    }

    @Override // com.nvidia.devtech.NvEventQueueActivity, android.app.Activity
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public native void setTouchSenseFilepath(String str);

    public final void SendStatEvent(String str, boolean z) {
    }

    public final String GetPackageName() {
        return getPackageName();
    }

    public final void AfterDownloadFunction() {
    }

    public final void ClearSystemNotification() {
    }

    public final void LoadAllGamesFromCloud() {
    }

    public final void StopMovie() {
    }

    public final void localHasGameData() {
    }

    public final void MovieClearText(boolean z) {
    }

    public final void MovieDisplayText(boolean z) {
    }

    public final void MovieKeepAspectRatio(boolean z) {
    }

    public final void MovieSetSkippable(boolean z) {
    }

    public final void MovieSetTextScale(int i) {
    }

    public final void SendTimedStatEventEnd(String str) {
    }

    public final void SetLocale(int i) {
        this.currentLocale = i;
    }

    public final void PlayMovie(String str, float f) {
    }

    public final void MovieSetText(String str, boolean z, boolean z2) {
    }

    public final void SaveGameToCloud(int i, byte[] bArr, int i2) {
    }

    public final void PlayMovieInFile(String str, float f, int i, int i2) {
    }

    public final void SendStatEvent(String str, String str2, String str3, boolean z) {
    }

    public final void CreateTextBox(int i, int i2, int i3, int i4, int i5) {
    }

    public final void PlayMovieInWindow(String str, int i, int i2, int i3, int i4, float f, int i5, int i6, int i7, boolean z) {
    }
}
