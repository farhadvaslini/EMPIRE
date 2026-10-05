package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s8 implements View.OnDragListener, od0 {
    public final rd0 a;
    public final tj b;
    public final r8 c;

    public s8() {
        rd0 rd0Var = new rd0();
        rd0Var.v = 0L;
        this.a = rd0Var;
        this.b = new tj(0);
        this.c = new r8(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        yl1 yl1Var = new yl1(23, dragEvent);
        int action = dragEvent.getAction();
        mk3 mk3Var = mk3.f;
        tj tjVar = this.b;
        rd0 rd0Var = this.a;
        switch (action) {
            case 1:
                mk2 mk2Var = new mk2();
                pd0 pd0Var = new pd0(yl1Var, rd0Var, mk2Var);
                if (pd0Var.h(rd0Var) == mk3Var) {
                    n32.E(rd0Var, pd0Var);
                }
                boolean z = mk2Var.f;
                tjVar.getClass();
                oj ojVar = new oj(tjVar);
                while (ojVar.hasNext()) {
                    ((rd0) ojVar.next()).t1();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                rd0Var.s1(yl1Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                s sVar = new s(19, yl1Var);
                if (sVar.h(rd0Var) == mk3Var) {
                    n32.E(rd0Var, sVar);
                }
                tjVar.clear();
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                rd0Var.q1();
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                rd0Var.r1();
                break;
        }
        return false;
    }
}
