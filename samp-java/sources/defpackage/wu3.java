package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class wu3 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.tu3 a(defpackage.w r7, defpackage.a20 r8, defpackage.d00 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.iw0.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            np r0 = defpackage.lr.a(r2, r0, r3)
            xb3 r4 = defpackage.gc.r
            java.lang.Object r4 = r4.getValue()
            o50 r4 = (defpackage.o50) r4
            n40 r4 = defpackage.ur.c(r4)
            l r5 = new l
            r6 = 17
            r5.<init>(r0, r3, r6)
            r6 = 3
            defpackage.cl3.t(r4, r3, r5, r6)
            s r4 = new s
            r5 = 26
            r4.<init>(r5, r0)
            java.lang.Object r0 = defpackage.a73.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.a73.i     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r4 = defpackage.qx.E0(r5, r4)     // Catch: java.lang.Throwable -> L3e
            defpackage.a73.i = r4     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            defpackage.a73.a()
            goto L41
        L3e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L41:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5b
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.h7
            if (r1 == 0) goto L52
            h7 r0 = (defpackage.h7) r0
            goto L53
        L52:
            r0 = r3
        L53:
            if (r0 == 0) goto L59
            r0.setComposeViewContext(r8)
            goto L5f
        L59:
            r0 = r3
            goto L5f
        L5b:
            r7.removeAllViews()
            goto L59
        L5f:
            if (r0 != 0) goto L73
            h7 r0 = new h7
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.wu3.a
            r7.addView(r1, r4)
        L73:
            r0.setComposeViewContext(r8)
            a20 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L82
            r8.e()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L82:
            r7 = 2131230932(0x7f0800d4, float:1.807793E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.tu3
            if (r2 == 0) goto L90
            r3 = r1
            tu3 r3 = (defpackage.tu3) r3
        L90:
            if (r3 != 0) goto Lac
            tu3 r3 = new tu3
            tl3 r1 = new tl3
            tb1 r2 = r0.getRoot()
            r1.<init>(r2)
            g20 r2 = r8.c()
            l20 r4 = new l20
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Lac:
            r3.d(r9)
            g20 r7 = r8.c()
            vu3 r8 = new vu3
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu3.a(w, a20, d00):tu3");
    }
}
