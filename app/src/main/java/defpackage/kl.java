package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kl extends aq1 implements kb1, of0, tu2, jb2, dq1, f42, ya1, dw0, so0, hp0, kp0, r12, up {
    public zp1 t;
    public jl u;
    public HashSet v;

    @Override // defpackage.dq1
    public final gq D() {
        jl jlVar = this.u;
        return jlVar != null ? jlVar : pi0.h;
    }

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        return ((ib1) zp1Var).t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hn1.g, in1.g, 1), n30.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        qu2 qu2VarE = ((ru2) zp1Var).e();
        dv2Var.getClass();
        qu2 qu2Var = (qu2) dv2Var;
        is1 is1Var = qu2Var.f;
        if (qu2VarE.h) {
            qu2Var.h = true;
        }
        if (qu2VarE.i) {
            qu2Var.i = true;
        }
        is1 is1Var2 = qu2VarE.f;
        Object[] objArr = is1Var2.b;
        Object[] objArr2 = is1Var2.c;
        long[] jArr = is1Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        cv2 cv2Var = (cv2) obj;
                        if (!is1Var.b(cv2Var)) {
                            is1Var.m(cv2Var, obj2);
                        } else if (obj2 instanceof y0) {
                            Object objG = is1Var.g(cv2Var);
                            objG.getClass();
                            y0 y0Var = (y0) objG;
                            String str = y0Var.a;
                            if (str == null) {
                                str = ((y0) obj2).a;
                            }
                            zs0 zs0Var = y0Var.b;
                            if (zs0Var == null) {
                                zs0Var = ((y0) obj2).b;
                            }
                            is1Var.m(cv2Var, new y0(str, zs0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.jb2
    public final void L0() {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        pl plVar = ((mb2) zp1Var).d;
        lb2 lb2Var = (lb2) plVar.h;
        mb2 mb2Var = (mb2) plVar.j;
        if (lb2Var == lb2.g) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((mc) mb2Var.f()).h(motionEventObtain);
            motionEventObtain.recycle();
            plVar.h = lb2.f;
            mb2Var.c = false;
            plVar.i = null;
        }
    }

    @Override // defpackage.dw0
    public final void O(ex1 ex1Var) {
        this.t.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.of0
    public final void R0() {
        vr.J(this);
    }

    @Override // defpackage.jb2
    public final void T0() {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        ((mb2) zp1Var).d.getClass();
    }

    @Override // defpackage.r12
    public final boolean U() {
        return this.s;
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        return ((ib1) zp1Var).t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hn1.f, in1.g, 1), n30.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.up
    public final long a() {
        return lr.T(vr.U(this, 128).h);
    }

    @Override // defpackage.f42
    public final Object b0(ua0 ua0Var, Object obj) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        return ((e42) zp1Var).c();
    }

    @Override // defpackage.ia0
    public final void c() {
        if (this.t instanceof mb2) {
            L0();
        }
    }

    @Override // defpackage.up
    public final bb1 getLayoutDirection() {
        return vr.X(this).F;
    }

    @Override // defpackage.up
    public final ua0 h() {
        return vr.X(this).E;
    }

    @Override // defpackage.aq1
    public final void h1() {
        p1(true);
    }

    @Override // defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        pl plVar = ((mb2) zp1Var).d;
        mb2 mb2Var = (mb2) plVar.j;
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gb2 gb2Var = (gb2) list.get(i);
            if (w22.l(gb2Var) || w22.n(gb2Var)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((gb2) list.get(i2)).c()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (mb2Var.c) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                if (i3 < size3) {
                    gb2 gb2Var2 = (gb2) list.get(i3);
                    if (w22.l(gb2Var2) || w22.n(gb2Var2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        lb2 lb2Var = (lb2) plVar.h;
        lb2 lb2Var2 = lb2.h;
        ab2 ab2Var2 = ab2.h;
        if (lb2Var != lb2Var2) {
            if (ab2Var == ab2.f && z3) {
                plVar.i = za2Var;
                plVar.f(za2Var, !z || mb2Var.c);
            }
            if (ab2Var == ab2.g && z && za2Var == ((za2) plVar.i) && mb2Var.c) {
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((gb2) list.get(i4)).a();
                }
            }
            if (ab2Var == ab2Var2 && !z3 && za2Var != ((za2) plVar.i)) {
                plVar.f(za2Var, true);
            }
        }
        if (ab2Var == ab2Var2) {
            int size5 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    plVar.h = lb2.f;
                    ((mb2) plVar.j).c = false;
                    plVar.i = null;
                    break;
                } else if (!w22.n((gb2) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (za2Var == ((za2) plVar.i) && z) {
                int size6 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size6) {
                        break;
                    }
                    if (!((gb2) list.get(i6)).c()) {
                        i6++;
                    } else if (!mb2Var.c) {
                        plVar.D(za2Var);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((gb2) list.get(i7)).a();
                }
            }
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        q1();
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        vb1Var.c();
    }

    public final void p1(boolean z) {
        if (!this.s) {
            m21.c("initializeModifier called on unattached node");
        }
        zp1 zp1Var = this.t;
        if ((this.h & 32) != 0 && (zp1Var instanceof eq1)) {
            eq1 eq1Var = (eq1) zp1Var;
            fe2 fe2Var = eq1Var.e;
            jl jlVar = this.u;
            if (jlVar == null || !jlVar.v(fe2Var)) {
                jl jlVar2 = new jl();
                jlVar2.h = eq1Var;
                this.u = jlVar2;
                rc3 rc3Var = vr.X(this).L.e;
                rc3Var.getClass();
                if (rc3Var.t) {
                    cq1 modifierLocalManager = ((h7) vr.Y(this)).getModifierLocalManager();
                    as1 as1Var = modifierLocalManager.b;
                    if (as1Var == null) {
                        as1Var = new as1();
                        modifierLocalManager.b = as1Var;
                    }
                    as1Var.b(this);
                    as1 as1Var2 = modifierLocalManager.c;
                    if (as1Var2 == null) {
                        as1Var2 = new as1();
                        modifierLocalManager.c = as1Var2;
                    }
                    as1Var2.b(fe2Var);
                    modifierLocalManager.a();
                }
            } else {
                jlVar.h = eq1Var;
                cq1 modifierLocalManager2 = ((h7) vr.Y(this)).getModifierLocalManager();
                as1 as1Var3 = modifierLocalManager2.b;
                if (as1Var3 == null) {
                    as1Var3 = new as1();
                    modifierLocalManager2.b = as1Var3;
                }
                as1Var3.b(this);
                as1 as1Var4 = modifierLocalManager2.c;
                if (as1Var4 == null) {
                    as1Var4 = new as1();
                    modifierLocalManager2.c = as1Var4;
                }
                as1Var4.b(fe2Var);
                modifierLocalManager2.a();
            }
        }
        if ((this.h & 4) != 0 && !z) {
            vr.U(this, 2).E1();
        }
        if ((this.h & 2) != 0) {
            rc3 rc3Var2 = vr.X(this).L.e;
            rc3Var2.getClass();
            if (rc3Var2.t) {
                ex1 ex1Var = this.m;
                ex1Var.getClass();
                ((nb1) ex1Var).Z1(this);
                p12 p12Var = ex1Var.a0;
                if (p12Var != null) {
                    ((tw0) p12Var).c();
                }
            }
            if (!z) {
                vr.U(this, 2).E1();
                vr.X(this).E();
            }
        }
        if (zp1Var instanceof ge1) {
            ge1 ge1Var = (ge1) zp1Var;
            tb1 tb1VarX = vr.X(this);
            switch (ge1Var.a) {
                case 0:
                    ((ie1) ge1Var.b).k = tb1VarX;
                    break;
                default:
                    ((i32) ge1Var.b).w.setValue(tb1VarX);
                    break;
            }
        }
        int i = this.h;
        if ((i & 16) != 0 && (zp1Var instanceof mb2)) {
            ((mb2) zp1Var).d.g = this.m;
        }
        if ((i & 8) != 0) {
            ((h7) vr.Y(this)).A();
        }
    }

    public final void q1() {
        if (!this.s) {
            m21.c("unInitializeModifier called on unattached node");
        }
        zp1 zp1Var = this.t;
        if ((this.h & 32) != 0 && (zp1Var instanceof eq1)) {
            cq1 modifierLocalManager = ((h7) vr.Y(this)).getModifierLocalManager();
            fe2 fe2Var = ((eq1) zp1Var).e;
            as1 as1Var = modifierLocalManager.d;
            if (as1Var == null) {
                as1Var = new as1();
                modifierLocalManager.d = as1Var;
            }
            as1Var.b(vr.X(this));
            as1 as1Var2 = modifierLocalManager.e;
            if (as1Var2 == null) {
                as1Var2 = new as1();
                modifierLocalManager.e = as1Var2;
            }
            as1Var2.b(fe2Var);
            modifierLocalManager.a();
        }
        if ((this.h & 8) != 0) {
            ((h7) vr.Y(this)).A();
        }
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        return ((ib1) zp1Var).t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hn1.f, in1.f, 1), n30.b(0, 0, 0, i, 7)).g();
    }

    public final void r1() {
        if (this.s) {
            this.v.clear();
            t12 snapshotObserver = ((h7) vr.Y(this)).getSnapshotObserver();
            snapshotObserver.a.d(this, w7.b, new ja(4, this));
        }
    }

    @Override // defpackage.hp0
    public final void s0(fp0 fp0Var) {
        zp1 zp1Var = this.t;
        m21.c("applyFocusProperties called on wrong node");
        zp1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        return ((ib1) zp1Var).t(en1Var, xm1Var, j);
    }

    public final String toString() {
        return this.t.toString();
    }

    @Override // defpackage.so0
    public final void x0(mp0 mp0Var) {
        zp1 zp1Var = this.t;
        m21.c("onFocusEvent called on wrong node");
        zp1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        return ((ib1) zp1Var).t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hn1.g, in1.f, 1), n30.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.jb2
    public final boolean z0() {
        zp1 zp1Var = this.t;
        zp1Var.getClass();
        ((mb2) zp1Var).d.getClass();
        return true;
    }

    @Override // defpackage.ya1
    public final void J(ab1 ab1Var) {
    }

    @Override // defpackage.ya1, defpackage.gn1
    public final void i(long j) {
    }
}
