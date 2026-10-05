package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ks extends ls {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(ks.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final js i;
    public final boolean j;

    public /* synthetic */ ks(js jsVar, boolean z) {
        this(jsVar, z, li0.f, -3, jp.f);
    }

    @Override // defpackage.ls, defpackage.fn0
    public final Object a(gn0 gn0Var, p40 p40Var) throws Throwable {
        int i = this.g;
        y50 y50Var = y50.f;
        if (i == -3) {
            boolean z = this.j;
            if (z && k.getAndSet(this, 1) == 1) {
                c.q("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objB = ur.B(gn0Var, this.i, z, p40Var);
            if (objB == y50Var) {
                return objB;
            }
        } else {
            Object objA = super.a(gn0Var, p40Var);
            if (objA == y50Var) {
                return objA;
            }
        }
        return dm3.a;
    }

    @Override // defpackage.ls
    public final String c() {
        return "channel=" + this.i;
    }

    @Override // defpackage.ls
    public final Object d(kd2 kd2Var, p40 p40Var) throws Throwable {
        Object objB = ur.B(new mv2(kd2Var), this.i, this.j, p40Var);
        return objB == y50.f ? objB : dm3.a;
    }

    @Override // defpackage.ls
    public final ls e(o50 o50Var, int i, jp jpVar) {
        return new ks(this.i, this.j, o50Var, i, jpVar);
    }

    @Override // defpackage.ls
    public final fn0 f() {
        return new ks(this.i, this.j);
    }

    @Override // defpackage.ls
    public final js g(x50 x50Var) {
        if (!this.j || k.getAndSet(this, 1) != 1) {
            return this.g == -3 ? this.i : super.g(x50Var);
        }
        c.q("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public ks(js jsVar, boolean z, o50 o50Var, int i, jp jpVar) {
        super(o50Var, i, jpVar);
        this.i = jsVar;
        this.j = z;
    }
}
