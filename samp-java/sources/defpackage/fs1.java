package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fs1 extends gs1 implements z61, a71 {
    public fs1(String str, String str2) {
        super(xq.f, bv2.class, str, str2, 1);
    }

    @Override // defpackage.yq
    public final s61 d() {
        rk2.a.getClass();
        return this;
    }

    @Override // defpackage.z61
    public final void g() {
        if (this.l) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        s61 s61VarK = k();
        if (s61VarK == this) {
            throw new b60("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((fs1) ((a71) s61VarK)).g();
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        g();
        throw null;
    }
}
