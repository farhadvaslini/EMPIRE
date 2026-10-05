package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class q72 {
    public static final uk2 a = new uk2("^(\\^?)(0|[1-9]\\d{0,3})\\.(0|[1-9]\\d{0,3})$");
    public static final uk2 b = new uk2("^(0|[1-9]\\d{0,3})\\.(0|[1-9]\\d{0,3})$");

    public static boolean a(String str) {
        sm1 sm1VarB;
        Integer numF0;
        str.getClass();
        sm1 sm1VarB2 = a.b(y93.G0(str).toString());
        if (sm1VarB2 == null || (sm1VarB = b.b("1.1")) == null || (numF0 = fa3.f0((String) ((qm1) sm1VarB2.a()).get(2))) == null) {
            return false;
        }
        int iIntValue = numF0.intValue();
        Integer numF02 = fa3.f0((String) ((qm1) sm1VarB2.a()).get(3));
        if (numF02 == null) {
            return false;
        }
        int iIntValue2 = numF02.intValue();
        Integer numF03 = fa3.f0((String) ((qm1) sm1VarB.a()).get(1));
        if (numF03 == null) {
            return false;
        }
        int iIntValue3 = numF03.intValue();
        Integer numF04 = fa3.f0((String) ((qm1) sm1VarB.a()).get(2));
        if (numF04 == null) {
            return false;
        }
        int iIntValue4 = numF04.intValue();
        if (iIntValue3 != iIntValue) {
            return false;
        }
        return (iIntValue != 0 && iIntValue4 >= iIntValue2) || (iIntValue == 0 && iIntValue4 == iIntValue2);
    }
}
