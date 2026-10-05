package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ca implements v32 {
    public final String a;
    public final gh3 b;
    public final List c;
    public final List d;
    public final zp0 e;
    public final ua0 f;
    public final bc g;
    public final CharSequence h;
    public final gb1 i;
    public pi j;
    public final boolean k;
    public final int l;
    public final int m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x080a  */
    /* JADX WARN: Type inference failed for: r0v0, types: [ca, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ca(java.lang.String r41, defpackage.gh3 r42, java.util.List r43, java.util.List r44, defpackage.zp0 r45, defpackage.ua0 r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 2267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.<init>(java.lang.String, gh3, java.util.List, java.util.List, zp0, ua0, boolean):void");
    }

    @Override // defpackage.v32
    public final float a() {
        gb1 gb1Var = this.i;
        float f = gb1Var.e;
        TextPaint textPaint = gb1Var.b;
        if (!Float.isNaN(f)) {
            return gb1Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = gb1Var.a;
        lineInstance.setText(new xs(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, s51.t);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new l41(i, next, 1));
            } else {
                l41 l41Var = (l41) priorityQueue.peek();
                if (l41Var != null && l41Var.g - l41Var.f < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new l41(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                c.n();
                return 0.0f;
            }
            l41 l41Var2 = (l41) it.next();
            desiredWidth = Layout.getDesiredWidth(gb1Var.b(), l41Var2.f, l41Var2.g, textPaint);
            while (it.hasNext()) {
                l41 l41Var3 = (l41) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(gb1Var.b(), l41Var3.f, l41Var3.g, textPaint));
            }
        }
        gb1Var.e = desiredWidth;
        return desiredWidth;
    }

    @Override // defpackage.v32
    public final boolean b() {
        pi piVar = this.j;
        if (piVar != null ? piVar.F() : false) {
            return true;
        }
        if (!this.k && oz2.j(this.b)) {
            yl1 yl1Var = rh0.a;
            yl1 yl1Var2 = rh0.a;
            e93 e93VarB = (e93) yl1Var2.g;
            if (e93VarB == null) {
                if (nh0.d()) {
                    e93VarB = yl1Var2.B();
                    yl1Var2.g = e93VarB;
                } else {
                    e93VarB = f80.c0;
                }
            }
            if (((Boolean) e93VarB.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.v32
    public final float c() {
        return this.i.c();
    }
}
