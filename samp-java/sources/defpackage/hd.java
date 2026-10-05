package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hd extends u71 implements ns0 {
    public static final hd h;
    public static final hd i;
    public static final hd j;
    public static final hd k;
    public static final hd l;
    public static final hd m;
    public static final hd n;
    public static final hd o;
    public static final hd p;
    public static final hd q;
    public static final hd r;
    public static final hd s;
    public static final hd t;
    public static final hd u;
    public static final hd v;
    public static final hd w;
    public static final hd x;
    public final /* synthetic */ int g;

    static {
        int i2 = 1;
        h = new hd(i2, 0);
        i = new hd(i2, 1);
        j = new hd(i2, 2);
        k = new hd(i2, 3);
        l = new hd(i2, 4);
        m = new hd(i2, 5);
        n = new hd(i2, 6);
        o = new hd(i2, 7);
        p = new hd(i2, 8);
        q = new hd(i2, 9);
        r = new hd(i2, 10);
        s = new hd(i2, 11);
        t = new hd(i2, 12);
        u = new hd(i2, 13);
        v = new hd(i2, 14);
        w = new hd(i2, 15);
        x = new hd(i2, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd(int i2, int i3) {
        super(i2);
        this.g = i3;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i2 = this.g;
        dm3 dm3Var = dm3.a;
        ti0 ti0Var = ti0.g;
        switch (i2) {
            case 0:
                return obj;
            case 1:
                return null;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                long jA = wx.a(((wx) obj).a, ky.x);
                return new te(wx.d(jA), wx.h(jA), wx.g(jA), wx.e(jA));
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return obj;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                long j2 = ((wj3) obj).a;
                return new re(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            case 8:
                re reVar = (re) obj;
                return new wj3(d32.g(reVar.a, reVar.b));
            case vr.g /* 9 */:
                return n92.F(0.0f, 0.0f, null, 7);
            case vr.h /* 10 */:
                ((p41) obj).getClass();
                return new i41(0L);
            case 11:
                return new p41(((p41) obj).a);
            case vr.i /* 12 */:
                return dj0.d;
            case 13:
                return dm3Var;
            case 14:
                qf0.h0((qf0) obj, wx.f, 0L, 0L, 0.0f, null, 0, 126);
                return dm3Var;
            case jo3.g /* 15 */:
                return Boolean.valueOf(((ti0) obj) == ti0Var);
            case 16:
                return Boolean.valueOf(((ti0) obj) == ti0Var);
            case 17:
                return new p41((((long) ((int) (((p41) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            case 18:
                return new p41((((long) ((int) (((p41) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 19:
                return new p41((((long) ((int) (((p41) obj).a & 4294967295L))) & 4294967295L) | (((long) 0) << 32));
            default:
                return new p41((((long) ((int) (((p41) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
