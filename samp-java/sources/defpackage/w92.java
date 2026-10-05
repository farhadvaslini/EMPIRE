package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w92 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w92(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int iCompare = ((up0) obj3).compare(obj, obj2);
                return iCompare != 0 ? iCompare : ur.t(((y31) obj).a.d, ((y31) obj2).a.d);
            case 1:
                s12 s12Var = (s12) obj3;
                String str = (String) s12Var.h(obj);
                str.getClass();
                ou2 ou2VarU = n32.u(str, false);
                if (ou2VarU != null) {
                    String str2 = (String) s12Var.h(obj2);
                    str2.getClass();
                    ou2 ou2VarU2 = n32.u(str2, false);
                    if (ou2VarU2 != null) {
                        return ou2VarU.compareTo(ou2VarU2);
                    }
                }
                c.q("Invalid semantic version");
                return 0;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int iCompare2 = ((up0) obj3).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                long j = ((wx) ((r32) obj).f).a;
                long j2 = wx.f;
                return (wx.c(j, j2) ? 1 : num).compareTo(wx.c(((wx) ((r32) obj2).f).a, j2) ? 1 : 0);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int iCompare3 = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                tb1 tb1Var = ((vu2) obj).c;
                tb1 tb1Var2 = ((vu2) obj2).c;
                return tb1Var.x() == tb1Var2.x() ? s51.r(tb1Var.v(), tb1Var2.v()) : Float.compare(tb1Var.x(), tb1Var2.x());
            default:
                int iCompare4 = ((w92) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : Integer.valueOf(((vu2) obj).f).compareTo(Integer.valueOf(((vu2) obj2).f));
        }
    }
}
