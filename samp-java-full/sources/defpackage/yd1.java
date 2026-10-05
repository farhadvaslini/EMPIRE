package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yd1 implements tc1 {
    public final ie1 a;

    public yd1(ie1 ie1Var) {
        this.a = ie1Var;
    }

    @Override // defpackage.tc1
    public final int a() {
        return this.a.i().o;
    }

    @Override // defpackage.tc1
    public final int b() {
        return Math.min(a() - 1, ((fe1) qx.y0(this.a.i().l)).a);
    }

    @Override // defpackage.tc1
    public final boolean c() {
        return !this.a.i().l.isEmpty();
    }

    @Override // defpackage.tc1
    public final int d() {
        int i;
        ie1 ie1Var = this.a;
        int size = 0;
        if (ie1Var.i().l.isEmpty()) {
            return 0;
        }
        ee1 ee1VarI = ie1Var.i();
        int i2 = (int) (ee1VarI.p == t02.f ? ee1VarI.i() & 4294967295L : ee1VarI.i() >> 32);
        ee1 ee1VarI2 = ie1Var.i();
        List list = ee1VarI2.l;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i3 = 0;
            while (size < size2) {
                i3 += ((fe1) list.get(size)).k;
                size++;
            }
            size = (i3 / list.size()) + ee1VarI2.r;
        }
        if (size != 0 && (i = i2 / size) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.tc1
    public final int e() {
        return Math.max(0, this.a.g());
    }
}
