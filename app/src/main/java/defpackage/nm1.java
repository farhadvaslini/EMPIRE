package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nm1 implements t41 {
    public final long a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final qn0 c;

    public nm1(qr1 qr1Var, long j) {
        this.a = j;
        this.c = new qn0(qr1Var.a, this, 4);
    }

    @Override // defpackage.t41
    public final fn0 a() {
        return this.c;
    }
}
