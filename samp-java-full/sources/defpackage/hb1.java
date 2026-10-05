package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    public /* synthetic */ hb1(int i, List list) {
        this.f = i;
        this.g = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // defpackage.rs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) {
        Object next;
        r32 r32Var;
        Object next2;
        int i = this.f;
        List list = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        rs0 rs0Var = (rs0) list.get(i2);
                        int iHashCode = Long.hashCode(nv0Var.T);
                        w10.c.getClass();
                        v3 v3Var = f5.B;
                        nv0Var.d0();
                        if (nv0Var.S) {
                            nv0Var.k(v3Var);
                        } else {
                            nv0Var.m0();
                        }
                        y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                        rs0Var.f(nv0Var, 0);
                        nv0Var.p(true);
                    }
                } else {
                    nv0Var.U();
                }
                return dm3.a;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    int size2 = list.size();
                    if (size2 == 0) {
                        c.m("List is empty.");
                        return null;
                    }
                    if (size2 != 1) {
                        c.p("List has more than one element.");
                        return null;
                    }
                    String str = (String) list.get(0);
                    int iO0 = y93.o0(charSequence, str, iIntValue2, false, 4);
                    r32Var = iO0 < 0 ? null : new r32(Integer.valueOf(iO0), str);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    l41 l41Var = new l41(iIntValue2, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i3 = l41Var.h;
                    int i4 = l41Var.g;
                    if (z) {
                        if ((i3 > 0 && iIntValue2 <= i4) || (i3 < 0 && i4 <= iIntValue2)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (str2.regionMatches(0, (String) charSequence, iIntValue2, str2.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    r32Var = new r32(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i4) {
                                    iIntValue2 += i3;
                                }
                            }
                        }
                    } else if ((i3 > 0 && iIntValue2 <= i4) || (i3 < 0 && i4 <= iIntValue2)) {
                        int i5 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (y93.u0(str4, 0, charSequence, i5, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                r32Var = new r32(Integer.valueOf(i5), str5);
                            } else if (i5 != i4) {
                                i5 += i3;
                            }
                        }
                    }
                }
                if (r32Var != null) {
                    return new r32(r32Var.f, Integer.valueOf(((String) r32Var.g).length()));
                }
                return null;
        }
    }
}
