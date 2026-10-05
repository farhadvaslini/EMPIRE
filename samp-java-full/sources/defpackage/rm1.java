package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rm1 extends t {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ rm1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.t
    public final int a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((sm1) obj).a.groupCount() + 1;
            default:
                o52 o52Var = (o52) obj;
                o52Var.getClass();
                return o52Var.g;
        }
    }

    public pm1 b(int i) {
        Matcher matcher = ((sm1) this.g).a;
        l41 l41VarS = y02.S(matcher.start(i), matcher.end(i));
        if (l41VarS.f < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new pm1(strGroup, l41VarS);
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                if (obj == null ? true : obj instanceof pm1) {
                    return super.contains((pm1) obj);
                }
                return false;
            default:
                return ((o52) this.g).containsValue(obj);
        }
    }

    @Override // defpackage.t, java.util.Collection
    public boolean isEmpty() {
        switch (this.f) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                return new yj3(new sc3(new vj(1, new l41(0, size() - 1, 1)), new xc1(6, this), 1));
            default:
                tk3 tk3Var = ((o52) this.g).f;
                uk3[] uk3VarArr = new uk3[8];
                for (int i = 0; i < 8; i++) {
                    uk3VarArr[i] = new vk3(2);
                }
                return new w52(tk3Var, uk3VarArr);
        }
    }
}
