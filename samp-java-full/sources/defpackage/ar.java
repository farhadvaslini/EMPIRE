package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ar implements Runnable {
    public final /* synthetic */ int f = 1;

    public /* synthetic */ ar() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                return;
            default:
                try {
                    int i = pj3.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (nh0.d()) {
                        nh0.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = pj3.a;
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public ar(k71 k71Var, int i) {
    }

    private final void a() {
    }
}
