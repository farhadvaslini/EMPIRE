package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class v62 extends CancellationException {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v62(int i, String str) {
        super(str);
        this.f = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f) {
            case 0:
                setStackTrace(vm1.d0);
                break;
            case 1:
                setStackTrace(gv3.G);
                break;
            default:
                setStackTrace(n92.P);
                break;
        }
        return this;
    }
}
