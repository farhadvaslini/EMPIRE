package defpackage;

import android.graphics.Rect;
import android.view.autofill.AutofillId;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l6 extends ik implements ap0 {
    public final a31 f;
    public final yu2 g;
    public final h7 h;
    public final lk2 i;
    public final String j;
    public final Rect k = new Rect();
    public final AutofillId l;
    public final pr1 m;
    public boolean n;

    public l6(a31 a31Var, yu2 yu2Var, h7 h7Var, lk2 lk2Var, String str) {
        this.f = a31Var;
        this.g = yu2Var;
        this.h = h7Var;
        this.i = lk2Var;
        this.j = str;
        h7Var.setImportantForAutofill(1);
        AutofillId autofillId = h7Var.getAutofillId();
        if (autofillId == null) {
            throw nc2.d("Required value was null.");
        }
        this.l = autofillId;
        this.m = new pr1();
    }

    @Override // defpackage.ap0
    public final void a(rp0 rp0Var, rp0 rp0Var2) {
        tb1 tb1VarX;
        qu2 qu2VarW;
        tb1 tb1VarX2;
        qu2 qu2VarW2;
        h7 h7Var = this.h;
        a31 a31Var = this.f;
        if (rp0Var != null && (tb1VarX2 = vr.X(rp0Var)) != null && (qu2VarW2 = tb1VarX2.w()) != null && f80.v(qu2VarW2)) {
            a31Var.w().notifyViewExited(h7Var, tb1VarX2.g);
        }
        if (rp0Var2 == null || (tb1VarX = vr.X(rp0Var2)) == null || (qu2VarW = tb1VarX.w()) == null || !f80.v(qu2VarW)) {
            return;
        }
        int i = tb1VarX.g;
        lk2 lk2Var = this.i;
        tb1 tb1Var = (tb1) lk2Var.a.b(i);
        if (tb1Var == null || tb1Var.l == -4) {
            return;
        }
        h9 h9Var = lk2Var.c;
        int iE = lk2Var.e(tb1Var);
        long[] jArr = (long[]) h9Var.c;
        long j = jArr[iE];
        long j2 = jArr[iE + 1];
        a31Var.w().notifyViewEntered(h7Var, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
