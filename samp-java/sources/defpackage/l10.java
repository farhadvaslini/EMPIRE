package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l10 extends RuntimeException {
    public final as1 f;
    public final as1 g;
    public final nr1 h;
    public final int i;

    public l10(as1 as1Var, as1 as1Var2, nr1 nr1Var, int i, Exception exc) {
        super(exc);
        this.f = as1Var;
        this.g = as1Var2;
        this.h = nr1Var;
        this.i = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listK;
        ov2 ov2VarU = b32.u(new k10(this, null));
        if (ov2VarU.hasNext()) {
            Object next = ov2VarU.next();
            if (ov2VarU.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (ov2VarU.hasNext()) {
                    arrayList.add(ov2VarU.next());
                }
                listK = arrayList;
            } else {
                listK = vr.K(next);
            }
        } else {
            listK = ni0.f;
        }
        return z93.V("\n            |Failed to execute op number " + this.i + ":\n            |" + qx.x0(qx.J0(50, listK), "\n", null, null, null, 62) + "\n            ");
    }
}
