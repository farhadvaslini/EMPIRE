package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ r g;

    public /* synthetic */ h(r rVar, int i) {
        this.f = i;
        this.g = rVar;
    }

    @Override // defpackage.cs0
    public final Object a() {
        ia0 ia0Var;
        int i = this.f;
        r rVar = this.g;
        switch (i) {
            case 0:
                o11 o11Var = (o11) ur.z(rVar, l11.a);
                if (o11Var == null) {
                    p21.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + o11Var);
                }
                o11 o11Var2 = rVar.D;
                rVar.D = o11Var;
                if (o11Var2 != null && !s51.n(o11Var, o11Var2) && ((ia0Var = rVar.G) != null || !rVar.N)) {
                    if (ia0Var != null) {
                        rVar.q1(ia0Var);
                    }
                    rVar.G = null;
                    rVar.A1();
                }
                return dm3.a;
            default:
                rVar.E1();
                return Boolean.TRUE;
        }
    }
}
