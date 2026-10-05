package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;
    public final /* synthetic */ kq2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ka1(sa1 sa1Var, kq2 kq2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
        this.m = kq2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ka1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        kq2 kq2Var = this.m;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                return new ka1(sa1Var, kq2Var, p40Var, 0);
            default:
                return new ka1(sa1Var, kq2Var, p40Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r10.c(r0, r9) == r5) goto L25;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object value;
        Map map;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        kq2 kq2Var = this.m;
        sa1 sa1Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                String str = kq2Var.e;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    sa1Var.p.i(null);
                    qy2 qy2Var = sa1Var.c;
                    this.k = 1;
                    if (qy2Var.i(str, this) != y50Var) {
                    }
                    return y50Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    i93 i93Var = sa1Var.k;
                    do {
                        value = i93Var.getValue();
                        Map map2 = (Map) value;
                        map2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.remove(str);
                        int size = linkedHashMap.size();
                        map = linkedHashMap;
                        if (size == 0) {
                            map = oi0.f;
                        } else if (size == 1) {
                            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                            Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                            mapSingletonMap.getClass();
                            map = mapSingletonMap;
                        }
                    } while (!i93Var.h(value, map));
                    return dm3Var;
                }
                y02.Q(obj);
                lf2 lf2Var = sa1Var.f;
                this.k = 2;
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    sv2 sv2Var = kq2Var.a;
                    this.k = 1;
                    return sa1.f(sa1Var, sv2Var, this) == y50Var ? y50Var : dm3Var;
                }
                if (i3 == 1) {
                    y02.Q(obj);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
