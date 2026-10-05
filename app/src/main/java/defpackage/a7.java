package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a7 extends aq1 implements no, tu2, i71, kb1, nk3 {
    public final s t = new s(5, this);
    public final /* synthetic */ h7 u;

    public a7(h7 h7Var) {
        this.u = h7Var;
    }

    @Override // defpackage.i71
    public final boolean F(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.nk3
    public final Object K() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.no
    public final Object U0(ex1 ex1Var, u1 u1Var, q40 q40Var) {
        long jK0 = ex1Var.k0(0L);
        jk2 jk2Var = (jk2) u1Var.a();
        jk2 jk2VarI = jk2Var != null ? jk2Var.i(jK0) : null;
        if (jk2VarI != null) {
            this.u.requestRectangleOnScreen(new Rect((int) jk2VarI.a, (int) jk2VarI.b, (int) jk2VarI.c, (int) jk2VarI.d), false);
        }
        return dm3.a;
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        return en1Var.o0(i62VarT.f, i62VarT.g, oi0.f, this.t, new z6(i62VarT, 0));
    }

    @Override // defpackage.i71
    public final boolean u0(KeyEvent keyEvent) {
        ro0 ro0Var;
        int[] iArr = yo0.a;
        long jE = ur.E(keyEvent);
        if (c71.a(jE, c71.b)) {
            ro0Var = new ro0(2);
        } else if (c71.a(jE, c71.c)) {
            ro0Var = new ro0(1);
        } else if (c71.a(jE, c71.p)) {
            ro0Var = new ro0(keyEvent.isShiftPressed() ? 2 : 1);
        } else {
            ro0Var = c71.a(jE, c71.g) ? new ro0(4) : c71.a(jE, c71.f) ? new ro0(3) : (c71.a(jE, c71.d) || c71.a(jE, c71.C)) ? new ro0(5) : (c71.a(jE, c71.e) || c71.a(jE, c71.D)) ? new ro0(6) : (c71.a(jE, c71.h) || c71.a(jE, c71.r) || c71.a(jE, c71.E)) ? new ro0(7) : (c71.a(jE, c71.a) || c71.a(jE, c71.u)) ? new ro0(8) : null;
        }
        if (ro0Var != null) {
            int i = ro0Var.a;
            if (ur.G(keyEvent) == 2) {
                h7 h7Var = this.u;
                rp0 rp0VarF = ((ep0) h7Var.getFocusOwner()).f();
                if (rp0VarF != null && rp0VarF.t && h7Var.v(i)) {
                    h7Var.getPlayNavigationSoundEffect$ui().f(ro0Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                Boolean boolE = ((ep0) h7Var.getFocusOwner()).e(i, h7Var.getEmbeddedViewFocusRect(), new s(4, ro0Var));
                if (boolE == null) {
                    return true;
                }
                if (boolE.booleanValue()) {
                    h7Var.getPlayNavigationSoundEffect$ui().f(ro0Var, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
                    return true;
                }
                if (i != 1 && i != 2) {
                    return false;
                }
                Integer numC = yo0.c(i);
                int iIntValue = numC != null ? numC.intValue() : 2;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = h7Var.getRootView();
                rootView.getClass();
                View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, h7Var.getView(), iIntValue);
                if (viewFindNextFocus == null || viewFindNextFocus.equals(h7Var)) {
                    return ((ep0) h7Var.getFocusOwner()).h(i);
                }
            }
        }
        return false;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
    }
}
