package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class on2 extends ml {
    public on2(p40 p40Var) {
        super(p40Var);
        if (p40Var == null || p40Var.i() == li0.f) {
            return;
        }
        c.p("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.p40
    public final o50 i() {
        return li0.f;
    }
}
