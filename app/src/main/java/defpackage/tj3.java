package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final Object c(tj3 tj3Var, ws2 ws2Var, rj3 rj3Var, q40 q40Var) {
        sj3 sj3Var;
        tj3Var.getClass();
        a31 a31Var = tj3Var.e;
        if (q40Var instanceof sj3) {
            sj3Var = (sj3) q40Var;
            int i = sj3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sj3Var.k = i - Integer.MIN_VALUE;
            } else {
                sj3Var = new sj3(tj3Var, q40Var);
            }
        }
        sj3 sj3Var2 = sj3Var;
        Object obj = sj3Var2.i;
        int i2 = sj3Var2.k;
        Object obj2 = y50.f;
        if (i2 == 0) {
            y02.Q(obj);
            qk2 qk2Var = new qk2();
            qk2Var.f = rj3Var;
            long j = rj3Var.b;
            long j2 = rj3Var.a;
            ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            rj3 rj3VarE = e(tj3Var.f);
            if (rj3VarE != null) {
                long j3 = rj3VarE.b;
                long j4 = rj3VarE.a;
                ((np3) a31Var.g).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                ((np3) a31Var.h).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                qk2Var.f = ((rj3) qk2Var.f).a(rj3VarE);
            }
            rs0 m9Var = new m9(tj3Var, ws2Var, qk2Var, null, 15);
            sj3Var2.k = 1;
            if (tj3Var.b(m9Var, sj3Var2) != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                y02.Q(obj);
                return dm3.a;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        rs0 rs0Var = tj3Var.b;
        lp3 lp3Var = new lp3(d32.h(((np3) a31Var.g).c(Float.MAX_VALUE), ((np3) a31Var.h).c(Float.MAX_VALUE)));
        sj3Var2.k = 2;
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
