package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 implements gq2 {
    public final ns0 f;
    public final is1 g;
    public is1 h;

    public hq2(Map map, ns0 ns0Var) {
        is1 is1Var;
        this.f = ns0Var;
        if (map == null || map.isEmpty()) {
            is1Var = null;
        } else {
            is1Var = new is1(map.size());
            for (Map.Entry entry : map.entrySet()) {
                is1Var.m(entry.getKey(), entry.getValue());
            }
        }
        this.g = is1Var;
    }

    @Override // defpackage.gq2
    public final fq2 a(String str, cs0 cs0Var) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ur.I(str.charAt(i))) {
                is1 is1Var = this.h;
                if (is1Var == null) {
                    long[] jArr = nr2.a;
                    is1Var = new is1();
                    this.h = is1Var;
                }
                Object objG = is1Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    is1Var.m(str, objG);
                }
                ((List) objG).add(cs0Var);
                return new pi(is1Var, str, cs0Var, 17);
            }
        }
        c.p("Registered key is empty or blank");
        return null;
    }

    @Override // defpackage.gq2
    public final boolean b(Object obj) {
        return ((Boolean) this.f.h(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // defpackage.gq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map c() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        char c2;
        long j4;
        is1 is1Var = this.g;
        if (is1Var == null && this.h == null) {
            return oi0.f;
        }
        int i3 = 0;
        int i4 = is1Var != null ? is1Var.e : 0;
        is1 is1Var2 = this.h;
        HashMap map = new HashMap(i4 + (is1Var2 != null ? is1Var2.e : 0));
        char c3 = 7;
        long j5 = -9187201950435737472L;
        int i5 = 8;
        if (is1Var != null) {
            Object[] objArr = is1Var.b;
            Object[] objArr2 = is1Var.c;
            long[] jArr3 = is1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j6 = jArr3[i6];
                    j3 = 255;
                    if ((((~j6) << c3) & j6 & j5) != j5) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j6 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                c2 = c3;
                                j4 = j5;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            } else {
                                c2 = c3;
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i8++;
                            c3 = c2;
                            j5 = j4;
                        }
                        c = c3;
                        j = j5;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                        j = j5;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j5 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        }
        is1 is1Var3 = this.h;
        if (is1Var3 != null) {
            Object[] objArr3 = is1Var3.b;
            Object[] objArr4 = is1Var3.c;
            long[] jArr4 = is1Var3.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j7 = jArr4[i10];
                    if ((((~j7) << c) & j7 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j7 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objA = ((cs0) list.get(i3)).a();
                                    if (objA != null) {
                                        if (!b(objA)) {
                                            qn1.e(oz2.r(objA));
                                            return null;
                                        }
                                        map.put(str, vr.m(objA));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objA2 = ((cs0) list.get(i3)).a();
                                        if (objA2 != null && !b(objA2)) {
                                            qn1.e(oz2.r(objA2));
                                            return null;
                                        }
                                        arrayList.add(objA2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j7 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // defpackage.gq2
    public final Object d(String str) {
        is1 is1Var = this.g;
        List list = is1Var != null ? (List) is1Var.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && is1Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = is1Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = is1Var.c;
            Object obj = objArr[iF];
            is1Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
