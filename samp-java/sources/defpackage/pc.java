package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pc extends kx {
    public final /* synthetic */ int h;
    public final /* synthetic */ ViewGroup i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc(ViewGroup viewGroup, int i) {
        super(1);
        this.h = i;
        this.i = viewGroup;
    }

    @Override // defpackage.kx
    public final mt3 f(mt3 mt3Var, List list) {
        int i = this.h;
        ViewGroup viewGroup = this.i;
        switch (i) {
            case 0:
                return ((pq3) viewGroup).m(mt3Var);
            default:
                kb0 kb0Var = (kb0) viewGroup;
                if (kb0Var.r) {
                    return mt3Var;
                }
                View childAt = kb0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, kb0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, kb0Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? mt3Var : mt3Var.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // defpackage.kx
    public final ar2 h(ss3 ss3Var, ar2 ar2Var) {
        int i = this.h;
        ViewGroup viewGroup = this.i;
        switch (i) {
            case 0:
                s21 s21Var = ((pq3) viewGroup).E.L.c;
                if (!s21Var.i0.s) {
                    return ar2Var;
                }
                long jH = uq.H(s21Var.k0(0L));
                int i2 = (int) (jH >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jH & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jI0 = vr.y(s21Var).i0();
                int i4 = (int) (jI0 >> 32);
                int i5 = (int) (jI0 & 4294967295L);
                long j = s21Var.h;
                long jH2 = uq.H(s21Var.k0((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jH2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jH2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? ar2Var : new ar2(7, tc.l((h31) ar2Var.g, i2, i3, i6, i8), tc.l((h31) ar2Var.h, i2, i3, i6, i8));
            default:
                kb0 kb0Var = (kb0) viewGroup;
                if (kb0Var.r) {
                    return ar2Var;
                }
                View childAt = kb0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, kb0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, kb0Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return ar2Var;
                }
                h31 h31VarB = h31.b(iMax, iMax2, iMax3, iMax4);
                int i9 = h31VarB.a;
                h31 h31Var = (h31) ar2Var.g;
                int i10 = h31VarB.b;
                int i11 = h31VarB.c;
                int i12 = h31VarB.d;
                return new ar2(7, mt3.a(h31Var, i9, i10, i11, i12), mt3.a((h31) ar2Var.h, i9, i10, i11, i12));
        }
    }
}
