package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ai0 implements yh0 {
    public final /* synthetic */ int f;
    public final String g;

    public /* synthetic */ ai0(int i, String str) {
        this.f = i;
        this.g = str;
    }

    @Override // defpackage.yh0
    public boolean j(CharSequence charSequence, int i, int i2, jl3 jl3Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.g)) {
            return true;
        }
        jl3Var.c = (jl3Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 1:
                return "<" + this.g + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.yh0
    public Object a() {
        return this;
    }
}
