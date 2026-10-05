package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class dt3 extends ct3 {
    public dt3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var, windowInsets);
    }

    @Override // defpackage.jt3
    public mt3 a() {
        return mt3.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.bt3, defpackage.jt3
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt3)) {
            return false;
        }
        dt3 dt3Var = (dt3) obj;
        return Objects.equals(this.c, dt3Var.c) && Objects.equals(this.g, dt3Var.g) && bt3.M(this.h, dt3Var.h);
    }

    @Override // defpackage.jt3
    public cc0 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new cc0(displayCutout);
    }

    @Override // defpackage.jt3
    public int hashCode() {
        return this.c.hashCode();
    }

    public dt3(mt3 mt3Var, dt3 dt3Var) {
        super(mt3Var, dt3Var);
    }
}
