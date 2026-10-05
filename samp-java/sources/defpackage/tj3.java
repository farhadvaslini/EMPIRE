package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tj3 extends nx1 {
    public final np f;
    public w83 g;

    public tj3(ws2 ws2Var, c00 c00Var, ua0 ua0Var) {
        super(ws2Var, c00Var, ua0Var);
        this.f = lr.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (r0.f(r3, r7) == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.tj3 r16, defpackage.ws2 r17, defpackage.rj3 r18, defpackage.q40 r19) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj3.c(tj3, ws2, rj3, q40):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static rj3 e(np npVar) {
        rj3 rj3Var = null;
        ov2 ov2VarU = b32.u(new br0(new rq1(npVar, 1), 0 == true ? 1 : 0, 2));
        while (ov2VarU.hasNext()) {
            rj3 rj3VarA = (rj3) ov2VarU.next();
            if (rj3Var != null) {
                rj3VarA = rj3Var.a(rj3VarA);
            }
            rj3Var = rj3VarA;
        }
        return rj3Var;
    }

    public final boolean d(za2 za2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        np npVar;
        ws2 ws2Var;
        gb2 gb2Var = (gb2) qx.r0(za2Var.a);
        if (gb2Var != null) {
            List listB = gb2Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                npVar = this.f;
                ws2Var = this.a;
                if (i >= size) {
                    break;
                }
                hy0 hy0Var = (hy0) listB.get(i);
                long j = hy0Var.d ^ (-9223372034707292160L);
                if (!(ws2Var.j(ws2Var.f(j)) == 0.0f)) {
                    z3 = !(npVar.l(new rj3(j, hy0Var.a, false)) instanceof us) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = gb2Var.l ^ (-9223372034707292160L);
            boolean z4 = za2Var.f == 12;
            if (!(ws2Var.j(ws2Var.f(j2)) == 0.0f) || z4) {
                if (!(npVar.l(new rj3(j2, gb2Var.b, z4)) instanceof us) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.d) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
