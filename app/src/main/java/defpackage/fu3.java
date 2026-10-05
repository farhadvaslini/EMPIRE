package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fu3 extends ContentObserver {
    public final /* synthetic */ np a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu3(np npVar, Handler handler) {
        super(handler);
        this.a = npVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.l(dm3.a);
    }
}
