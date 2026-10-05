package defpackage;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a8(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws vb0 {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                w7.I((c8) obj2, (LongSparseArray) obj);
                return;
            case 1:
                hg hgVar = (hg) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    hgVar.a();
                }
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((xz) obj2).f((xy1) obj);
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                GameActivity.showCleoBreakpoint$lambda$0((GameActivity) obj2, (String) obj);
                return;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                GameActivity.setClipboardTextBytes$lambda$0((GameActivity) obj2, (byte[]) obj);
                return;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((jr) obj2).H((jx0) obj);
                return;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((xh) obj2).k((Typeface) obj);
                return;
            default:
                tu3 tu3Var = (tu3) obj2;
                gf1 gf1Var = (gf1) obj;
                if (tu3Var.h) {
                    return;
                }
                tu3Var.i = gf1Var;
                gf1Var.a(tu3Var);
                return;
        }
    }
}
