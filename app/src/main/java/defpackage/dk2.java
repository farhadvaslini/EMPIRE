package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dk2 extends mb3 implements ss0 {
    public List j;
    public List k;
    public List l;
    public js1 m;
    public js1 n;
    public js1 o;
    public Set p;
    public js1 q;
    public int r;
    public /* synthetic */ ic s;
    public final /* synthetic */ ek2 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk2(ek2 ek2Var, p40 p40Var) {
        super(3, p40Var);
        this.t = ek2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(ek2 ek2Var, List list, List list2, List list3, js1 js1Var, js1 js1Var2, js1 js1Var3, js1 js1Var4) {
        char c;
        long j;
        long j2;
        synchronized (ek2Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    l20 l20Var = (l20) list3.get(i);
                    l20Var.a();
                    ek2Var.L(l20Var);
                }
                list3.clear();
                Object[] objArr = js1Var.b;
                long[] jArr = js1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    l20 l20Var2 = (l20) objArr[(i2 << 3) + i4];
                                    l20Var2.a();
                                    ek2Var.L(l20Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                js1Var.b();
                Object[] objArr2 = js1Var2.b;
                long[] jArr2 = js1Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((l20) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                js1Var2.b();
                js1Var3.b();
                Object[] objArr3 = js1Var4.b;
                long[] jArr3 = js1Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    l20 l20Var3 = (l20) objArr3[(i8 << 3) + i10];
                                    l20Var3.a();
                                    ek2Var.L(l20Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                js1Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void r(List list, ek2 ek2Var) {
        list.clear();
        synchronized (ek2Var.c) {
            try {
                ArrayList arrayList = ek2Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((yq1) arrayList.get(i));
                }
                ek2Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        dk2 dk2Var = new dk2(this.t, (p40) obj3);
        dk2Var.s = (ic) obj2;
        dk2Var.o(dm3.a);
        return y50.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        ic icVar;
        js1 js1Var;
        js1 js1Var2;
        List list;
        Set set;
        List list2;
        js1 js1Var3;
        List list3;
        js1 js1Var4;
        List list4;
        js1 js1Var5;
        List list5;
        js1 js1Var6;
        ek2 ek2Var;
        Object objQ;
        jr jrVar;
        y50 y50Var;
        ic icVar2;
        as1 as1Var;
        y50 y50Var2 = y50.f;
        int i = this.r;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            y02.Q(obj);
            icVar = this.s;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            js1 js1Var7 = or2.a;
            js1Var = new js1();
            js1 js1Var8 = new js1();
            js1 js1Var9 = new js1();
            pr2 pr2Var = new pr2(js1Var9);
            js1Var2 = new js1();
            list = arrayList;
            set = pr2Var;
            list2 = arrayList2;
            js1Var3 = js1Var9;
            list3 = arrayList3;
            js1Var4 = js1Var8;
            synchronized (this.t.c) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                js1 js1Var10 = this.q;
                set = this.p;
                js1Var3 = this.o;
                js1Var4 = this.n;
                js1Var = this.m;
                list3 = this.l;
                list2 = this.k;
                list = this.j;
                ic icVar3 = this.s;
                y02.Q(obj);
                js1Var2 = js1Var10;
                icVar = icVar3;
                ek2 ek2Var2 = this.t;
                synchronized (ek2Var2.c) {
                    try {
                        if (ek2Var2.l.j()) {
                            as1 as1VarB = jr1.b(ek2Var2.l);
                            ek2Var2.l.a();
                            a31 a31Var = ek2Var2.m;
                            ((is1) a31Var.g).a();
                            ((is1) a31Var.h).a();
                            ek2Var2.o.a();
                            as1Var = new as1(as1VarB.b);
                            Object[] objArr = as1VarB.a;
                            int i4 = as1VarB.b;
                            y50Var = y50Var2;
                            int i5 = 0;
                            while (i5 < i4) {
                                int i6 = i5;
                                yq1 yq1Var = (yq1) objArr[i5];
                                as1Var.b(new r32(yq1Var, ek2Var2.n.g(yq1Var)));
                                i5 = i6 + 1;
                                icVar = icVar;
                                objArr = objArr;
                            }
                            icVar2 = icVar;
                            ek2Var2.n.a();
                        } else {
                            y50Var = y50Var2;
                            icVar2 = icVar;
                            as1Var = cy1.b;
                            as1Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = as1Var.a;
                int i7 = as1Var.b;
                for (int i8 = 0; i8 < i7; i8++) {
                    r32 r32Var = (r32) objArr2[i8];
                }
                pi piVar = this.t.b;
                ((bk) piVar.g).set(0);
                ((qk) piVar.h).h(new fi1(25));
                y50Var2 = y50Var;
                icVar = icVar2;
                i2 = 2;
                i3 = 1;
                synchronized (this.t.c) {
                }
                ek2 ek2Var3 = this.t;
                this.s = icVar;
                this.j = list;
                this.k = list2;
                this.l = list3;
                this.m = js1Var;
                this.n = js1Var4;
                this.o = js1Var3;
                this.p = set;
                this.q = js1Var2;
                this.r = i3;
                if (ek2Var3.C()) {
                    objQ = dm3.a;
                } else {
                    jr jrVar2 = new jr(i3, vr.I(this));
                    jrVar2.s();
                    synchronized (ek2Var3.c) {
                        if (ek2Var3.C()) {
                            jrVar = jrVar2;
                        } else {
                            ek2Var3.r = jrVar2;
                            jrVar = null;
                        }
                    }
                    if (jrVar != null) {
                        jrVar.t(dm3.a);
                    }
                    objQ = jrVar2.q();
                    if (objQ != y50.f) {
                        objQ = dm3.a;
                    }
                }
                if (objQ != y50Var2) {
                    List list6 = list;
                    js1Var5 = js1Var;
                    js1Var6 = js1Var2;
                    list4 = list3;
                    list5 = list6;
                    Set set2 = set;
                    js1 js1Var11 = js1Var4;
                    js1 js1Var12 = js1Var3;
                    ek2Var = this.t;
                    i93 i93Var = ek2.z;
                    if (ek2Var.K()) {
                        List list7 = list4;
                        js1Var2 = js1Var6;
                        js1Var = js1Var5;
                        list = list5;
                        list3 = list7;
                        js1Var3 = js1Var12;
                        js1Var4 = js1Var11;
                        set = set2;
                        synchronized (this.t.c) {
                        }
                    } else {
                        ck2 ck2Var = new ck2(this.t, js1Var12, js1Var6, list5, list2, js1Var5, list4, js1Var11, set2);
                        this.s = icVar;
                        this.j = list5;
                        this.k = list2;
                        this.l = list4;
                        this.m = js1Var5;
                        this.n = js1Var11;
                        this.o = js1Var12;
                        this.p = set2;
                        this.q = js1Var6;
                        this.r = i2;
                        if (icVar.a(ck2Var, this) != y50Var2) {
                            List list8 = list4;
                            js1Var2 = js1Var6;
                            js1Var = js1Var5;
                            list = list5;
                            list3 = list8;
                            js1Var3 = js1Var12;
                            js1Var4 = js1Var11;
                            set = set2;
                            ek2 ek2Var22 = this.t;
                            synchronized (ek2Var22.c) {
                            }
                        }
                    }
                }
                return y50Var2;
            }
            js1 js1Var13 = this.q;
            set = this.p;
            js1Var3 = this.o;
            js1Var4 = this.n;
            js1 js1Var14 = this.m;
            List list9 = this.l;
            list2 = this.k;
            List list10 = this.j;
            ic icVar4 = this.s;
            y02.Q(obj);
            js1Var6 = js1Var13;
            icVar = icVar4;
            list4 = list9;
            list5 = list10;
            js1Var5 = js1Var14;
            Set set22 = set;
            js1 js1Var112 = js1Var4;
            js1 js1Var122 = js1Var3;
            ek2Var = this.t;
            i93 i93Var2 = ek2.z;
            if (ek2Var.K()) {
            }
        }
    }
}
