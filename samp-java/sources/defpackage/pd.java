package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pd extends u71 implements rs0 {
    public static final pd h;
    public static final pd i;
    public final /* synthetic */ int g;

    static {
        int i2 = 2;
        h = new pd(i2, 0);
        i = new pd(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd(int i2, int i3) {
        super(i2);
        this.g = i3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                long j = ((p41) obj).a;
                long j2 = ((p41) obj2).a;
                jk2 jk2Var = mr3.a;
                return n92.F(0.0f, 400.0f, new p41(4294967297L), 1);
            default:
                ti0 ti0Var = (ti0) obj2;
                return Boolean.valueOf(((ti0) obj) == ti0Var && ti0Var == ti0.h);
        }
    }
}
