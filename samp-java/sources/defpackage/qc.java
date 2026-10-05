package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qc implements cn1 {
    public final /* synthetic */ pq3 a;
    public final /* synthetic */ tb1 b;

    public qc(pq3 pq3Var, tb1 tb1Var) {
        this.a = pq3Var;
        this.b = tb1Var;
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        pq3 pq3Var = this.a;
        ViewGroup.LayoutParams layoutParams = pq3Var.getLayoutParams();
        layoutParams.getClass();
        pq3Var.measure(tc.k(pq3Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return pq3Var.getMeasuredHeight();
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        pq3 pq3Var = this.a;
        ViewGroup.LayoutParams layoutParams = pq3Var.getLayoutParams();
        layoutParams.getClass();
        pq3Var.measure(iMakeMeasureSpec, tc.k(pq3Var, 0, i, layoutParams.height));
        return pq3Var.getMeasuredWidth();
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        pq3 pq3Var = this.a;
        int childCount = pq3Var.getChildCount();
        oi0 oi0Var = oi0.f;
        if (childCount == 0) {
            return en1Var.I0(m30.k(j), m30.j(j), oi0Var, new u0(19));
        }
        if (m30.k(j) != 0) {
            pq3Var.getChildAt(0).setMinimumWidth(m30.k(j));
        }
        if (m30.j(j) != 0) {
            pq3Var.getChildAt(0).setMinimumHeight(m30.j(j));
        }
        int iK = m30.k(j);
        int i = m30.i(j);
        ViewGroup.LayoutParams layoutParams = pq3Var.getLayoutParams();
        layoutParams.getClass();
        int iK2 = tc.k(pq3Var, iK, i, layoutParams.width);
        int iJ = m30.j(j);
        int iH = m30.h(j);
        ViewGroup.LayoutParams layoutParams2 = pq3Var.getLayoutParams();
        layoutParams2.getClass();
        pq3Var.measure(iK2, tc.k(pq3Var, iJ, iH, layoutParams2.height));
        return en1Var.I0(pq3Var.getMeasuredWidth(), pq3Var.getMeasuredHeight(), oi0Var, new nc(pq3Var, this.b, 2));
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        pq3 pq3Var = this.a;
        ViewGroup.LayoutParams layoutParams = pq3Var.getLayoutParams();
        layoutParams.getClass();
        pq3Var.measure(tc.k(pq3Var, 0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return pq3Var.getMeasuredHeight();
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        pq3 pq3Var = this.a;
        ViewGroup.LayoutParams layoutParams = pq3Var.getLayoutParams();
        layoutParams.getClass();
        pq3Var.measure(iMakeMeasureSpec, tc.k(pq3Var, 0, i, layoutParams.height));
        return pq3Var.getMeasuredWidth();
    }
}
