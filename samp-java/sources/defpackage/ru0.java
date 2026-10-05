package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ru0 implements TextWatcher {
    public final /* synthetic */ GameActivity f;

    public ru0(GameActivity gameActivity) {
        this.f = gameActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x001a, B:7:0x0017), top: B:11:0x0004 }] */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
        /*
            r0 = this;
            top.th1nk.samp.feature.game.GameActivity r0 = r0.f
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L17
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1d
            r2.getClass()     // Catch: java.lang.Throwable -> L1d
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Throwable -> L1d
            r1.getClass()     // Catch: java.lang.Throwable -> L1d
            goto L1a
        L17:
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L1d
        L1a:
            top.th1nk.samp.feature.game.GameActivity.access$nativeUpdateCleoDialogInput(r0, r1)     // Catch: java.lang.Throwable -> L1d
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru0.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
