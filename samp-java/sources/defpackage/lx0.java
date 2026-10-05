package defpackage;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class lx0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;

    public /* synthetic */ lx0(cs0 cs0Var, int i) {
        this.f = i;
        this.g = cs0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        cs0 cs0Var = this.g;
        switch (i) {
            case 0:
                try {
                    return (List) cs0Var.a();
                } catch (SSLPeerUnverifiedException unused) {
                    return ni0.f;
                }
            case 1:
                cs0Var.a();
                return Boolean.TRUE;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                cs0Var.a();
                return Boolean.TRUE;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new i90(0, 0.0f, cs0Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                float fFloatValue = ((Number) cs0Var.a()).floatValue();
                float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                return Float.valueOf(f);
            default:
                cs0Var.a();
                return dm3.a;
        }
    }
}
