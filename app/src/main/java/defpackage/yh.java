package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yh implements Runnable {
    public final /* synthetic */ TextView f;
    public final /* synthetic */ Typeface g;
    public final /* synthetic */ int h;

    public yh(TextView textView, Typeface typeface, int i) {
        this.f = textView;
        this.g = typeface;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.setTypeface(this.g, this.h);
    }
}
