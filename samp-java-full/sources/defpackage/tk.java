package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tk extends sy1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(m8 m8Var) {
        super(true);
        this.d = 3;
        this.e = m8Var;
    }

    @Override // defpackage.sy1
    public void a() {
        switch (this.d) {
            case 0:
                ((d1) this.e).k();
                break;
        }
    }

    @Override // defpackage.sy1
    public final void b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((d1) obj).l();
                return;
            case 1:
                ur0 ur0Var = (ur0) obj;
                ur0Var.e(true);
                if (!ur0Var.g.b) {
                    ur0Var.f.b().a();
                    return;
                }
                ur0Var.e(false);
                ur0Var.d(true);
                ArrayList arrayList = ur0Var.B;
                ArrayList arrayList2 = ur0Var.C;
                ArrayList arrayList3 = ur0Var.d;
                int size = (arrayList3 == null || arrayList3.isEmpty()) ? -1 : ur0Var.d.size() - 1;
                if (size >= 0) {
                    for (int size2 = ur0Var.d.size() - 1; size2 >= size; size2--) {
                        arrayList.add((cl) ur0Var.d.remove(size2));
                        arrayList2.add(Boolean.TRUE);
                    }
                    ur0Var.b = true;
                    try {
                        ur0Var.j(ur0Var.B, ur0Var.C);
                    } finally {
                        ur0Var.a();
                    }
                }
                ur0Var.k();
                ((HashMap) ur0Var.c.h).values().removeAll(Collections.singleton(null));
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((nu1) obj).d();
                return;
            default:
                ((m8) obj).h(this);
                return;
        }
    }

    @Override // defpackage.sy1
    public void c(rk rkVar) {
        switch (this.d) {
            case 0:
                ((d1) this.e).m(rkVar);
                break;
        }
    }

    @Override // defpackage.sy1
    public void d(rk rkVar) {
        switch (this.d) {
            case 0:
                ((d1) this.e).n();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }
}
