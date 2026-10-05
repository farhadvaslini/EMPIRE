package defpackage;

import android.content.Context;
import android.view.GestureDetector;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a21 {
    public final r6 a;
    public int b = 0;
    public boolean c;
    public final GestureDetector d;

    public a21(Context context, r6 r6Var) {
        this.a = r6Var;
        this.d = new GestureDetector(context, new z11(this));
    }
}
