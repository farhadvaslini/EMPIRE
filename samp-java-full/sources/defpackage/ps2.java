package defpackage;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ps2 extends se0 implements i71, tu2 {
    public final gw1 O;
    public u P;
    public t0 Q;
    public boolean R;
    public boolean S;
    public wq1 T;
    public tj3 U;
    public final s80 V;
    public final ws2 W;
    public final ms2 X;
    public final rp0 Y;
    public final y30 Z;

    public ps2(w8 w8Var, zo zoVar, rm0 rm0Var, qr1 qr1Var, t02 t02Var, qs2 qs2Var, boolean z, boolean z2) {
        super(f80.a, z, qr1Var, t02Var);
        this.O = new gw1();
        s80 s80Var = new s80(new h80(new k71(ks2.c)));
        this.V = s80Var;
        ws2 ws2Var = new ws2(qs2Var, w8Var, rm0Var == null ? s80Var : rm0Var, t02Var, z2, this.O, this, new ns2(this, 0));
        this.W = ws2Var;
        ms2 ms2Var = new ms2(ws2Var, z);
        this.X = ms2Var;
        rp0 rp0Var = new rp0(2, null, 10);
        p1(rp0Var);
        this.Y = rp0Var;
        y30 y30Var = new y30(t02Var, ws2Var, z2, zoVar, new ns2(this, 1));
        p1(y30Var);
        this.Z = y30Var;
        p1(new kw1(ms2Var, this.O));
        wo woVar = new wo();
        woVar.t = y30Var;
        p1(woVar);
    }

    @Override // defpackage.se0
    public final void C1(ae0 ae0Var) {
        if (this.s) {
            cl3.t(this.O.c(), null, new hd1(ae0Var, this, null, 19), 3);
        }
    }

    @Override // defpackage.i71
    public final boolean F(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.se0
    public final boolean H1() {
        ws2 ws2Var = this.W;
        if (ws2Var.a.b()) {
            return true;
        }
        w8 w8Var = ws2Var.b;
        return w8Var != null ? w8Var.e() : false;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        if (this.x && (this.P == null || this.Q == null)) {
            this.P = new u(1, this);
            this.Q = new t0(this, null);
        }
        u uVar = this.P;
        if (uVar != null) {
            a71[] a71VarArr = bv2.a;
            dv2Var.a(pu2.d, new y0(null, uVar));
        }
        t0 t0Var = this.Q;
        if (t0Var != null) {
            a71[] a71VarArr2 = bv2.a;
            dv2Var.a(pu2.e, t0Var);
        }
    }

    public final void K1(w8 w8Var, zo zoVar, rm0 rm0Var, qr1 qr1Var, t02 t02Var, qs2 qs2Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (this.x != z) {
            this.X.g = z;
            this.P = null;
            this.Q = null;
            y02.w(this);
        }
        if (rm0Var == null) {
            rm0Var = this.V;
        }
        ws2 ws2Var = this.W;
        if (s51.n(ws2Var.a, qs2Var)) {
            z3 = false;
        } else {
            ws2Var.a = qs2Var;
            z3 = true;
        }
        ws2Var.b = w8Var;
        if (ws2Var.d != t02Var) {
            ws2Var.d = t02Var;
            z3 = true;
        }
        if (ws2Var.e != z2) {
            ws2Var.e = z2;
            z4 = true;
        } else {
            z4 = z3;
        }
        ws2Var.c = rm0Var;
        ws2Var.f = this.O;
        y30 y30Var = this.Z;
        y30Var.t = t02Var;
        y30Var.v = z2;
        y30Var.w = zoVar;
        u0 u0Var = f80.a;
        t02 t02Var2 = ws2Var.d;
        t02 t02Var3 = t02.f;
        if (t02Var2 != t02Var3) {
            t02Var3 = t02.g;
        }
        J1(u0Var, z, qr1Var, t02Var3, z4);
    }

    @Override // defpackage.ia0
    public final void c() {
        L0();
        wq1 wq1Var = this.T;
        if (wq1Var != null) {
            wq1Var.c = vr.X(this).E;
        }
        tj3 tj3Var = this.U;
        if (tj3Var != null) {
            tj3Var.c = vr.X(this).E;
        }
        L0();
        if (this.s) {
            ua0 ua0Var = vr.X(this).E;
            s80 s80Var = this.V;
            s80Var.getClass();
            s80Var.a = new h80(new k71(ua0Var));
        }
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        wq1 wq1Var = this.T;
        if (wq1Var != null) {
            wq1Var.c = vr.X(this).E;
        }
        tj3 tj3Var = this.U;
        if (tj3Var != null) {
            tj3Var.c = vr.X(this).E;
        }
        if (this.s) {
            ua0 ua0Var = vr.X(this).E;
            s80 s80Var = this.V;
            s80Var.getClass();
            s80Var.a = new h80(new k71(ua0Var));
        }
    }

    @Override // defpackage.se0, defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        int i;
        List list = za2Var.a;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (((Boolean) this.w.h(new ob2(((gb2) list.get(i2)).i))).booleanValue()) {
                super.i0(za2Var, ab2Var, j);
                break;
            }
            i2++;
        }
        if (this.x) {
            if (this.F == null) {
                bw0 bw0Var = new bw0(this);
                p1(bw0Var);
                this.F = bw0Var;
            }
            p40 p40Var = null;
            ab2 ab2Var2 = ab2.f;
            if (ab2Var == ab2Var2 && za2Var.f == 6) {
                if (!this.R) {
                    this.T = new wq1(this.W, new yl1(4, ViewConfiguration.get(vp.S(this).getContext())), new c00(2, this, ps2.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, 3), vr.X(this).E);
                    this.R = true;
                }
                wq1 wq1Var = this.T;
                if (wq1Var != null) {
                    x50 x50VarD1 = d1();
                    if (wq1Var.h == null) {
                        wq1Var.h = cl3.t(x50VarD1, null, new hd1(wq1Var, p40Var, 7), 3);
                    }
                }
            }
            wq1 wq1Var2 = this.T;
            ab2 ab2Var3 = ab2.g;
            if (wq1Var2 != null && za2Var.f == 6) {
                List list2 = za2Var.a;
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (ab2Var == ab2Var2 && wq1Var2.d) {
                            wq1Var2.f(za2Var);
                            nx1.a(za2Var);
                        }
                        if (ab2Var == ab2Var3 && !wq1Var2.d && wq1Var2.f(za2Var)) {
                            nx1.a(za2Var);
                        }
                    } else if (((gb2) list2.get(i3)).c()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (ab2Var == ab2Var2 && ((i = za2Var.f) == 10 || i == 11 || i == 12)) {
                if (!this.S) {
                    this.U = new tj3(this.W, new c00(2, this, ps2.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 4), vr.X(this).E);
                    this.S = true;
                }
                tj3 tj3Var = this.U;
                if (tj3Var != null) {
                    x50 x50VarD12 = d1();
                    if (tj3Var.g == null) {
                        tj3Var.g = cl3.t(x50VarD12, null, new n9(tj3Var, null), 3);
                    }
                }
            }
            tj3 tj3Var2 = this.U;
            if (tj3Var2 != null) {
                int i4 = za2Var.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    List list3 = za2Var.a;
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((gb2) list3.get(i5)).c()) {
                            return;
                        }
                    }
                    if (ab2Var == ab2Var2 && tj3Var2.d) {
                        tj3Var2.d(za2Var);
                        nx1.a(za2Var);
                    }
                    if (ab2Var == ab2Var3 && !tj3Var2.d && tj3Var2.d(za2Var)) {
                        nx1.a(za2Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.i71
    public final boolean u0(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.x || ((!c71.a(ur.E(keyEvent), c71.D) && !c71.a(gq.h(keyEvent.getKeyCode()), c71.C)) || ur.G(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.W.d == t02.f;
        y30 y30Var = this.Z;
        if (z) {
            int iQ1 = (int) (y30Var.q1() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(c71.a(gq.h(keyEvent.getKeyCode()), c71.C) ? iQ1 : -iQ1)));
        } else {
            int iQ12 = (int) (y30Var.q1() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(c71.a(gq.h(keyEvent.getKeyCode()), c71.C) ? iQ12 : -iQ12)) << 32);
        }
        cl3.t(d1(), null, new t0(this, jFloatToRawIntBits, null, 1), 3);
        return true;
    }

    @Override // defpackage.se0
    public final Object w1(re0 re0Var, re0 re0Var2) {
        ws2 ws2Var = this.W;
        Object objG = ws2Var.g(ts1.g, new ri2(re0Var, ws2Var, (p40) null, 3), re0Var2);
        return objG == y50.f ? objG : dm3.a;
    }

    @Override // defpackage.se0
    public final void B1(long j) {
    }
}
