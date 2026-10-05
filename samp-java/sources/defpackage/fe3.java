package defpackage;

import android.R;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public enum fe3 {
    /* JADX INFO: Fake field, exist only in values array */
    Cut(r51.J1, R.string.cut, R.attr.actionModeCutDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Copy(r51.K1, R.string.copy, R.attr.actionModeCopyDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    Paste(r51.L1, R.string.paste, R.attr.actionModePasteDrawable),
    /* JADX INFO: Fake field, exist only in values array */
    SelectAll(r51.M1, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(r51.N1, Build.VERSION.SDK_INT <= 26 ? 2131623963 : R.string.autofill, 0);

    public final Object f;
    public final int g;
    public final int h;

    fe3(Object obj, int i, int i2) {
        this.f = obj;
        this.g = i;
        this.h = i2;
    }
}
