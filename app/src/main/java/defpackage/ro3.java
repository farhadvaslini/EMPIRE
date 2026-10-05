package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ro3 extends mo3 {
    public final bx0 b;
    public String c;
    public boolean d;
    public final lf0 e;
    public cs0 f;
    public final d42 g;
    public xm h;
    public final d42 i;
    public long j;
    public float k;
    public float l;
    public final qo3 m;

    public ro3(bx0 bx0Var) {
        this.b = bx0Var;
        bx0Var.i = new qo3(this, 0);
        this.c = "";
        this.d = true;
        this.e = new lf0();
        this.f = new v3(23);
        this.g = b32.w(null);
        this.i = b32.w(new h43(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new qo3(this, 1);
    }

    @Override // defpackage.mo3
    public final void a(qf0 qf0Var) {
        e(qf0Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(qf0 qf0Var, float f, yx yxVar) {
        int i;
        xm xmVar;
        char c;
        long j;
        yx yxVar2;
        int i2;
        int i3;
        bx0 bx0Var = this.b;
        boolean z = bx0Var.d;
        d42 d42Var = this.g;
        if (!z || bx0Var.e == 16) {
            i = 0;
        } else {
            yx yxVar3 = (yx) d42Var.getValue();
            int i4 = vo3.a;
            if (!(yxVar3 instanceof xm) ? yxVar3 == null : !((i3 = ((xm) yxVar3).c) != 5 && i3 != 3)) {
                if (!(yxVar instanceof xm) ? yxVar == null : !((i2 = ((xm) yxVar).c) != 5 && i2 != 3)) {
                    i = 1;
                }
            }
        }
        boolean z2 = this.d;
        lf0 lf0Var = this.e;
        if (z2 || !h43.a(this.j, qf0Var.a())) {
            if (i == 1) {
                long jB = bx0Var.e;
                int i5 = vo3.a;
                if (wx.d(jB) != 1.0f) {
                    jB = wx.b(1.0f, jB);
                }
                xmVar = new xm(5, jB);
            } else {
                xmVar = null;
            }
            this.h = xmVar;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (qf0Var.a() >> 32));
            d42 d42Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((h43) d42Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) / Float.intBitsToFloat((int) (((h43) d42Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (qf0Var.a() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L))))) & 4294967295L);
            bb1 layoutDirection = qf0Var.getLayoutDirection();
            g9 g9VarC = lf0Var.a;
            n6 n6VarA = lf0Var.b;
            if (g9VarC == null || n6VarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = g9VarC.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || lf0Var.d != i) {
                }
                lf0Var.c = jCeil;
                rr rrVar = lf0Var.e;
                long jT = lr.T(jCeil);
                qr qrVar = rrVar.f;
                ua0 ua0Var = qrVar.a;
                bb1 bb1Var = qrVar.b;
                pr prVar = qrVar.c;
                n6 n6Var = n6VarA;
                long j2 = qrVar.d;
                qrVar.a = qf0Var;
                qrVar.b = layoutDirection;
                qrVar.c = n6Var;
                qrVar.d = jT;
                n6Var.l();
                qf0.h0(rrVar, wx.b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.h(rrVar);
                n6Var.i();
                qr qrVar2 = rrVar.f;
                qrVar2.a = ua0Var;
                qrVar2.b = bb1Var;
                qrVar2.c = prVar;
                qrVar2.d = j2;
                g9VarC.a.prepareToDraw();
                this.d = false;
                this.j = qf0Var.a();
            }
            g9VarC = pq.c((int) (jCeil >> c), (int) (jCeil & j), i);
            n6VarA = ur.a(g9VarC);
            lf0Var.a = g9VarC;
            lf0Var.b = n6VarA;
            lf0Var.d = i;
            lf0Var.c = jCeil;
            rr rrVar2 = lf0Var.e;
            long jT2 = lr.T(jCeil);
            qr qrVar3 = rrVar2.f;
            ua0 ua0Var2 = qrVar3.a;
            bb1 bb1Var2 = qrVar3.b;
            pr prVar2 = qrVar3.c;
            n6 n6Var2 = n6VarA;
            long j22 = qrVar3.d;
            qrVar3.a = qf0Var;
            qrVar3.b = layoutDirection;
            qrVar3.c = n6Var2;
            qrVar3.d = jT2;
            n6Var2.l();
            qf0.h0(rrVar2, wx.b, 0L, 0L, 0.0f, null, 0, 62);
            this.m.h(rrVar2);
            n6Var2.i();
            qr qrVar22 = rrVar2.f;
            qrVar22.a = ua0Var2;
            qrVar22.b = bb1Var2;
            qrVar22.c = prVar2;
            qrVar22.d = j22;
            g9VarC.a.prepareToDraw();
            this.d = false;
            this.j = qf0Var.a();
        } else {
            g9 g9Var = lf0Var.a;
            if (i != (g9Var != null ? g9Var.a() : 0)) {
            }
        }
        if (yxVar != null) {
            yxVar2 = yxVar;
        } else {
            yxVar2 = ((yx) d42Var.getValue()) != null ? (yx) d42Var.getValue() : this.h;
        }
        g9 g9Var2 = lf0Var.a;
        if (g9Var2 == null) {
            m21.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        qf0.E0(qf0Var, g9Var2, lf0Var.c, 0L, f, yxVar2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        d42 d42Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((h43) d42Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((h43) d42Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
