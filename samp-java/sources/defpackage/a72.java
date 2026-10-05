package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.fonts.Font;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.window.SplashScreenView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract /* synthetic */ class a72 {
    public static /* synthetic */ Font.Builder k(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ScrollCaptureTarget n(h7 h7Var, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(h7Var, rect, point, scrollCaptureCallback);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView q(View view) {
        return (SplashScreenView) view;
    }

    public static /* bridge */ /* synthetic */ boolean v(View view) {
        return view instanceof SplashScreenView;
    }
}
