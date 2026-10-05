package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class be extends u71 implements cs0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ be(int i, Object obj) {
        super(0);
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((os1) obj).setValue(Boolean.FALSE);
                return dm3Var;
            case 1:
                gk3 gk3Var = (gk3) obj;
                Object objH = gk3Var.a.h();
                ti0 ti0Var = ti0.h;
                return Boolean.valueOf(objH == ti0Var && gk3Var.d.getValue() == ti0Var);
            default:
                Collection collectionValues = ((c33) obj).n.e().c.values();
                if (!((t) collectionValues).isEmpty()) {
                    for (m23 m23Var : (rm1) collectionValues) {
                        if (m23Var.d() || m23Var.e()) {
                        }
                    }
                }
                return dm3Var;
        }
    }
}
