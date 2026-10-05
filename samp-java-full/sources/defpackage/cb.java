package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cb extends aq1 implements m20, of0, ya1 {
    public boolean B;
    public io2 D;
    public jo2 E;
    public final t41 t;
    public final boolean u;
    public final float v;
    public final ma0 w;
    public final la0 x;
    public ot y;
    public float z;
    public long A = 0;
    public final as1 C = new as1();

    public cb(t41 t41Var, boolean z, float f, ma0 ma0Var, la0 la0Var) {
        this.t = t41Var;
        this.u = z;
        this.v = f;
        this.w = ma0Var;
        this.x = la0Var;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        cl3.t(d1(), null, new hd1(this, null, 18), 3);
    }

    @Override // defpackage.ya1, defpackage.gn1
    public final void i(long j) {
        float fT;
        this.B = true;
        ua0 ua0Var = vr.X(this).E;
        this.A = lr.T(j);
        float f = this.v;
        if (Float.isNaN(f)) {
            long j2 = this.A;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            fT = gy1.c((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)) / 2.0f;
            if (this.u) {
                fT += ua0Var.T(10.0f);
            }
        } else {
            fT = ua0Var.T(f);
        }
        this.z = fT;
        as1 as1Var = this.C;
        Object[] objArr = as1Var.a;
        int i = as1Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            p1((bd2) objArr[i2]);
        }
        as1Var.e();
    }

    @Override // defpackage.aq1
    public final void i1() {
        io2 io2Var = this.D;
        if (io2Var != null) {
            this.E = null;
            vr.J(this);
            a31 a31Var = io2Var.i;
            jo2 jo2Var = (jo2) ((LinkedHashMap) a31Var.g).get(this);
            if (jo2Var != null) {
                jo2Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) a31Var.g;
                jo2 jo2Var2 = (jo2) linkedHashMap.get(this);
                if (jo2Var2 != null) {
                }
                linkedHashMap.remove(this);
                io2Var.h.add(jo2Var);
            }
        }
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        rr rrVar = vb1Var.f;
        vb1Var.c();
        ot otVar = this.y;
        if (otVar != null) {
            float f = this.z;
            long jA = this.w.a();
            float fFloatValue = ((Number) ((ed) otVar.c).d()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = wx.b(fFloatValue, jA);
                if (otVar.a) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (rrVar.a() >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rrVar.a() & 4294967295L));
                    pi piVar = rrVar.g;
                    long jA2 = piVar.A();
                    piVar.k().l();
                    try {
                        ((yl1) piVar.g).t(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                        qf0.a0(vb1Var, jB, f, 0L, null, 124);
                    } finally {
                        nc2.t(piVar, jA2);
                    }
                } else {
                    qf0.a0(vb1Var, jB, f, 0L, null, 124);
                }
            }
        }
        pr prVarK = rrVar.g.k();
        jo2 jo2Var = this.E;
        if (jo2Var != null) {
            long j = this.A;
            int iM = vm1.M(this.z);
            long jA3 = this.w.a();
            this.x.a();
            jo2Var.e(j, iM, jA3);
            jo2Var.draw(o6.a(prVarK));
        }
    }

    public final void p1(bd2 bd2Var) {
        jo2 jo2Var;
        if (!(bd2Var instanceof zc2)) {
            if (bd2Var instanceof ad2) {
                jo2 jo2Var2 = this.E;
                if (jo2Var2 != null) {
                    jo2Var2.d();
                    return;
                }
                return;
            }
            if (!(bd2Var instanceof yc2) || (jo2Var = this.E) == null) {
                return;
            }
            jo2Var.d();
            return;
        }
        zc2 zc2Var = (zc2) bd2Var;
        long j = this.A;
        float f = this.z;
        io2 io2Var = this.D;
        if (io2Var == null) {
            Object obj = (View) ur.z(this, x7.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    qn1.m(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    io2 io2Var2 = new io2(viewGroup.getContext());
                    viewGroup.addView(io2Var2);
                    io2Var = io2Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof io2) {
                        io2Var = (io2) childAt;
                        break;
                    }
                    i++;
                }
            }
            this.D = io2Var;
        }
        ArrayList arrayList = io2Var.g;
        a31 a31Var = io2Var.i;
        LinkedHashMap linkedHashMap = (LinkedHashMap) a31Var.g;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) a31Var.g;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) a31Var.h;
        jo2 jo2Var3 = (jo2) linkedHashMap.get(this);
        int i2 = 1;
        if (jo2Var3 == null) {
            ArrayList arrayList2 = io2Var.h;
            arrayList2.getClass();
            jo2Var3 = (jo2) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (jo2Var3 == null) {
                if (io2Var.j > vr.C(arrayList)) {
                    jo2Var3 = new jo2(io2Var.getContext());
                    io2Var.addView(jo2Var3);
                    arrayList.add(jo2Var3);
                } else {
                    jo2Var3 = (jo2) arrayList.get(io2Var.j);
                    cb cbVar = (cb) linkedHashMap3.get(jo2Var3);
                    if (cbVar != null) {
                        cbVar.E = null;
                        vr.J(cbVar);
                        jo2 jo2Var4 = (jo2) linkedHashMap2.get(cbVar);
                        if (jo2Var4 != null) {
                        }
                        linkedHashMap2.remove(cbVar);
                        jo2Var3.c();
                    }
                }
                int i3 = io2Var.j;
                if (i3 < io2Var.f - 1) {
                    io2Var.j = i3 + 1;
                } else {
                    io2Var.j = 0;
                }
            }
            linkedHashMap2.put(this, jo2Var3);
            linkedHashMap3.put(jo2Var3, this);
        }
        jo2 jo2Var5 = jo2Var3;
        int iM = vm1.M(f);
        long jA = this.w.a();
        this.x.a();
        jo2Var5.b(zc2Var, this.u, j, iM, jA, new ja(i2, this));
        this.E = jo2Var5;
        vr.J(this);
    }
}
