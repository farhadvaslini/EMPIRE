package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class eg implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ eg(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f
            android.content.Context r10 = r10.g
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L13;
                default: goto L7;
            }
        L7:
            ld2 r0 = new ld2
            r0.<init>()
            h01 r1 = defpackage.s51.C
            r2 = 0
            defpackage.s51.L(r10, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            eg r0 = new eg
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2d:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lad
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lad
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L84
            tj r0 = defpackage.jg.l
            r0.getClass()
            oj r2 = new oj
            r2.<init>(r0)
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            jg r0 = (defpackage.jg) r0
            if (r0 == 0) goto L53
            vg r0 = (defpackage.vg) r0
            android.content.Context r0 = r0.p
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L89
            android.os.LocaleList r0 = defpackage.gg.a(r0)
            rj1 r2 = new rj1
            sj1 r5 = new sj1
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8b
        L84:
            rj1 r2 = defpackage.jg.h
            if (r2 == 0) goto L89
            goto L8b
        L89:
            rj1 r2 = defpackage.rj1.b
        L8b:
            sj1 r0 = r2.a
            android.os.LocaleList r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
            java.lang.String r0 = defpackage.r51.A(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto La6
            android.os.LocaleList r0 = defpackage.fg.a(r0)
            defpackage.gg.b(r2, r0)
        La6:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lad:
            defpackage.jg.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg.run():void");
    }
}
