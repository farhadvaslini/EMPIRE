package defpackage;

import android.view.DisplayCutout;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextSelection;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract /* synthetic */ class i1 {
    public static /* bridge */ /* synthetic */ DisplayCutout c(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ TextClassification.Request.Builder f(CharSequence charSequence, int i, int i2) {
        return new TextClassification.Request.Builder(charSequence, i, i2);
    }

    public static /* synthetic */ TextSelection.Request.Builder j(CharSequence charSequence, int i, int i2) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    public static /* synthetic */ void n() {
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof DisplayCutout;
    }

    public static /* synthetic */ void y() {
    }
}
