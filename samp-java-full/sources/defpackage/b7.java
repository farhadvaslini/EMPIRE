package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b7 extends b1 {
    public final /* synthetic */ h7 i;
    public final /* synthetic */ tb1 j;
    public final /* synthetic */ h7 k;

    public b7(h7 h7Var, tb1 tb1Var, h7 h7Var2) {
        this.i = h7Var;
        this.j = tb1Var;
        this.k = h7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // defpackage.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, s1 s1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = s1Var.a;
        this.f.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        h7 h7Var = this.i;
        o7 o7Var = h7Var.B;
        if (o7Var.q()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        tb1 tb1Var = this.j;
        tb1 tb1VarU = tb1Var.u();
        while (true) {
            if (tb1VarU == null) {
                tb1VarU = null;
                break;
            } else if (tb1VarU.L.d(8)) {
                break;
            } else {
                tb1VarU = tb1VarU.u();
            }
        }
        Integer numValueOf = tb1VarU != null ? Integer.valueOf(tb1VarU.g) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == h7Var.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        }
        int iIntValue = numValueOf.intValue();
        s1Var.b = iIntValue;
        h7 h7Var2 = this.k;
        accessibilityNodeInfo.setParent(h7Var2, iIntValue);
        int i = tb1Var.g;
        int iD = o7Var.G.d(i);
        if (iD != -1) {
            tc tcVarK = t22.K(h7Var.getAndroidViewsHandler$ui(), iD);
            if (tcVarK != null) {
                accessibilityNodeInfo.setTraversalBefore(tcVarK);
            } else {
                accessibilityNodeInfo.setTraversalBefore(h7Var2, iD);
            }
            h7.e(h7Var, i, accessibilityNodeInfo, o7Var.I);
        }
        int iD2 = o7Var.H.d(i);
        if (iD2 != -1) {
            tc tcVarK2 = t22.K(h7Var.getAndroidViewsHandler$ui(), iD2);
            if (tcVarK2 != null) {
                accessibilityNodeInfo.setTraversalAfter(tcVarK2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(h7Var2, iD2);
            }
            h7.e(h7Var, i, accessibilityNodeInfo, o7Var.J);
        }
    }
}
