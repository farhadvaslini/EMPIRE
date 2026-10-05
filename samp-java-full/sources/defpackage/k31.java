package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k31 extends kx implements Runnable, oy1, View.OnAttachStateChangeListener {
    public boolean h;
    public int i;
    public mt3 j;
    public final is1 k;
    public final a42 l;
    public final as1 m;
    public final l73 n;

    public k31() {
        super(1);
        is1 is1Var = new is1(9);
        st3.a.getClass();
        is1Var.m(rt3.b, new hu3("caption bar"));
        is1Var.m(rt3.c, new hu3("display cutout"));
        is1Var.m(rt3.d, new hu3("ime"));
        is1Var.m(rt3.e, new hu3("mandatory system gestures"));
        is1Var.m(rt3.f, new hu3("navigation bars"));
        is1Var.m(rt3.g, new hu3("status bars"));
        is1Var.m(rt3.h, new hu3("system gestures"));
        is1Var.m(rt3.i, new hu3("tappable element"));
        is1Var.m(rt3.j, new hu3("waterfall"));
        this.k = is1Var;
        this.l = new a42(0);
        this.m = new as1(4);
        this.n = new l73();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(mt3 mt3Var) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        or1 or1Var = ut3.a;
        int[] iArr3 = or1Var.b;
        Object[] objArr3 = or1Var.c;
        long[] jArr3 = or1Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            st3 st3Var = (st3) objArr3[i6];
                            h31 h31VarI = mt3Var.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (((long) h31VarI.a) << 48) | (((long) h31VarI.b) << 32) | (((long) h31VarI.c) << 16) | ((long) h31VarI.d);
                            Object objG = this.k.g(st3Var);
                            objG.getClass();
                            hu3 hu3Var = (hu3) objG;
                            j2 = j3;
                            if (!w22.r(j4, hu3Var.h)) {
                                hu3Var.h = j4;
                                z2 = true;
                                if (!w22.r(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                h31 h31VarJ = mt3Var.a.j(i7);
                                objArr2 = objArr3;
                                long j5 = (((long) h31VarJ.b) << 32) | (((long) h31VarJ.a) << 48) | (((long) h31VarJ.c) << 16) | ((long) h31VarJ.d);
                                if (!w22.r(hu3Var.i, j5)) {
                                    hu3Var.i = j5;
                                    z2 = true;
                                    if (!w22.r(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            hu3Var.a.setValue(Boolean.valueOf(mt3Var.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        cc0 cc0VarH = mt3Var.a.h();
        if (cc0VarH == null) {
            j = 0;
        } else {
            h31 h31VarA = cc0VarH.a();
            j = (((long) h31VarA.a) << c3) | (((long) h31VarA.b) << c2) | (((long) h31VarA.c) << c) | ((long) h31VarA.d);
        }
        is1 is1Var = this.k;
        st3.a.getClass();
        Object objG2 = is1Var.g(rt3.j);
        objG2.getClass();
        hu3 hu3Var2 = (hu3) objG2;
        hu3Var2.a.setValue(Boolean.valueOf(!w22.r(j, 0L)));
        if (!w22.r(hu3Var2.h, j)) {
            hu3Var2.h = j;
            hu3Var2.i = j;
            z2 = z;
            if (!w22.r(j, 0L)) {
                z3 = z2;
            }
        }
        if (cc0VarH == null) {
            as1 as1Var = this.m;
            if (as1Var.b > 0) {
                as1Var.e();
                this.n.clear();
                z2 = z;
            }
        } else {
            List listB = Build.VERSION.SDK_INT >= 28 ? bc0.b(cc0VarH.a) : Collections.EMPTY_LIST;
            int size = listB.size();
            as1 as1Var2 = this.m;
            if (size < as1Var2.b) {
                as1Var2.m(listB.size(), this.m.b);
                this.n.e(listB.size(), this.n.size());
                z2 = z;
            } else {
                int size2 = listB.size() - this.m.b;
                int i8 = 0;
                while (i8 < size2) {
                    as1 as1Var3 = this.m;
                    as1Var3.b(b32.w(listB.get(as1Var3.b)));
                    this.n.add(new t21(by1.e(this.m.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listB.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listB.get(i9);
                os1 os1Var = (os1) this.m.g(i9);
                if (!s51.n(os1Var.getValue(), rect)) {
                    os1Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listB.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.l.g() != 0) && z2) {
            a42 a42Var = this.l;
            a42Var.h(a42Var.g() + 1);
            synchronized (a73.c) {
                js1 js1Var = a73.j.h;
                if (js1Var != null) {
                    boolean z5 = z;
                    z4 = js1Var.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                a73.a();
            }
        }
    }

    @Override // defpackage.kx
    public final void d(ss3 ss3Var) {
        boolean z = false;
        this.h = false;
        int iD = ss3Var.a.d();
        this.i &= ~iD;
        this.j = null;
        st3 st3Var = (st3) ut3.a.b(iD);
        if (st3Var != null) {
            Object objG = this.k.g(st3Var);
            objG.getClass();
            hu3 hu3Var = (hu3) objG;
            hu3Var.c.h(0.0f);
            hu3Var.e.h(1.0f);
            hu3Var.d.h(0L);
            hu3Var.c.h(0.0f);
            hu3Var.b.setValue(Boolean.FALSE);
            hu3Var.j = -1L;
            hu3Var.k = -1L;
            a42 a42Var = this.l;
            a42Var.h(a42Var.g() + 1);
            synchronized (a73.c) {
                js1 js1Var = a73.j.h;
                if (js1Var != null) {
                    if (js1Var.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                a73.a();
            }
        }
    }

    @Override // defpackage.kx
    public final void e(ss3 ss3Var) {
        this.h = true;
    }

    @Override // defpackage.kx
    public final mt3 f(mt3 mt3Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ss3 ss3Var = (ss3) list.get(i);
            st3 st3Var = (st3) ut3.a.b(ss3Var.a.d());
            if (st3Var != null) {
                Object objG = this.k.g(st3Var);
                objG.getClass();
                hu3 hu3Var = (hu3) objG;
                if (((Boolean) hu3Var.b.getValue()).booleanValue()) {
                    rs3 rs3Var = ss3Var.a;
                    hu3Var.c.h(rs3Var.c());
                    hu3Var.e.h(rs3Var.a());
                    hu3Var.d.h(rs3Var.b());
                }
            }
        }
        E(mt3Var);
        return mt3Var;
    }

    @Override // defpackage.oy1
    public final mt3 g(View view, mt3 mt3Var) {
        if (this.h) {
            this.j = mt3Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return mt3Var;
            }
        } else if (this.i == 0) {
            E(mt3Var);
        }
        return mt3Var;
    }

    @Override // defpackage.kx
    public final ar2 h(ss3 ss3Var, ar2 ar2Var) {
        mt3 mt3Var = this.j;
        boolean z = false;
        this.h = false;
        this.j = null;
        if (ss3Var.a.b() > 0 && mt3Var != null) {
            int iD = ss3Var.a.d();
            this.i |= iD;
            st3 st3Var = (st3) ut3.a.b(iD);
            if (st3Var != null) {
                Object objG = this.k.g(st3Var);
                objG.getClass();
                hu3 hu3Var = (hu3) objG;
                h31 h31VarI = mt3Var.a.i(iD);
                long j = (((long) h31VarI.a) << 48) | (((long) h31VarI.b) << 32) | (((long) h31VarI.c) << 16) | ((long) h31VarI.d);
                long j2 = hu3Var.h;
                if (!w22.r(j, j2)) {
                    hu3Var.j = j2;
                    hu3Var.k = j;
                    hu3Var.b.setValue(Boolean.TRUE);
                    rs3 rs3Var = ss3Var.a;
                    hu3Var.c.h(rs3Var.c());
                    hu3Var.e.h(rs3Var.a());
                    hu3Var.d.h(rs3Var.b());
                    a42 a42Var = this.l;
                    a42Var.h(a42Var.g() + 1);
                    synchronized (a73.c) {
                        js1 js1Var = a73.j.h;
                        if (js1Var != null) {
                            if (js1Var.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        a73.a();
                        return ar2Var;
                    }
                }
            }
        }
        return ar2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = mq3.a;
        fq3.c(view, this);
        mq3.k(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = mq3.a;
        fq3.c(view, null);
        mq3.k(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.h) {
            this.i = 0;
            this.h = false;
            mt3 mt3Var = this.j;
            if (mt3Var != null) {
                E(mt3Var);
                this.j = null;
            }
        }
    }
}
