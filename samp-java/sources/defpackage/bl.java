package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bl extends vq3 {
    public final String b = "SaveableStateHolder_BackStackEntryKey";
    public final String c;
    public vr3 d;

    public bl(lq2 lq2Var) {
        Object value;
        lq2Var.getClass();
        qk qkVar = lq2Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) qkVar.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) qkVar.d;
        try {
            i93 i93Var = (i93) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (i93Var == null || (value = i93Var.getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) qkVar.c).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String str = this.b;
            str.getClass();
            if (string != null) {
                ArrayList arrayList = nq2.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (((Class) obj).isInstance(string)) {
                        }
                    }
                }
                qn1.m(string.getClass(), " into saved state", "Can't put value with type ");
                throw null;
            }
            ArrayList arrayList2 = nq2.a;
            lq2Var.a.get(str);
            qkVar.n(string, str);
        }
        this.c = string;
    }

    @Override // defpackage.vq3
    public final void d() {
        vr3 vr3Var = this.d;
        if (vr3Var == null) {
            s51.F("saveableStateHolderRef");
            throw null;
        }
        dq2 dq2Var = (dq2) vr3Var.a.get();
        if (dq2Var != null) {
            dq2Var.f(this.c);
        }
        vr3 vr3Var2 = this.d;
        if (vr3Var2 != null) {
            vr3Var2.a.clear();
        } else {
            s51.F("saveableStateHolderRef");
            throw null;
        }
    }
}
