package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class vu3 implements sf1, at0 {
    public final /* synthetic */ g20 a;

    public vu3(g20 g20Var) {
        this.a = g20Var;
    }

    @Override // defpackage.at0
    public final zs0 b() {
        return new ct0(1, this.a, g20.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof sf1) && (obj instanceof at0)) {
            return b().equals(((at0) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
