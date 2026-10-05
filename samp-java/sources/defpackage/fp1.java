package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fp1 extends aq1 implements m20, kb1 {
    public LinkedHashMap t;

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        float f = ((jd0) ur.z(this, w41.c)).f;
        if (f < 0.0f) {
            f = 0.0f;
        }
        i62 i62VarT = xm1Var.t(j);
        boolean z = this.s && !Float.isNaN(f) && jd0.a(f, 0.0f) > 0;
        int iP0 = !Float.isNaN(f) ? en1Var.p0(f) : 0;
        int iMax = i62VarT.f;
        if (z) {
            iMax = Math.max(iMax, iP0);
        }
        int iMax2 = i62VarT.g;
        if (z) {
            iMax2 = Math.max(iMax2, iP0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.t;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.t = linkedHashMap;
            }
            xp3 xp3Var = w41.b;
            int iRound = Math.round((iP0 - i62VarT.f) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(xp3Var, Integer.valueOf(iRound));
            ry0 ry0Var = w41.a;
            int iRound2 = Math.round((iP0 - i62VarT.g) / 2.0f);
            linkedHashMap.put(ry0Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.t;
        if (map == null) {
            map = oi0.f;
        }
        return en1Var.I0(iMax, iMax2, map, new n31(iMax, iMax2, i62VarT));
    }
}
