package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bs2 implements r12 {
    public final int f;
    public final List g;
    public Float h = null;
    public Float i = null;
    public tr2 j = null;
    public tr2 k = null;

    public bs2(int i, ArrayList arrayList) {
        this.f = i;
        this.g = arrayList;
    }

    @Override // defpackage.r12
    public final boolean U() {
        return this.g.contains(this);
    }
}
