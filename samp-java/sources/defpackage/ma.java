package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ma implements x50 {
    public final View f;
    public final gg3 g;
    public final x50 h;
    public final AtomicReference i = new AtomicReference(null);

    public ma(View view, gg3 gg3Var, x50 x50Var) {
        this.f = view;
        this.g = gg3Var;
        this.h = x50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ze1 r8, defpackage.q40 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.ka
            if (r0 == 0) goto L13
            r0 = r9
            ka r0 = (defpackage.ka) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            ka r0 = new ka
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            int r1 = r0.k
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return
        L27:
            defpackage.y02.Q(r9)
            goto L50
        L2b:
            defpackage.y02.Q(r9)
            r9 = r2
            i r2 = new i
            r1 = 2
            r2.<init>(r1, r8, r7)
            j r4 = new j
            r8 = 3
            r5 = 0
            r4.<init>(r7, r5, r8)
            r0.k = r9
            n9 r1 = new n9
            r6 = 15
            java.util.concurrent.atomic.AtomicReference r3 = r7.i
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r7 = defpackage.ur.w(r1, r0)
            y50 r8 = defpackage.y50.f
            if (r7 != r8) goto L50
            return
        L50:
            defpackage.c.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma.a(ze1, q40):void");
    }

    @Override // defpackage.x50
    public final o50 h() {
        return this.h.h();
    }
}
