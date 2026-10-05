package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fe0 extends pn2 implements rs0 {
    public za2 h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mk2 l;
    public final /* synthetic */ qk2 m;
    public final /* synthetic */ qk2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe0(mk2 mk2Var, qk2 qk2Var, qk2 qk2Var2, p40 p40Var) {
        super(p40Var);
        this.l = mk2Var;
        this.m = qk2Var;
        this.n = qk2Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((fe0) m((p40) obj2, (rb3) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        fe0 fe0Var = new fe0(this.l, this.m, this.n, p40Var);
        fe0Var.k = obj;
        return fe0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[EDGE_INSN: B:69:0x00ce->B:45:0x00ce BREAK  A[LOOP:0: B:40:0x00bb->B:44:0x00cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00af -> B:39:0x00b2). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        rb3 rb3Var;
        int i;
        Object objC;
        za2 za2Var;
        int size;
        int i2;
        int size2;
        int i3;
        Object objC2;
        Object obj2;
        Object obj3;
        int i4 = this.j;
        za2 za2Var2 = null;
        int i5 = 2;
        int i6 = 1;
        y50 y50Var = y50.f;
        if (i4 == 0) {
            y02.Q(obj);
            rb3Var = (rb3) this.k;
            i = 0;
            if (i != 0) {
            }
        } else {
            if (i4 == 1) {
                i = this.i;
                rb3Var = (rb3) this.k;
                y02.Q(obj);
                objC = obj;
                za2Var = (za2) objC;
                List list = za2Var.a;
                size = list.size();
                i2 = 0;
                while (true) {
                    if (i2 >= size) {
                    }
                    i2++;
                }
                List list2 = za2Var.a;
                size2 = list2.size();
                while (i3 < size2) {
                }
                if (za2Var.c != i5) {
                }
                this.k = rb3Var;
                this.h = za2Var;
                this.i = i;
                this.j = i5;
                objC2 = rb3Var.c(ab2.h, this);
                if (objC2 != y50Var) {
                }
                return y50Var;
            }
            if (i4 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.i;
            za2 za2Var3 = this.h;
            rb3 rb3Var2 = (rb3) this.k;
            y02.Q(obj);
            int i7 = 1;
            objC2 = obj;
            List list3 = ((za2) objC2).a;
            int size3 = list3.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size3) {
                    break;
                }
                if (((gb2) list3.get(i8)).c()) {
                    i = i7;
                    break;
                }
                i8++;
            }
            qk2 qk2Var = this.m;
            boolean zG = le0.g(za2Var3, ((gb2) qk2Var.f).a);
            List list4 = za2Var3.a;
            qk2 qk2Var2 = this.n;
            if (!zG) {
                int size4 = list4.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size4) {
                        obj3 = za2Var2;
                        break;
                    }
                    obj3 = list4.get(i9);
                    if (((gb2) obj3).d) {
                        break;
                    }
                    i9++;
                }
                gb2 gb2Var = (gb2) obj3;
                if (gb2Var == null) {
                    i = i7;
                    i6 = i;
                    rb3Var = rb3Var2;
                    if (i != 0) {
                        return dm3.a;
                    }
                    this.k = rb3Var;
                    this.h = za2Var2;
                    this.i = i;
                    this.j = i6;
                    objC = rb3Var.c(ab2.g, this);
                    if (objC != y50Var) {
                        za2Var = (za2) objC;
                        List list5 = za2Var.a;
                        size = list5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i = i6;
                                break;
                            }
                            if (!w22.n((gb2) list5.get(i2))) {
                                break;
                            }
                            i2++;
                        }
                        List list22 = za2Var.a;
                        size2 = list22.size();
                        for (i3 = 0; i3 < size2; i3++) {
                            gb2 gb2Var2 = (gb2) list22.get(i3);
                            if (gb2Var2.c() || w22.y(gb2Var2, rb3Var.k.D, rb3Var.E())) {
                                break;
                            }
                        }
                        if (za2Var.c != i5) {
                            i7 = 1;
                            this.l.f = true;
                            i = 1;
                        } else {
                            i7 = 1;
                        }
                        this.k = rb3Var;
                        this.h = za2Var;
                        this.i = i;
                        this.j = i5;
                        objC2 = rb3Var.c(ab2.h, this);
                        if (objC2 != y50Var) {
                            rb3Var2 = rb3Var;
                            za2Var3 = za2Var;
                            List list32 = ((za2) objC2).a;
                            int size32 = list32.size();
                            int i82 = 0;
                            while (true) {
                                if (i82 >= size32) {
                                }
                                i82++;
                            }
                            qk2 qk2Var3 = this.m;
                            boolean zG2 = le0.g(za2Var3, ((gb2) qk2Var3.f).a);
                            List list42 = za2Var3.a;
                            qk2 qk2Var22 = this.n;
                            if (!zG2) {
                                int size5 = list42.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size5) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = list42.get(i10);
                                    if (d32.l(((gb2) obj2).a, ((gb2) qk2Var3.f).a)) {
                                        break;
                                    }
                                    i10++;
                                }
                                qk2Var22.f = obj2;
                            }
                        }
                    }
                    return y50Var;
                }
                qk2Var3.f = gb2Var;
                qk2Var22.f = gb2Var;
            }
            rb3Var = rb3Var2;
            za2Var2 = null;
            i5 = 2;
            i6 = 1;
            if (i != 0) {
            }
        }
    }
}
