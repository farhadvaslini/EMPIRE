package defpackage;

import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mw0 extends br {
    public final CharSequence k;
    public final TextPaint l;

    public mw0(CharSequence charSequence, TextPaint textPaint) {
        this.k = charSequence;
        this.l = textPaint;
    }

    @Override // defpackage.br
    public final int I(int i) {
        CharSequence charSequence = this.k;
        return this.l.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.br
    public final int J(int i) {
        CharSequence charSequence = this.k;
        return this.l.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
