package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h52 implements al2 {
    public final Set f;
    public final qs1 g = new qs1(new rv0[16]);

    public h52(Set set) {
        this.f = set;
    }

    @Override // defpackage.al2
    public final void a() {
        qs1 qs1Var = this.g;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            al2 al2Var = ((rv0) objArr[i2]).a;
            this.f.remove(al2Var);
            al2Var.a();
        }
    }

    @Override // defpackage.al2
    public final void d() {
    }

    @Override // defpackage.al2
    public final void e() {
    }
}
