package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xm0 extends xu1 {
    @Override // defpackage.xu1
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return Float.valueOf(f);
        }
        jo3.q(str);
        throw null;
    }

    @Override // defpackage.xu1
    public final String b() {
        return "float";
    }

    @Override // defpackage.xu1
    public final Object d(String str) {
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.xu1
    public final void e(Bundle bundle, String str, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        str.getClass();
        bundle.putFloat(str, fFloatValue);
    }
}
