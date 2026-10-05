package defpackage;

import android.view.ActionMode;
import android.view.View;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c4 implements ic0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ic0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                y3 y3Var = ((t3) obj).a;
                if (y3Var == null) {
                    c.q("Launcher has not been initialized");
                } else {
                    y3Var.b();
                }
                break;
            case 1:
                pb0 pb0Var = (pb0) obj;
                pb0Var.dismiss();
                pb0Var.m.e();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                rb2 rb2Var = (rb2) obj;
                rb2Var.e();
                rb2Var.setTag(2131230924, null);
                rb2Var.u.removeViewImmediate(rb2Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                wb wbVar = (wb) obj;
                p73 p73Var = wbVar.e;
                b4 b4Var = p73Var.h;
                if (b4Var != null) {
                    b4Var.b();
                }
                p73Var.a();
                ActionMode actionMode = wbVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                wbVar.h = null;
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                sl slVar = (sl) ((tl) obj).c.getValue();
                if (slVar != null) {
                    slVar.close();
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                jr jrVar = ((jj3) obj).c;
                if (jrVar != null) {
                    jrVar.C(null);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((tw) obj).g();
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((sf3) obj).o();
                break;
            case 8:
                qk0 qk0Var = (qk0) obj;
                View view = qk0Var.g;
                if (qk0Var.f) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(qk0Var);
                    qk0Var.f = false;
                }
                view.removeOnAttachStateChangeListener(qk0Var);
                break;
            case vr.g /* 9 */:
                ((yc1) obj).d = null;
                break;
            case vr.h /* 10 */:
                nd1 nd1Var = (nd1) obj;
                yj0 yj0Var = nd1Var.c;
                if (yj0Var != null) {
                    yj0Var.a = false;
                }
                nd1Var.c = null;
                break;
            case 11:
                jd1 jd1Var = (jd1) obj;
                jd1Var.f = true;
                jd1Var.d = 0;
                jd1Var.c();
                break;
            case vr.i /* 12 */:
                jp1 jp1Var = (jp1) obj;
                jp1Var.dismiss();
                jp1Var.n.e();
                break;
            case 13:
                oa2 oa2Var = (oa2) obj;
                i93 i93Var = oa2Var.o;
                Object value = i93Var.getValue();
                i92 i92Var = value instanceof i92 ? (i92) value : null;
                if ((i92Var != null ? i92Var.a : null) == f92.g) {
                    w83 w83Var = oa2Var.g;
                    if (w83Var != null) {
                        w83Var.c(null);
                    }
                    i93Var.j(null, h92.a);
                }
                break;
            case 14:
                RaksampNativeBridge.INSTANCE.nativeSetNearbyScanEnabled(((vi2) obj).c, false);
                break;
            default:
                ((it2) ((u10) obj)).z(null);
                break;
        }
    }
}
