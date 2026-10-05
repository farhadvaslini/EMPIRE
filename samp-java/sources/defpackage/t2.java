package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t2 extends er0 {
    public final /* synthetic */ int o = 0;
    public final /* synthetic */ View p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.p = actionMenuItemView;
    }

    @Override // defpackage.er0
    public final v33 b() {
        v2 v2Var;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                u2 u2Var = ((ActionMenuItemView) view).r;
                if (u2Var == null || (v2Var = ((w2) u2Var).a.y) == null) {
                    return null;
                }
                return v2Var.a();
            default:
                v2 v2Var2 = ((y2) view).i.x;
                if (v2Var2 == null) {
                    return null;
                }
                return v2Var2.a();
        }
    }

    @Override // defpackage.er0
    public final boolean c() {
        v33 v33VarB;
        int i = this.o;
        View view = this.p;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                mn1 mn1Var = actionMenuItemView.p;
                if (mn1Var == null || !mn1Var.a(actionMenuItemView.m) || (v33VarB = b()) == null || !v33VarB.a()) {
                }
                break;
            default:
                ((y2) view).i.l();
                break;
        }
        return true;
    }

    @Override // defpackage.er0
    public boolean d() {
        switch (this.o) {
            case 1:
                z2 z2Var = ((y2) this.p).i;
                if (z2Var.z != null) {
                    return false;
                }
                z2Var.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(y2 y2Var, y2 y2Var2) {
        super(y2Var2);
        this.p = y2Var;
    }
}
