package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends aq1 implements hp0, ViewTreeObserver.OnGlobalFocusChangeListener {
    public ViewTreeObserver t;
    public final uo0 u;
    public final uo0 v;

    /* JADX WARN: Type inference failed for: r0v0, types: [uo0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [uo0] */
    public vo0() {
        final int i = 0;
        this.u = new ns0(this) { // from class: uo0
            public final /* synthetic */ vo0 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int i2 = i;
                dm3 dm3Var = dm3.a;
                vo0 vo0Var = this.g;
                fr frVar = (fr) obj;
                switch (i2) {
                    case 0:
                        View viewL = lq.l(vo0Var);
                        if (!viewL.isFocused() && !viewL.hasFocus()) {
                            bp0 focusOwner = ((h7) vr.Y(vo0Var)).getFocusOwner();
                            View viewS = vp.S(vo0Var);
                            Integer numC = yo0.c(frVar.a);
                            int[] iArr = new int[2];
                            viewS.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewL.getLocationOnScreen(iArr2);
                            rp0 rp0VarS = br.s(((ep0) focusOwner).c);
                            Rect rect = null;
                            jk2 jk2VarV = rp0VarS != null ? br.v(rp0VarS) : null;
                            if (jk2VarV != null) {
                                int i3 = (int) jk2VarV.a;
                                int i4 = iArr[0];
                                int i5 = iArr2[0];
                                int i6 = (int) jk2VarV.b;
                                int i7 = iArr[1];
                                int i8 = iArr2[1];
                                rect = new Rect((i3 + i4) - i5, (i6 + i7) - i8, (((int) jk2VarV.c) + i4) - i5, (((int) jk2VarV.d) + i7) - i8);
                            }
                            if (!yo0.b(viewL, numC, rect)) {
                                frVar.b = true;
                            }
                        }
                        break;
                    default:
                        lq.l(vo0Var);
                        break;
                }
                return dm3Var;
            }
        };
        final int i2 = 1;
        this.v = new ns0(this) { // from class: uo0
            public final /* synthetic */ vo0 g;

            {
                this.g = this;
            }

            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int i22 = i2;
                dm3 dm3Var = dm3.a;
                vo0 vo0Var = this.g;
                fr frVar = (fr) obj;
                switch (i22) {
                    case 0:
                        View viewL = lq.l(vo0Var);
                        if (!viewL.isFocused() && !viewL.hasFocus()) {
                            bp0 focusOwner = ((h7) vr.Y(vo0Var)).getFocusOwner();
                            View viewS = vp.S(vo0Var);
                            Integer numC = yo0.c(frVar.a);
                            int[] iArr = new int[2];
                            viewS.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            viewL.getLocationOnScreen(iArr2);
                            rp0 rp0VarS = br.s(((ep0) focusOwner).c);
                            Rect rect = null;
                            jk2 jk2VarV = rp0VarS != null ? br.v(rp0VarS) : null;
                            if (jk2VarV != null) {
                                int i3 = (int) jk2VarV.a;
                                int i4 = iArr[0];
                                int i5 = iArr2[0];
                                int i6 = (int) jk2VarV.b;
                                int i7 = iArr[1];
                                int i8 = iArr2[1];
                                rect = new Rect((i3 + i4) - i5, (i6 + i7) - i8, (((int) jk2VarV.c) + i4) - i5, (((int) jk2VarV.d) + i7) - i8);
                            }
                            if (!yo0.b(viewL, numC, rect)) {
                                frVar.b = true;
                            }
                        }
                        break;
                    default:
                        lq.l(vo0Var);
                        break;
                }
                return dm3Var;
            }
        };
    }

    @Override // defpackage.aq1
    public final void h1() {
        ViewTreeObserver viewTreeObserver = vp.S(this).getViewTreeObserver();
        this.t = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.aq1
    public final void i1() {
        ViewTreeObserver viewTreeObserver = this.t;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.t = null;
        vp.S(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (vr.X(this).t == null) {
            return;
        }
        View viewL = lq.l(this);
        bp0 focusOwner = ((h7) vr.Y(this)).getFocusOwner();
        q12 q12VarY = vr.Y(this);
        if (view == null || view.equals(q12VarY)) {
            z = false;
        } else {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == viewL.getParent()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (view2 == null || view2.equals(q12VarY)) {
            z2 = false;
        } else {
            for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                if (parent2 == viewL.getParent()) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        if (z && z2) {
            return;
        }
        if (!z2) {
            if (z && p1().u1().a()) {
                ((ep0) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        rp0 rp0VarP1 = p1();
        int iOrdinal = rp0VarP1.u1().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            uq.C(rp0VarP1);
        } else {
            c.k();
        }
    }

    public final rp0 p1() {
        boolean z;
        if (!this.f.s) {
            m21.c("visitLocalDescendants called on an unattached node");
        }
        aq1 aq1Var = this.f;
        if ((aq1Var.i & 1024) != 0) {
            boolean z2 = false;
            for (aq1 aq1Var2 = aq1Var.k; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                if ((aq1Var2.h & 1024) != 0) {
                    aq1 aq1VarJ = aq1Var2;
                    qs1 qs1Var = null;
                    while (aq1VarJ != null) {
                        if (aq1VarJ instanceof rp0) {
                            rp0 rp0Var = (rp0) aq1VarJ;
                            if (z2) {
                                return rp0Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                            int i = 0;
                            for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                if ((aq1Var3.h & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        aq1VarJ = aq1Var3;
                                    } else {
                                        if (qs1Var == null) {
                                            qs1Var = new qs1(new aq1[16]);
                                        }
                                        if (aq1VarJ != null) {
                                            qs1Var.b(aq1VarJ);
                                            aq1VarJ = null;
                                        }
                                        qs1Var.b(aq1Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        aq1VarJ = vr.j(qs1Var);
                    }
                }
            }
        }
        c.q("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // defpackage.hp0
    public final void s0(fp0 fp0Var) {
        fp0Var.c(false);
        fp0Var.a(this.u);
        fp0Var.e(this.v);
    }
}
