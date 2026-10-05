package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vi1 implements View.OnTouchListener {
    public final /* synthetic */ wi1 f;

    public vi1(wi1 wi1Var) {
        this.f = wi1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wi1 wi1Var = this.f;
        si1 si1Var = wi1Var.v;
        Handler handler = wi1Var.z;
        fh fhVar = wi1Var.D;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && fhVar != null && fhVar.isShowing() && x >= 0 && x < fhVar.getWidth() && y >= 0 && y < fhVar.getHeight()) {
            handler.postDelayed(si1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(si1Var);
        return false;
    }
}
